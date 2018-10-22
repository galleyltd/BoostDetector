package com.github.galleyltd.boost

import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.server.netty.*
import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.features.CallLogging
import io.ktor.features.ContentNegotiation
import io.ktor.http.*
import io.ktor.jackson.jackson
import io.ktor.locations.Location
import io.ktor.locations.Locations
import io.ktor.locations.get
import io.ktor.response.*
import io.ktor.server.engine.*
import io.swagger.client.apis.MatchesApi
import io.swagger.client.infrastructure.ClientException
import io.swagger.client.infrastructure.ServerException
import io.swagger.client.models.Inline_response_200
import org.slf4j.event.Level
import java.util.*

private val random = Random()

@Location("/detector/{playerId}")
data class BoostDetectionRequest(val playerId: Int)

fun main() {
    embeddedServer(Netty, 8080) {
        install(Locations)
        install(CallLogging) {
            level = Level.INFO
        }
        install(ContentNegotiation) {
            jackson {
                enable(SerializationFeature.INDENT_OUTPUT)
            }
        }
        routing {
            get<BoostDetectionRequest> { boostDetectionRequest ->
                call.respondText(
                    "probability that player, id=${boostDetectionRequest.playerId} is booster = ${random.nextDouble()}",
                    ContentType.Text.Html
                )
            }
            get("/") {
                val apiInstance = MatchesApi()
                val matchId = "271145478" // kotlin.Int |
                try {
                    val result = apiInstance.matchesMatchIdGet(matchId)
                    println(result)
                } catch (e: ClientException) {
                    println("4xx response calling MatchesApi#matchesMatchIdGet")
                    e.printStackTrace()
                } catch (e: ServerException) {
                    println("5xx response calling MatchesApi#matchesMatchIdGet")
                    e.printStackTrace()
                }
                call.respondText("Hello, world!", ContentType.Text.Html)
            }
        }
    }.start(wait = true)
}
