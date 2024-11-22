package com.timzowen.movieapp.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

enum class MovieScreens {
    HomeScreen,
    DetailsScreen;

    companion object {
        fun fromRoute(route: String?): MovieScreens =
            when (route?.substringBefore("/")) {
                HomeScreen.name -> HomeScreen
                DetailsScreen.name -> DetailsScreen
                null -> HomeScreen
                else -> throw IllegalArgumentException("Route $route not found")
            }
    }
}

@Composable
fun UserDetails(user: String){
    Text(text = user)
}
