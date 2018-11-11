package com.github.galleyltd.boost.domain.service

import com.github.galleyltd.boost.domain.AccountChecks
import com.github.galleyltd.boost.domain.SubmitResult
import com.github.galleyltd.boost.domain.util.NotFoundException
import java.time.Instant
import java.util.concurrent.TimeUnit

class BoostDetectionService(
    private val dataService: DataService,
    private val queueService: InMemoryQueueService
) {
    fun submitAccountCheck(accountId: Long): SubmitResult {
        return if (canSubmitNew(accountId)) {
            queueService.submitTask(accountId)
            SubmitResult.ACCEPTED
        } else {
            SubmitResult.DENIED
        }
    }

    fun getAccountChecks(accountId: Long): AccountChecks {
        return dataService.getAccountChecks(accountId) ?: throw NotFoundException()
    }

    private fun canSubmitNew(accountId: Long): Boolean {
        try {
            val checkResults = dataService.getAccountChecks(accountId)?.checkResults
            if (checkResults.isNullOrEmpty()) {
                return true
            }
            val nowMinusShift = Instant.now().minusSeconds(TimeUnit.MINUTES.toSeconds(15))
            val latestCheckDate = checkResults[0].checkDate
            return latestCheckDate.isBefore(nowMinusShift)
        } catch (e: NotFoundException) {
            return true
        }
    }
}
