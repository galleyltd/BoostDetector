package com.github.galleyltd.boost.opendota.http

import com.github.galleyltd.boost.opendota.dto.MatchData
import com.github.galleyltd.boost.opendota.dto.MatchPreviewData
import io.ktor.client.HttpClient
import io.ktor.client.features.BadResponseStatus
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.http.HttpStatusCode

private const val BASE_URL = "https://api.opendota.com/api"

class OpenDotaApiClient(private val httpClientFactory: HttpClientFactory) {
    private var httpClient: HttpClient = httpClientFactory.nextHttpClient()

    suspend fun getMatchData(matchId: String): MatchData {
        return performApiCall {
            httpClient.get<MatchData>("$BASE_URL/matches/$matchId")
        }
    }

    suspend fun getMatchesForPlayer(
        steamAccountId: String,
        limit: Int = 200,
        offset: Int = 0
    ): List<MatchPreviewData> {
        return performApiCall {
            httpClient.get<List<MatchPreviewData>>("$BASE_URL/players/$steamAccountId/matches") {
                parameter("limit", limit)
                parameter("offset", offset)
            }
        }
    }

    private suspend fun <T> performApiCall(action: suspend () -> T): T {
        while (true) {
            try {
                return action()
            } catch (e: BadResponseStatus) {
                if (e.statusCode.value == HttpStatusCode.TooManyRequests.value) {
                    httpClient = httpClientFactory.nextHttpClient()
                } else {
                    throw e
                }
            }
        }
    }
}
