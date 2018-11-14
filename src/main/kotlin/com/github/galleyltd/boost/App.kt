package com.github.galleyltd.boost

import com.fasterxml.jackson.databind.SerializationFeature
import com.github.galleyltd.boost.di.KoinContainer
import com.github.galleyltd.boost.domain.util.NotFoundException
import io.ktor.application.Application
import io.ktor.application.ApplicationStopped
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.CORS
import io.ktor.features.CallLogging
import io.ktor.features.ContentNegotiation
import io.ktor.features.StatusPages
import io.ktor.http.HttpStatusCode
import io.ktor.jackson.jackson
import io.ktor.locations.Location
import io.ktor.locations.Locations
import io.ktor.locations.get
import io.ktor.locations.post
import io.ktor.response.respond
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import org.slf4j.event.Level

@Location("/accounts/{accountId}/checks")
data class ChecksRequest(val accountId: Long)

private val koinContainer = KoinContainer().also { it.init() }
private val boostDetectionService = koinContainer.boostDetectionService
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
    install(CORS) {
        host("galleyltd.github.io", listOf("https"))
    }
    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }
    install(StatusPages) {
        exception<NotFoundException> {
            call.respond(HttpStatusCode.NotFound)
        }
    }
    routing {
        get<ChecksRequest> {
            call.respond(boostDetectionService.getAccountChecks(it.accountId))
        }
        post<ChecksRequest> {
            boostDetectionService.submitAccountCheck(it.accountId)
            call.respond(HttpStatusCode.Accepted)
        }
    }

    environment.monitor.subscribe(ApplicationStopped) {
        koinContainer.tearDown()
    }
}
