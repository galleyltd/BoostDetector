package com.github.galleyltd.boost.opendota.http

import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.client.features.json.JacksonSerializer
import io.ktor.client.features.json.JsonFeature
import org.apache.http.HttpHost
import java.io.File
import java.util.*

object HttpClientFactory {
    private const val changesBeforeNoProxy = 5
    private var currentChanges = 0

    private val proxyList: List<Pair<String, Int>> =
        File(this::class.java.classLoader.getResource("proxies").toURI()).useLines { it.toList() }.map {
            val proxyDefinition = it.trim().split("\t")
            Pair(proxyDefinition[0], proxyDefinition[1].toInt())
        }

    private var currentProxyPosition = Random().nextInt(proxyList.size)

    fun nextHttpClient(): HttpClient {
        if (currentChanges == 0) {
            currentChanges++
            return HttpClient(Apache) {
                install(JsonFeature) {
                    serializer = JacksonSerializer()
                }
            }
        } else {
            currentChanges++
            if (currentChanges == changesBeforeNoProxy) currentChanges = 0
            currentProxyPosition = (currentProxyPosition + 1) % proxyList.size
            return HttpClient(Apache) {
                engine {
                    customizeClient {
                        setProxy(getNextProxy())
                    }
                }
                install(JsonFeature) {
                    serializer = JacksonSerializer()
                }
            }
        }
    }

    private fun getNextProxy(): HttpHost {
        val (proxyHost, proxyPort) = proxyList[currentProxyPosition]
        return HttpHost(proxyHost, proxyPort)
    }
}
