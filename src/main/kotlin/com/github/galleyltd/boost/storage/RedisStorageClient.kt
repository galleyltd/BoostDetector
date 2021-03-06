package com.github.galleyltd.boost.storage

import com.fasterxml.jackson.databind.ObjectMapper
import io.lettuce.core.RedisClient
import io.lettuce.core.api.StatefulRedisConnection

class RedisStorageClient(
    private val client: RedisClient,
    @PublishedApi internal val objectMapper: ObjectMapper
) {
    @PublishedApi
    internal lateinit var connection: StatefulRedisConnection<String, String>

    fun connect() {
        connection = client.connect()
    }

    fun disconnect() {
        connection.close()
        client.shutdown()
    }

    inline fun <reified T> set(key: Any, value: T) {
        val contentValue = objectMapper.writeValueAsString(value)
        connection.sync().set(constructKey<T>(key), contentValue)
    }

    inline fun <reified T> get(key: Any): T? {
        val contentValue: String? = connection.sync().get(constructKey<T>(key))
        return contentValue?.let { objectMapper.readValue(contentValue, T::class.java) }
    }

    @PublishedApi
    internal inline fun <reified T> constructKey(id: Any) = "${T::class.java.simpleName}_$id"
}
