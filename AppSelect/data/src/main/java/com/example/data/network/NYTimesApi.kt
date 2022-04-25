package com.example.data.network


import com.example.domain.models.MovieList
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTimesApi {

    @GET("all.json")
    suspend fun getDataFromAPI(@Query("offset") offset: Int, @Query("api-key") key: String): MovieList
}
