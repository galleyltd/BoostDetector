package com.github.galleyltd.boost.domain.api.http

import com.fasterxml.jackson.databind.DeserializationFeature
import com.github.galleyltd.boost.domain.util.ExecutionCounter
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.client.features.json.JacksonSerializer
import io.ktor.client.features.json.JsonFeature
import org.apache.http.HttpHost
import java.util.*

class HttpClientFactory(private val executionCounter: ExecutionCounter) {
    private val serializer = JacksonSerializer(
        block = {
            disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
        }
    )
    private val proxyList: List<Pair<String, Int>> =
        this::class.java.classLoader
            .getResourceAsStream("proxies")
            .bufferedReader()
            .useLines { it.toList() }
            .map {
                val proxyDefinition = it.trim().split("\t")
                Pair(proxyDefinition[0], proxyDefinition[1].toInt())
            }

    private var currentProxyPosition = Random().nextInt(proxyList.size)

    fun nextHttpClient(): HttpClient {
        if (executionCounter.shouldExecuteDefault()) {
            return HttpClient(Apache) {
                install(JsonFeature) {
                    serializer = this@HttpClientFactory.serializer
                }
            }
        } else {
            return HttpClient(Apache) {
                engine {
                    customizeClient {
                        setProxy(getNextProxy())
                    }
                }
                install(JsonFeature) {
                    serializer = this@HttpClientFactory.serializer
                }
            }
        }
    }

    private fun getNextProxy(): HttpHost {
        currentProxyPosition = (currentProxyPosition + 1) % proxyList.size
        val (proxyHost, proxyPort) = proxyList[currentProxyPosition]
        return HttpHost(proxyHost, proxyPort)
    }
}
