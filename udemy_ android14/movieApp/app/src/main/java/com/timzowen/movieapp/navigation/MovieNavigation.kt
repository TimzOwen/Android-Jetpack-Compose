package com.timzowen.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.timzowen.movieapp.screens.home.HomeScreen
import com.timzowen.movieapp.screens.details.DetailsScreen

@Composable
fun MovieNavigation(){
    val navController = rememberNavController()
   NavHost(navController = navController, startDestination = MovieScreens.HomeScreen.name){
       composable(MovieScreens.HomeScreen.name){
           HomeScreen(navController = navController)
       }
       composable(MovieScreens.DetailsScreen.name){
           DetailsScreen(navController=navController)
       }
   }
}