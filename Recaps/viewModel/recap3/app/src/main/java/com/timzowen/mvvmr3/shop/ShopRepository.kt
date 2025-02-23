package com.timzowen.mvvmr3.shop

import kotlinx.coroutines.delay

class ShopRepository {

    suspend fun getShopDetails(): Shop{
        delay(2000)
        return Shop(
            "Sarit Center",
            "Westlands",
            22
        )
    }
}