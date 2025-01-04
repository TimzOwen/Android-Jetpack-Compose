package com.timzowen.viewmodel001

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
import androidx.lifecycle.ViewModelProvider
import com.timzowen.viewmodel001.ui.theme.ViewModel001Theme
import com.timzowen.viewmodel001.view.HomePageView
import com.timzowen.viewmodel001.viewmodel.UserViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val userViewModel: UserViewModel = ViewModelProvider(this)[UserViewModel::class]
        setContent {
            ViewModel001Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomePageView(modifier = Modifier.padding(innerPadding),userViewModel)
                }
            }
        }
    }
}
