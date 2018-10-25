package com.github.galleyltd.boost

import com.fasterxml.jackson.databind.SerializationFeature
import com.github.galleyltd.boost.opendota.OpenDotaApiClient
import com.github.galleyltd.boost.opendota.dto.MatchData
import com.github.galleyltd.boost.storage.RedisStorageClient
import io.ktor.application.ApplicationStopped
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.jackson.jackson
import io.ktor.locations.Location
import io.ktor.locations.Locations
import io.ktor.locations.get
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import org.slf4j.event.Level
import java.util.*

private val random = Random()

@Location("/detector/{playerId}")
data class BoostDetectionRequest(val playerId: Int)

@Location("/match/{matchId}")
data class MatchDataRequest(val matchId: String)

fun main() {
    RedisStorageClient.connect()

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
                call.respondText("Hello, world!", ContentType.Text.Html)
            }
            get<MatchDataRequest> { matchDataRequest ->
                val matchData = OpenDotaApiClient.getMatchData(matchDataRequest.matchId)
                if (matchData == null) {
                    call.respond(HttpStatusCode.InternalServerError)
                } else {
                    RedisStorageClient.setKeyValue("test", matchData)
                    val redisMatchData = RedisStorageClient.getKeyValue<MatchData>("test")
                    if (redisMatchData != null) call.respond(redisMatchData) else call.respond(matchData)
                }
            }
        }

        environment.monitor.subscribe(ApplicationStopped) {
            RedisStorageClient.disconnect()
        }

    }.start(wait = true)
}
