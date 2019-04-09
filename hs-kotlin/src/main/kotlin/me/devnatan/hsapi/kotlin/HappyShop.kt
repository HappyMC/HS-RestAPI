package me.devnatan.hsapi.kotlin

import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.core.Parameters
import com.github.kittinunf.fuel.coroutines.awaitObjectResponse
import com.github.kittinunf.fuel.serialization.kotlinxDeserializerOf
import kotlinx.serialization.internal.ArrayListSerializer
import kotlinx.serialization.json.Json
import me.devnatan.hsapi.kotlin.types.response.Response
import me.devnatan.hsapi.kotlin.types.response.ResponseResult
import me.devnatan.hsapi.kotlin.types.shop.Shop

object HappyShop {

    var PATH = "https://api.XXX.net/v1"
    var API_TOKEN = "???"

    private val service by lazy {
        FuelManager.instance.apply {
            basePath = PATH
            baseHeaders = mapOf("Authorization" to API_TOKEN)
        }
    }

    /**
     * Make a request to get all stores in the server.
     * You can set a limit on how many stores will be displayed in [optionalParameters]
     *
     * Optional Parameters:
     * "limit" = limit of stores to display, default is 20
     *
     * Request:
     * `method` = GET
     * `path` = /shops
     *
     * @return [ResponseResult]
     */
    suspend fun getShops(optionalParameters: Parameters = listOf("limit" to 20)): ResponseResult<List<Shop>> {
        return service.get("/shops", parameters = optionalParameters).awaitObjectResponse(kotlinxDeserializerOf(Response.serializer(ArrayListSerializer(Shop.serializer())), Json.nonstrict))
    }

}