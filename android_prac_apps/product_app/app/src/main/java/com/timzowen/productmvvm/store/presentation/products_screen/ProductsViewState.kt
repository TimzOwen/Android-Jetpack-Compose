package com.timzowen.productmvvm.store.presentation.products_screen

import com.timzowen.productmvvm.store.domain.model.Product

data class ProductsViewState (
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String? = null
)

