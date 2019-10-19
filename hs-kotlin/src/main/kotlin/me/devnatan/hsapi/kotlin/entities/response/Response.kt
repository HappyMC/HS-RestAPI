package me.devnatan.hsapi.kotlin.entities.response

import com.github.kittinunf.fuel.core.ResponseOf
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

typealias ResponseResult<D> = ResponseOf<Response<D>>

@Serializable
data class Response<D>(val message: String?, val code: Int, @Transient val data: D? = null)