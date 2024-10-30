package com.timzowen.intro101

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModelProvider
import com.timzowen.intro101.ui.theme.Intro101Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel = ViewModelProvider(this)[StateScoreViewModel::class.java]
        setContent {
            Intro101Theme {
                TeamScore(viewModel)
            }
        }
    }
}




