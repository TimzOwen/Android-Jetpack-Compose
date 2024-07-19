package com.timzowen.recipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// build the base url
private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

// create the service repose from retrofit in the api class
val recipeService = retrofit.create(ApiService::class.java)

// build the get service End point
interface ApiService {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse
}
