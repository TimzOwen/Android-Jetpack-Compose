package com.timzowen.recap4.model

import kotlinx.coroutines.delay

class CustomerRepository {

    suspend fun fetchCustomerData(): Customer{
        delay(2500)
        return Customer(
            "Timothy",
            "Nairobi",
            544
        )
    }
}