package com.github.galleyltd.boost.storage

import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import io.lettuce.core.*
import io.lettuce.core.api.StatefulRedisConnection
import io.lettuce.core.pubsub.StatefulRedisPubSubConnection

object RedisStorageClient {
    private val client = RedisClient.create("redis://localhost:6379/0")
    val objectMapper = ObjectMapper()
        .enable(MapperFeature.USE_ANNOTATIONS)

    private var connection: StatefulRedisConnection<String, String>? = null
    private var pubSubConnection: StatefulRedisPubSubConnection<String, String>? = null

    fun connect() {
        connection = client.connect()
        pubSubConnection = client.connectPubSub()
    }

    fun disconnect() {
        connection?.close()
        pubSubConnection?.close()
        client.shutdown()
    }

    fun setKeyValue(key: String, value: String) {
        connection?.sync()?.set(key, value)
    }

    inline fun <reified T> setKeyValue(key: String, value: T) {
        val contentValue = objectMapper.writeValueAsString(value)
        setKeyValue(key, contentValue)
    }

    fun getKeyValue(key: String) : String? {
        return connection?.sync()?.get(key)
    }

    inline fun <reified T> getKeyValue(key: String) : T? {
        val contentValue: String? = getKeyValue(key)
        if (contentValue != null) {
            return objectMapper.readValue(contentValue, T::class.java)
        }
        return null
    }
}
