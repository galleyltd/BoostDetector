package com.github.galleyltd.boost.domain.service

import com.github.galleyltd.boost.domain.PlayerChecks
import com.github.galleyltd.boost.domain.SubmitResult
import com.github.galleyltd.boost.domain.opendota.dto.MatchData
import com.github.galleyltd.boost.domain.opendota.http.OpenDotaApiClient
import com.github.galleyltd.boost.domain.util.NotFoundException
import com.github.galleyltd.boost.storage.RedisStorageClient
import java.time.Instant
import java.util.concurrent.TimeUnit

class BoostDetectionService(
    private val openDotaApiClient: OpenDotaApiClient,
    private val redisStorageClient: RedisStorageClient
) {
    suspend fun getMatchData(matchId: Long): MatchData {
        var matchData = redisStorageClient.get<MatchData>(matchId)
        if (matchData == null) {
            matchData = openDotaApiClient.getMatchData(matchId)
            redisStorageClient.set(matchId, matchData)
        }
        return matchData
    }

    fun getPlayerChecks(playerId: Long): PlayerChecks {
        return redisStorageClient.get<PlayerChecks>(playerId) ?: throw NotFoundException()
    }

    fun submitPlayerCheck(playerId: Long): SubmitResult {
        return if (canSubmitNew(playerId)) {
            // TODO: register task
            SubmitResult.ACCEPTED
        } else {
            SubmitResult.DENIED
        }
    }

    private fun canSubmitNew(playerId: Long): Boolean {
        try {
            val checkResults = getPlayerChecks(playerId).checkResults
            if (checkResults.isEmpty()) {
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
