package com.timzowen.navigationr2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreenNavigation()
        }
    }
}

// fun to handle the intents
@Composable
fun MainScreenNavigation(){
   val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = "screen_one"){
        composable("screen_one"){
            ScreenOne{ navHostController.navigate("screen_two")}
        }
        composable("screen_two"){
            ScreenTwo{navHostController.navigate("screen_one")}
    }
}
}
