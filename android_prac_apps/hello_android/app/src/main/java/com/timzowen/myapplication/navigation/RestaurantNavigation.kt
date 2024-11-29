package com.timzowen.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.timzowen.myapplication.screens.HomeScreen
import com.timzowen.myapplication.screens.RestaurantMenuScreen
import com.timzowen.myapplication.screens.RestaurantRoomsScreen


@Composable
fun RestaurantNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = RestaurantScreens.HomeScreen.name ){
        composable(route = RestaurantScreens.HomeScreen.name){
            HomeScreen(navController = navController)
        }
        composable(route = RestaurantScreens.RoomsScreen.name){
            RestaurantRoomsScreen(navController = navController)
        }
        composable(route=RestaurantScreens.MenuScreen.name+"/{menuId}",
            arguments = listOf(navArgument("menuId"){type=NavType.StringType})
        ){backStackEntry ->
            RestaurantMenuScreen(navController = navController, backStackEntry.arguments?.getString("menuId"))
        }
    }

}