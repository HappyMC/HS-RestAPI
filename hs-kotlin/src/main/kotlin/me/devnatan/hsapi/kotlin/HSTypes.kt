package me.devnatan.hsapi.kotlin

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.github.kittinunf.fuel.core.ResultHandler
import com.google.gson.Gson

data class HSResponse<out D : Any>(
        val message: String,
        val code: Int,
        val data: D
)

typealias HSHandler<D> = ResultHandler<HSResponse<D>>

class HSDeserializer<out T : Any> : ResponseDeserializable<HSResponse<T>> {
    override fun deserialize(content: String): HSResponse<T>? {
        return Gson().fromJson(content, HSResponse::class.java) as HSResponse<T>
    }
}

data class HSShop(val id: String)

open class HSShopClient(open val address: String)

open class HSShopVisit(override val address: String) : HSShopClient(address)

data class HSShopProduct(val id: String, val name: String)

data class HSShopPayment(val id: String,
                         val payer: String,
                         val product: HSShopProduct,
                         val gateway: HSShopPaymentGateway)

data class HSShopPaymentGateway(val id: String, val name: String)