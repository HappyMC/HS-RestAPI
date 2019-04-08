package me.devnatan.hsapi.kotlin

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson

data class HSShop(val id: String)

class HSShopVisit

typealias HSShopCredentials = Pair<String, String>

data class HSResponse<out D : Any>(
        val message: String,
        val code: Int,
        val data: D
)

class HSDeserializer<out T : Any> : ResponseDeserializable<HSResponse<T>> {
    override fun deserialize(content: String): HSResponse<T>? {
        return Gson().fromJson(content, HSResponse::class.java) as HSResponse<T>
    }
}