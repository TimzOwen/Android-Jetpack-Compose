package com.timzowen.myapplication.model

data class Room(
    val roomNumber: String,
    val roomCost: String,
    val roomImage: String,
    val roomService: Boolean
)

fun getRooms(): List<Room> {
    return listOf(
        Room(
            roomNumber = "101",
            roomCost = "120.00",
            roomImage = "https://via.placeholder.com/150",
            roomService = true
        ),
        Room(
            roomNumber = "102",
            roomCost = "150.00",
            roomImage = "https://example.com/images/room_102.jpg",
            roomService = true
        ),
        Room(
            roomNumber = "103",
            roomCost = "90.00",
            roomImage = "https://example.com/images/room_103.jpg",
            roomService = false
        ),
        Room(
            roomNumber = "104",
            roomCost = "200.00",
            roomImage = "https://example.com/images/room_104.jpg",
            roomService = true
        ),
        Room(
            roomNumber = "105",
            roomCost = "80.00",
            roomImage = "https://example.com/images/room_105.jpg",
            roomService = false
        ),
        Room(
            roomNumber = "201",
            roomCost = "140.00",
            roomImage = "https://example.com/images/room_201.jpg",
            roomService = true
        ),
        Room(
            roomNumber = "202",
            roomCost = "130.00",
            roomImage = "https://example.com/images/room_202.jpg",
            roomService = false
        ),
        Room(
            roomNumber = "203",
            roomCost = "170.00",
            roomImage = "https://example.com/images/room_203.jpg",
            roomService = true
        ),
        Room(
            roomNumber = "204",
            roomCost = "110.00",
            roomImage = "https://example.com/images/room_204.jpg",
            roomService = true
        ),
        Room(
            roomNumber = "205",
            roomCost = "95.00",
            roomImage = "https://example.com/images/room_205.jpg",
            roomService = false
        )
    )
}