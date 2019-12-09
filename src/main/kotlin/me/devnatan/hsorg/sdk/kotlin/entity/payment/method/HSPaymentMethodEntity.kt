package me.devnatan.hsorg.sdk.kotlin.entity.payment.method

import kotlinx.serialization.Serializable
import me.devnatan.hsorg.sdk.kotlin.types.payment.method.HSPaymentMethod

@Serializable
data class HSPaymentMethodEntity(
        override val id: String,
        override val name: String,
        override val status: String,
        override val url: String
) : HSPaymentMethod