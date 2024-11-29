package com.timzowen.myapplication.model

data class Room(
    val roomNumber: String,
    val roomCost: String,
    val roomImage: List<String>,
    val roomService: Boolean
)

fun getRooms(): List<Room> {
    return listOf(
        Room(
            roomNumber = "101",
            roomCost = "120.00",
            roomImage = listOf("https://images.unsplash.com/photo-1498654156189-bc65b98b06a7?q=80&w=3271&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","https://plus.unsplash.com/premium_photo-1673439304183-8840bd0dc1bf?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            roomService = true
        ),
        Room(
            roomNumber = "102",
            roomCost = "150.00",
            roomImage = listOf("https://images.unsplash.com/photo-1498654156189-bc65b98b06a7?q=80&w=3271&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","https://plus.unsplash.com/premium_photo-1673439304183-8840bd0dc1bf?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            roomService = true
        ),
        Room(
            roomNumber = "103",
            roomCost = "90.00",
            roomImage = listOf("https://images.unsplash.com/photo-1498654156189-bc65b98b06a7?q=80&w=3271&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","https://plus.unsplash.com/premium_photo-1673439304183-8840bd0dc1bf?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            roomService = false
        ),
        Room(
            roomNumber = "104",
            roomCost = "200.00",
            roomImage = listOf("https://images.unsplash.com/photo-1498654156189-bc65b98b06a7?q=80&w=3271&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","https://plus.unsplash.com/premium_photo-1673439304183-8840bd0dc1bf?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            roomService = true
        ),
        Room(
            roomNumber = "105",
            roomCost = "80.00",
            roomImage = listOf("https://images.unsplash.com/photo-1498654156189-bc65b98b06a7?q=80&w=3271&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","https://plus.unsplash.com/premium_photo-1673439304183-8840bd0dc1bf?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            roomService = false
        ),
        Room(
            roomNumber = "201",
            roomCost = "140.00",
            roomImage = listOf("https://images.unsplash.com/photo-1498654156189-bc65b98b06a7?q=80&w=3271&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","https://plus.unsplash.com/premium_photo-1673439304183-8840bd0dc1bf?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            roomService = true
        ),
        Room(
            roomNumber = "202",
            roomCost = "130.00",
            roomImage = listOf("https://images.unsplash.com/photo-1498654156189-bc65b98b06a7?q=80&w=3271&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","https://plus.unsplash.com/premium_photo-1673439304183-8840bd0dc1bf?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            roomService = false
        ),
        Room(
            roomNumber = "203",
            roomCost = "170.00",
            roomImage = listOf("https://images.unsplash.com/photo-1498654156189-bc65b98b06a7?q=80&w=3271&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","https://plus.unsplash.com/premium_photo-1673439304183-8840bd0dc1bf?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            roomService = true
        ),
        Room(
            roomNumber = "204",
            roomCost = "110.00",
            roomImage = listOf("https://images.unsplash.com/photo-1498654156189-bc65b98b06a7?q=80&w=3271&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","https://plus.unsplash.com/premium_photo-1673439304183-8840bd0dc1bf?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            roomService = true
        ),
        Room(
            roomNumber = "205",
            roomCost = "95.00",
            roomImage = listOf("https://images.unsplash.com/photo-1498654156189-bc65b98b06a7?q=80&w=3271&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","https://plus.unsplash.com/premium_photo-1673439304183-8840bd0dc1bf?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            roomService = false
        )
    )
}