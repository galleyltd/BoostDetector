package com.github.galleyltd.boost.di

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.github.galleyltd.boost.opendota.http.HttpClientFactory
import com.github.galleyltd.boost.opendota.http.OpenDotaApiClient
import com.github.galleyltd.boost.service.ExecutionCounter
import com.github.galleyltd.boost.storage.RedisStorageClient
import com.typesafe.config.ConfigFactory
import io.ktor.config.HoconApplicationConfig
import io.lettuce.core.RedisClient
import org.koin.dsl.module.module
import org.koin.standalone.KoinComponent
import org.koin.standalone.StandAloneContext
import org.koin.standalone.inject

private val appModule = module {
    single { jacksonObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES) }
    module("http") {
        single { ExecutionCounter() }
        single { HttpClientFactory(get()) }
        single { OpenDotaApiClient(get()) }
    }
    module("storage") {
        single {
            val redisHost = System.getenv("REDIS_HOST") ?: "localhost"
            RedisClient.create("redis://$redisHost:6379/0")
        }
        single { RedisStorageClient(get(), get()) }
    }
}

@Suppress("EXPERIMENTAL_API_USAGE")
class KoinContainer : KoinComponent {
    val config: HoconApplicationConfig

    init {
        StandAloneContext.startKoin(listOf(appModule))
        config = HoconApplicationConfig(ConfigFactory.load())
    }

    val redisStorageClient by inject<RedisStorageClient>()
    val openDotaApiClient by inject<OpenDotaApiClient>()
    val port: Int = config.property("ktor.deployment.port").getString().toInt()

    fun init() {
        redisStorageClient.connect()
    }

    fun tearDown() {
        redisStorageClient.disconnect()
    }
}
