package com.timzowen.productmvvm.store.domain.repository

import arrow.core.Either
import com.timzowen.productmvvm.store.domain.model.NetworkError
import com.timzowen.productmvvm.store.domain.model.Product

interface ProductRepository {

    suspend fun getProducts(): Either<NetworkError,List<Product>>
}