package com.timzowen.productmvvm.store.data.mapper

import coil.network.HttpException
import com.timzowen.productmvvm.store.domain.model.ApiError
import com.timzowen.productmvvm.store.domain.model.NetworkError
import okio.IOException

fun Throwable.toNetworkError(): NetworkError{
    val error = when(this){
        is IOException -> ApiError.NetworkError
        is HttpException -> ApiError.UnknownResponse
        else -> ApiError.UnknownError
    }

    return NetworkError(
        error = error,
        t = this
    )
}