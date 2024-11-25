package com.timzowen.myapplication.navigation


enum class RestaurantScreens{
    MenuScreen,
    HomeScreen,
    RoomsScreen;

    companion object{
        fun restaurantRoutes(route: String?) : RestaurantScreens =
            when(route?.substringBefore("/")){
                MenuScreen.name -> MenuScreen
                HomeScreen.name -> HomeScreen
                RoomsScreen.name -> RoomsScreen
                null -> MenuScreen
                else -> throw IllegalArgumentException("$route not does not  exist")
        }
    }
}