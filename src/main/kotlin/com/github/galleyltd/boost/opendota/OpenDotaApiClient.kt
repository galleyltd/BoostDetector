package com.github.galleyltd.boost.opendota

import com.github.galleyltd.boost.opendota.dto.MatchData
import com.github.galleyltd.boost.opendota.dto.MatchPreviewData
import com.github.galleyltd.boost.opendota.dto.SearchData
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.client.features.json.JacksonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import kotlinx.coroutines.delay

object OpenDotaApiClient {
    private const val BASE_URL = "https://api.opendota.com/api"

    private val httpClient = HttpClient(Apache) {
        install(JsonFeature) {
            serializer = JacksonSerializer()
        }
    }

    suspend fun getMatchData(matchId: String) : MatchData? {
        return performApiCall {
            httpClient.get<MatchData>("$BASE_URL/matches/$matchId")
        }
    }

    suspend fun search(query: String) : List<SearchData>? {
        return performApiCall {
            httpClient.get<List<SearchData>>("$BASE_URL/search") {
                parameter("q", query)
            }
        }
    }

    suspend fun getMatchesForPlayer(steamAccountId: String, limit: Int = 200, offset: Int = 0) : List<MatchPreviewData>? {
        return performApiCall {
            httpClient.get<List<MatchPreviewData>>("$BASE_URL/players/$steamAccountId/matches") {
                parameter("limit", limit)
                parameter("offset", offset)
            }
        }
    }

    private suspend fun <T> performApiCall(action: suspend () -> T) : T? {
        val maxRetries = 3
        for (i in 1..maxRetries) {
            try {
                return action()
            } catch (e: Exception) {
                // log error
                println(e)

                if (i < maxRetries) {
                    delay(i * 1000L)
                }
            }
        }

        return null
    }
}
