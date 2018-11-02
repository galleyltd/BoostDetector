package com.github.galleyltd.boost

import com.fasterxml.jackson.databind.SerializationFeature
import com.github.galleyltd.boost.di.KoinContainer
import com.github.galleyltd.boost.opendota.dto.MatchData
import io.ktor.application.Application
import io.ktor.application.ApplicationStopped
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
import io.ktor.locations.Location
import io.ktor.locations.Locations
import io.ktor.locations.get
import io.ktor.response.respond
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import org.slf4j.event.Level

@Location("/match/{matchId}")
data class MatchDataRequest(val matchId: String)

private val koinContainer = KoinContainer().also { it.init() }
private val redisStorageClient = koinContainer.redisStorageClient
private val openDotaApiClient = koinContainer.openDotaApiClient
private val analysisSerivce = koinContainer.analysisService
private val port = koinContainer.port

fun main() {
    embeddedServer(
        Netty,
        port,
        module = Application::boostDetectorModule
    ).start(wait = true)
}

fun Application.boostDetectorModule() {
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
        get<MatchDataRequest> { matchDataRequest ->
            var matchData = redisStorageClient.getKeyValue<MatchData>("test")
            if (matchData == null) {
                matchData = openDotaApiClient.getMatchData(matchDataRequest.matchId)
                redisStorageClient.setKeyValue("test", matchData)
            }
            println(analysisSerivce.accountFeedback(listOf(matchData!!), 23423))
            call.respond(matchData)
        }
    }

    environment.monitor.subscribe(ApplicationStopped) {
        koinContainer.tearDown()
    }
}
