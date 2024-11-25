package com.timzowen.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.timzowen.myapplication.navigation.RestaurantNavigation
import com.timzowen.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp {
                RestaurantNavigation()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit){
    MyApplicationTheme {
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp {
        RestaurantNavigation()
    }
}