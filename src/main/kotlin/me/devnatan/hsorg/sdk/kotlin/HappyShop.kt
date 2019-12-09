package me.devnatan.hsorg.sdk.kotlin

import com.github.kittinunf.fuel.core.*
import com.github.kittinunf.fuel.core.requests.CancellableRequest
import com.github.kittinunf.fuel.serialization.responseObject
import com.github.kittinunf.result.Result
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import kotlinx.serialization.list
import me.devnatan.hsorg.sdk.kotlin.entity.payment.method.HSPaymentMethodEntity
import me.devnatan.hsorg.sdk.kotlin.entity.store.HSStoreEntity
import me.devnatan.hsorg.sdk.kotlin.types.payment.method.HSPaymentMethod
import me.devnatan.hsorg.sdk.kotlin.types.store.HSStore

typealias HSCallback<T> = (Request, Response, Result<T, FuelError>) -> Unit

@Serializable
data class HSError(
        val code: Int,
        val message: String
)

class HappyShop(
        private val accessKey: String,
        private val secretKey: String,
        val endpoint: String
) {

    private val service = FuelManager.instance.apply {
        basePath = endpoint
        baseHeaders = mapOf(
                Headers.CONTENT_TYPE to "application/json",
                "X-API-AccessKey" to accessKey,
                "X-API-Secret" to secretKey
        )
    }

    @JvmOverloads
    fun getPaymentMethods(parameters: Parameters? = null, handler: HSCallback<List<HSPaymentMethod>>): CancellableRequest {
        return service.get("/payment_methods", parameters).responseObject(HSPaymentMethodEntity.serializer().list, Json.nonstrict, handler)
    }

    @JvmOverloads
    fun getStore(name: String, parameters: Parameters? = null, handler: HSCallback<HSStore>): CancellableRequest {
        return service.get("/stores/$name", parameters).responseObject(HSStoreEntity.serializer(), Json.nonstrict, handler)
    }

    fun toHSError(error: FuelError): HSError {
        return Json(JsonConfiguration.Stable).parse(HSError.serializer(), error.response.body().asString("application/json"))
    }

}