package com.github.galleyltd.boost.storage

import com.fasterxml.jackson.databind.ObjectMapper
import io.lettuce.core.RedisClient
import io.lettuce.core.api.StatefulRedisConnection
import io.lettuce.core.pubsub.StatefulRedisPubSubConnection

class RedisStorageClient(
    private val client: RedisClient,
    @PublishedApi internal val objectMapper: ObjectMapper
) {
    private lateinit var connection: StatefulRedisConnection<String, String>
    private lateinit var pubSubConnection: StatefulRedisPubSubConnection<String, String>

    fun connect() {
        connection = client.connect()
        pubSubConnection = client.connectPubSub()
    }

    fun disconnect() {
        connection.close()
        pubSubConnection.close()
        client.shutdown()
    }

    fun setKeyValue(key: String, value: String) {
        connection.sync().set(key, value)
    }

    inline fun <reified T> setKeyValue(key: String, value: T) {
        val contentValue = objectMapper.writeValueAsString(value)
        setKeyValue(key, contentValue)
    }

    fun getKeyValue(key: String): String? {
        return connection.sync().get(key)
    }

    inline fun <reified T> getKeyValue(key: String): T? {
        val contentValue: String? = getKeyValue(key)
        return contentValue?.let { objectMapper.readValue(contentValue, T::class.java) }
    }
}
