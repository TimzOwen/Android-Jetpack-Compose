package com.timzowen.movier1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.timzowen.movier1.screens.DetailsScreen
import com.timzowen.movier1.screens.MovieApp

@Composable
fun MovieNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MovieScreens.HomeScreen.name){
        composable(route = MovieScreens.HomeScreen.name){
            MovieApp(navController=navController)
        }
        composable(route = MovieScreens.DetailsScreen.name){
            DetailsScreen(navController=navController)
        }
    }
}