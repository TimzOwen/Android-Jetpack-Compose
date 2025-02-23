package com.timzowen.mvvmr3.router

import kotlinx.coroutines.delay

class RouterRepository {
    suspend fun getRouterDetails(): Router{
        delay(2000)
        return Router(
            "Tibco",
            "Huawei",
            30,
            4500F
        )
    }
}