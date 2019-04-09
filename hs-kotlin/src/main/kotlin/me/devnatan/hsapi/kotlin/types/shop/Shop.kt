@file:ContextualSerialization(Shop::class)
package me.devnatan.hsapi.kotlin.types.shop

import kotlinx.serialization.ContextualSerialization
import kotlinx.serialization.Serializable

@Serializable data class Shop(
        val id: String,
        val name: String,
        val description: String,
        val owner: String,
        val online: Boolean,
        val category: String,
        val settings: Settings,
        val data: Data
) {

    @Serializable
    data class Settings(val template: String)

    @Serializable
    data class Data(val createdIn: Long, val lastUpdated: Long, val logo: Logo)

    @Serializable
    data class Logo(val fileName: String, val fileSize: Long, val code: String)

}