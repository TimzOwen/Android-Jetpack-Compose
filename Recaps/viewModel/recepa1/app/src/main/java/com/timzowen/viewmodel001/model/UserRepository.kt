package com.timzowen.viewmodel001.model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun fetchUserData() : UserData{
        delay(2000)
        return UserData("Timz",40)
    }

    suspend fun fetchParking(): ParkingSlots{
        delay(2000)
        return ParkingSlots(3,"BMW")
    }
}