package com.timzowen.mvvmr2.model

import kotlinx.coroutines.delay

class IprsRepository {

    suspend fun fetchUserData(): Iprs{
        delay(2000)
        return Iprs("Timz Owen", 500.50)
    }

    suspend fun fetchScore(): SecurityScore{
        delay(1500)
        return SecurityScore("Hacker",5)
    }
}