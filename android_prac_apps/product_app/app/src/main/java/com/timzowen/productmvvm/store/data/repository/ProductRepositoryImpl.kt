package com.timzowen.productmvvm.store.data.repository

import arrow.core.Either
import com.timzowen.productmvvm.store.data.mapper.toNetworkError
import com.timzowen.productmvvm.store.data.remote.ProductsApi
import com.timzowen.productmvvm.store.domain.model.NetworkError
import com.timzowen.productmvvm.store.domain.model.Product
import com.timzowen.productmvvm.store.domain.repository.ProductRepository

class ProductRepositoryImpl constructor(
    private val productsApi: ProductsApi): ProductRepository {

    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
        return Either.catch {
            productsApi.getProducts()
        }.mapLeft { it.toNetworkError() }
    }

}