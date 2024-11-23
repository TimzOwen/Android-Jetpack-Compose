package com.timzowen.movier1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.timzowen.movier1.navigation.MovieNavigation
import com.timzowen.movier1.screens.MovieApp
import com.timzowen.movier1.ui.theme.MovieR1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieR1Theme {
                MovieNavigation()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MovieR1Theme {
        MovieNavigation()
    }
}