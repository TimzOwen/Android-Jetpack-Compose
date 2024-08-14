package com.timzowen.navigation_r1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.timzowen.navigation_r1.ui.theme.Navigation_R1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Navigation_R1Theme {
                MainScreen()
        }
    }
}
    // Composable to handle navigation
@Composable
fun MainScreen() {
        val navController = rememberNavController() // set rem for controller
        NavHost(navController = navController, startDestination = "screenone") {
            composable("screenone") {
                ScreenOne { navController.navigate("screentwo") }
            }
            composable("screentwo") {
                ScreenTwo {
                    navController.navigate("screenone")
                }
            }
        }
    }
}