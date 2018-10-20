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
import org.slf4j.event.Level
import java.util.*

private val random = Random()

@Location("/detector/{playerId}")
data class BoostDetectionRequest(val playerId: Int)

fun main(args: Array<String>) {
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
        }
    }.start(wait = true)
}
