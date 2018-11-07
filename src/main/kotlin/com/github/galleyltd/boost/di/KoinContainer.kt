package com.github.galleyltd.boost.di

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.github.galleyltd.boost.domain.opendota.http.HttpClientFactory
import com.github.galleyltd.boost.domain.opendota.http.OpenDotaApiClient
import com.github.galleyltd.boost.domain.service.AnalysisSerivce
import com.github.galleyltd.boost.domain.service.BoostDetectionService
import com.github.galleyltd.boost.domain.service.SimpleAnalysisService
import com.github.galleyltd.boost.domain.util.ExecutionCounter
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
    single { BoostDetectionService(get(), get()) }
    single { ExecutionCounter() }
    single { HttpClientFactory(get()) }
    single { OpenDotaApiClient(get()) }
    single {
        val redisHost = System.getenv("REDIS_HOST") ?: "localhost"
        RedisClient.create("redis://$redisHost:6379/0")
    }
    single { RedisStorageClient(get(), get()) }
    single { SimpleAnalysisService() as AnalysisSerivce }
}

@Suppress("EXPERIMENTAL_API_USAGE")
class KoinContainer : KoinComponent {
    private val config = HoconApplicationConfig(ConfigFactory.load())

    init {
        StandAloneContext.startKoin(listOf(appModule))
    }

    val analysisService by inject<AnalysisSerivce>()
    val boostDetectionService by inject<BoostDetectionService>()
    val port: Int = config.property("ktor.deployment.port").getString().toInt()

    private val redisStorageClient by inject<RedisStorageClient>()

    fun init() {
        redisStorageClient.connect()
    }

    fun tearDown() {
        redisStorageClient.disconnect()
    }
}
