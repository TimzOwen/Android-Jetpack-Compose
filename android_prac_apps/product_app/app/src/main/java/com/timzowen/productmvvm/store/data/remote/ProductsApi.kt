package com.timzowen.productmvvm.store.data.remote

import com.timzowen.productmvvm.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts(): List<Product>
}