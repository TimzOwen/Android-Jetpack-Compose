package com.timzowen.movier1.navigation

enum class MovieScreens {
    HomeScreen,
    DetailsScreen;

    companion object {
        fun appRoute(route: String?): MovieScreens =
            when(route?.substringBefore("/")){
                HomeScreen.name -> HomeScreen
                DetailsScreen.name -> DetailsScreen
                null -> HomeScreen
                else -> throw IllegalArgumentException("Route $route not found")
        }
    }
}