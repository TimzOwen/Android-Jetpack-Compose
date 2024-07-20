package com.timzowen.navigationandroid

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
            MyMainApp()
        }
    }
}

@Composable
fun MyMainApp(){
    // Step 1 --> set up nav controller
    val navController = rememberNavController()

    //Step 2 --> declare naHost
    NavHost(navController= navController, startDestination = "first_screen") {
        composable("first_screen"){ FirstScreen {
                navController.navigate("second_screen")
            }
        }
        composable("second_screen"){
            SecondScreen {
                navController.navigate("first_screen")
            }
        }
    }
}
