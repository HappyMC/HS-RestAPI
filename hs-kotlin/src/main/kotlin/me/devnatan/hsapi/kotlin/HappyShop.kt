package me.devnatan.hsapi.kotlin

import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.core.requests.CancellableRequest
import com.github.kittinunf.fuel.core.response

class HappyShop(private val path: String,
                private val apiToken: String) {

    companion object {

        val instance: HappyShop by lazy {
            HappyShop("https://api.XXX.net/v1", "?")
        }

    }

    private val fuel: FuelManager = FuelManager.instance.apply {
        basePath = path
        baseHeaders = mapOf("Authorization" to apiToken)
    }

    /**
     * TODO: doc
     * @return CancellableRequest
     */
    fun getShops(handler: HSHandler<Array<HSShop>>): CancellableRequest {
        return fuel.get("/shops").response(HSDeserializer(), handler)
    }

    /**
     * TODO: doc
     * @return CancellableRequest
     */
    fun getShop(id: String, handler: HSHandler<HSShop>): CancellableRequest {
        return fuel.get("/shops/$id").response(HSDeserializer(), handler)
    }

    /**
     * TODO: doc
     * @return CancellableRequest
     */
    fun getShopVisits(id: String, credentials: String, handler: HSHandler<Array<HSShopVisit>>): CancellableRequest {
        return fuel.get("/shops/$id/visits", listOf("credentials" to credentials)).response(HSDeserializer(), handler)
    }

    /**
     * TODO: doc
     * @return CancellableRequest
     */
    fun getShopProducts(id: String, credentials: String, handler: HSHandler<Array<HSShopVisit>>): CancellableRequest {
        return fuel.get("/shops/$id/products", listOf("credentials" to credentials)).response(HSDeserializer(), handler)
    }

}