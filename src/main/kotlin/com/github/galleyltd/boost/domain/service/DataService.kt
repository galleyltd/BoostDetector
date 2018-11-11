package com.github.galleyltd.boost.domain.service

import com.github.galleyltd.boost.domain.AccountChecks
import com.github.galleyltd.boost.domain.api.dto.MatchData
import com.github.galleyltd.boost.domain.api.dto.MatchPreviewData
import com.github.galleyltd.boost.domain.api.http.ApiClient
import com.github.galleyltd.boost.storage.RedisStorageClient

class DataService(
    private val apiClient: ApiClient,
    private val redisStorageClient: RedisStorageClient
) {
    suspend fun getMatchData(matchId: Long): MatchData {
        var matchData = redisStorageClient.get<MatchData>(matchId)
        if (matchData == null) {
            matchData = apiClient.getMatchData(matchId)
            redisStorageClient.set(matchId, matchData)
        }
        return matchData
    }

    suspend fun getMatchList(
        accountId: Long,
        limit: Int = 200,
        offset: Int = 0
    ): List<MatchPreviewData> {
        return apiClient.getRankedMatches(accountId, limit, offset)
    }

    fun saveCheckResult(accountFeedback: AccountFeedback) {
        var accountChecks = getAccountChecks(accountFeedback.accountId)
        if (accountChecks == null) {
            accountChecks = AccountChecks()
        }
        accountChecks.appendCheck(accountFeedback)
        redisStorageClient.set(accountFeedback.accountId, accountChecks)
    }

    fun getAccountChecks(accountId: Long): AccountChecks? {
        return redisStorageClient.get<AccountChecks>(accountId)
    }
}
