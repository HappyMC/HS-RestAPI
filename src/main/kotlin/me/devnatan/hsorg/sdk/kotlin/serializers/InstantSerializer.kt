package me.devnatan.hsorg.sdk.kotlin.serializers

import kotlinx.serialization.*
import kotlinx.serialization.internal.StringDescriptor
import java.time.Instant

@Serializer(forClass = InstantSerializer::class)
object InstantSerializer : KSerializer<Instant> {

    override val descriptor: SerialDescriptor =
            StringDescriptor.withName("DateSerializer")

    override fun serialize(encoder: Encoder, obj: Instant) {
        encoder.encodeString(obj.toString())
    }

    override fun deserialize(decoder: Decoder): Instant {
        return Instant.parse(decoder.decodeString())
    }

}