package com.github.galleyltd.boost.domain.api.http

import com.fasterxml.jackson.databind.DeserializationFeature
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.client.features.json.JacksonSerializer
import io.ktor.client.features.json.JsonFeature
import org.apache.http.HttpHost

class HttpClientFactory {
    private val clients: MutableList<HttpClient>
    private var current: Int = 0

    init {
        clients = mutableListOf(constructHttpClient(false, Pair("", 0)))
        this::class.java.classLoader
            .getResourceAsStream("proxies")
            .bufferedReader()
            .useLines { it.toList() }
            .map {
                val proxyDefinition = it.trim().replace("\\s+".toRegex(), " ").split(" ")
                Pair(proxyDefinition[0], proxyDefinition[1].toInt())
            }
            .forEach {
                clients.add(constructHttpClient(true, it))
            }
    }

    // TODO: pass exception and remove proxy if the reason is ConnectExcepion
    fun getNextClient(): HttpClient {
        current++
        if (current >= clients.size) current = 0
        return clients[current]
    }

    private fun constructHttpClient(isProxy: Boolean, proxyDefinition: Pair<String, Int>): HttpClient {
        return HttpClient(Apache) {
            engine {
                connectTimeout = 1000
                socketTimeout = 4000
                customizeClient {
                    if (isProxy) setProxy(HttpHost(proxyDefinition.first, proxyDefinition.second))
                    setMaxConnPerRoute(10)
                    setMaxConnTotal(10)
                }
            }
            install(JsonFeature) {
                serializer = JacksonSerializer(
                    block = {
                        disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                    }
                )
            }
        }
    }
}
