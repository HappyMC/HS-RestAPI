@file:UseSerializers(InstantSerializer::class)

package me.devnatan.hsorg.sdk.kotlin.entity.store

import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.UseSerializers
import me.devnatan.hsorg.sdk.kotlin.serializers.InstantSerializer
import me.devnatan.hsorg.sdk.kotlin.types.store.HSStore
import java.time.Instant

@Serializable
data class HSStoreEntity constructor(
        override val id: String,
        override val name: String,
        override val description: String,
        @Transient override val logo: String? = null,
        override val status: String,
        override val createdAt: Instant,
        override val updatedAt: Instant
) : HSStore