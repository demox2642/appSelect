package com.example.domain.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PagedData<T>(
    val status: String?,
    val copyrightString: String?,
    val has_more: Boolean?,
    val num_results: String?,
    var results: List<T>
)

