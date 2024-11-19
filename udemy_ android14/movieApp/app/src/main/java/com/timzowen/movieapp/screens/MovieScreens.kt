package com.timzowen.movieapp.screens

enum class MovieScreens {
    HomeScreen,
    DetailsScreen;
    companion object {
        fun fromRoute(route: String?) : MovieScreens =
            when(route?.substringBefore("/")){
                HomeScreen.name -> HomeScreen
                DetailsScreen.name -> DetailsScreen
                null -> HomeScreen
                else -> throw  IllegalArgumentException("Route $route not found")
            }
    }
}