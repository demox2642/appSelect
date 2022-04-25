package com.example.domain.models

data class MovieList(
    val status: String?,
    val copyrightString: String?,
    val has_more: Boolean?,
    val num_results: String?,
    val results: List<Movie>
)

