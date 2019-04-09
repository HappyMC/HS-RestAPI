package me.devnatan.hsapi.kotlin.types.response

import com.github.kittinunf.fuel.core.ResponseOf
import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable

typealias ResponseResult<D> = ResponseOf<Response<D>>

@Serializable
data class Response<D>(val message: String, val code: Int, @Optional val data: D? = null)