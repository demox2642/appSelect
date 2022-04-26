package com.example.domain.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Movie(
    val display_title: String,
    val summary_short: String,
    val multimedia: Multimedia
)
