package com.github.galleyltd.boost.di

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.github.galleyltd.boost.opendota.http.HttpClientFactory
import com.github.galleyltd.boost.opendota.http.OpenDotaApiClient
import com.github.galleyltd.boost.service.ExecutionCounter
import com.github.galleyltd.boost.storage.RedisStorageClient
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

class KoinContainer : KoinComponent {
    init {
        StandAloneContext.startKoin(listOf(appModule))
    }

    val redisStorageClient by inject<RedisStorageClient>()
    val openDotaApiClient by inject<OpenDotaApiClient>()

    fun init() {
        redisStorageClient.connect()
    }

    fun tearDown() {
        redisStorageClient.disconnect()
    }
}
