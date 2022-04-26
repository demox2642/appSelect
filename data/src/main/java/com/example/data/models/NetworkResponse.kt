package com.example.data.models

import com.squareup.moshi.JsonClass
import java.io.IOException

@JsonClass(generateAdapter = true)
data class NetworkResponse (
    val status: String?,
    val copyrightString: String?,
    val has_more: Boolean?,
    val num_results: String?,
  //  val results: Response

//    /**
//     * Success response with body
//     */
//    @JsonClass(generateAdapter = true)
//    data class Success<T : Any>(val body: T) : NetworkResponse<T>
//
//    sealed class Error : Exception(), NetworkResponse<Nothing> {
//        /**
//         * Failure response with body
//         */
//        @JsonClass(generateAdapter = true)
//        data class ApiError(val body: Response<Any>, val code: Int) : Error()
//
//        /**
//         * Network error
//         */
//        @JsonClass(generateAdapter = true)
//        data class NetworkError(val error: IOException) : Error()
//
//        /**
//         * For example, json parsing error
//         */
//        @JsonClass(generateAdapter = true)
//        data class UnknownError(val error: Throwable?) : Error()
//    }
)
