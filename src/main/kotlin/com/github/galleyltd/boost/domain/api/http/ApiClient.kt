package com.github.galleyltd.boost.domain.api.http

import com.github.galleyltd.boost.domain.api.dto.MatchData
import com.github.galleyltd.boost.domain.api.dto.MatchPreviewData
import io.ktor.client.HttpClient
import io.ktor.client.features.BadResponseStatus
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.http.HttpStatusCode
import org.slf4j.LoggerFactory

private const val BASE_URL = "https://api.opendota.com/api"

class ApiClient(private val httpClientFactory: HttpClientFactory) {
    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)
    }

    private var httpClient: HttpClient = httpClientFactory.getNextClient()

    suspend fun getMatchData(matchId: Long): MatchData {
        return performApiCall {
            httpClient.get<MatchData>("$BASE_URL/matches/$matchId")
        }
    }

    suspend fun getRankedMatches(accountId: Long, limit: Int, offset: Int): List<MatchPreviewData> {
        return performApiCall {
            httpClient.get<List<MatchPreviewData>>("$BASE_URL/players/$accountId/matches") {
                parameter("game_mode", 22)
                parameter("lobby_type", 7)
                parameter("limit", limit)
                parameter("offset", offset)
            }
        }
    }

    private suspend fun <T> performApiCall(action: suspend () -> T): T {
        while (true) {
            try {
                return action()
            } catch (e: Exception) {
                if (shouldSwitchProxy(e)) {
                    log.info("Changing proxy, exception = {}, msg = {}", e.javaClass.name, e.message)
                    httpClient = httpClientFactory.getNextClient()
                } else {
                    throw e
                }
            }
        }
    }

    private fun shouldSwitchProxy(e: Exception): Boolean {
        return when(e) {
            is BadResponseStatus -> e.statusCode.value != HttpStatusCode.NotFound.value
            else -> true
        }
    }
}
