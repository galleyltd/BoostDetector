package com.github.galleyltd.boost.domain.service

import com.github.galleyltd.boost.domain.api.dto.MatchData
import kotlinx.coroutines.*
import org.slf4j.LoggerFactory
import kotlin.system.measureTimeMillis

class TaskProcessingService(
    private val queueService: InMemoryQueueService,
    private val dataService: DataService,
    private val analysisService: AnalysisService,
    private val concurrencyLevel: Int = 10
) {
    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)
    }

    private val queueProcessingContext = newSingleThreadContext("task-processing-pool")
    private val uploadContext = newFixedThreadPoolContext(2, "data-upload-pool")

    fun start() {
        CoroutineScope(queueProcessingContext).launch {
            while (true) {
                proceed()
                delay(500)
            }
        }
    }

    private suspend fun proceed() {
        queueService.getNext()?.let { accountId ->
            val ms = measureTimeMillis {
                log.info("Received task for {}", accountId)
                val matchIds: List<Long> = dataService.getMatchList(accountId).map { it.matchId }
                if (matchIds.isEmpty()) {
                    log.info("No matches found for {}", accountId)
                    return
                }
                log.info("Got match ids for {}, matches = {}", accountId, matchIds)
                val matches = getMatches(matchIds)
                log.info("Got matches for {}", accountId)
                val accountFeedback = analysisService.accountFeedback(matches, accountId)
                log.info("Analysis for {} completed, result is {}", accountId, accountFeedback)
                dataService.saveCheckResult(accountFeedback)
                log.info("Result for {} saved in storage", accountId)
            }
            log.info("Task processing for {} took {} ms", accountId, ms)
        }
    }

    private suspend fun getMatches(matchIds: List<Long>): List<MatchData> {
        val chunks = matchIds.chunked(calculateChunkSize(matchIds.size, concurrencyLevel))
        val deferredList = ArrayList<Deferred<List<MatchData>>>()
        for (chunk in chunks) {
            deferredList += CoroutineScope(uploadContext).async {
                chunk.map { dataService.getMatchData(it) }.toList()
            }
        }
        return deferredList.awaitAll().flatten()
    }

    private fun calculateChunkSize(size: Int, chunksNumber: Int): Int {
        return Math.ceil(size / chunksNumber.toDouble()).toInt()
    }
}
