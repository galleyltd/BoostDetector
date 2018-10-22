package io.swagger.client.infrastructure

import com.squareup.moshi.*
import java.io.IOException
import java.math.BigDecimal
import java.util.*

internal class BigDecimalAdapter : JsonAdapter<BigDecimal>() {

    @Throws(IOException::class)
    override fun fromJson(reader: JsonReader): BigDecimal? {
        if (reader.peek() == JsonReader.Token.NULL) return reader.nextNull()
        return BigDecimal(reader.nextString())
    }

    @Throws(IOException::class)
    override fun toJson(writer: JsonWriter, value: BigDecimal?) {
        if (value == null) {
            writer.value("")
        } else {
            writer.value(value.toPlainString())
        }
    }
}

object Serializer {
    @JvmStatic
    val moshi: Moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .add(Date::class.java, Rfc3339DateJsonAdapter().nullSafe())
            .add(BigDecimal::class.java, BigDecimalAdapter().nullSafe())
            .build()
}
