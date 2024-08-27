package com.timzowen.contactsmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.contactsmvvm.ui.theme.ContactsMvvmTheme

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<ContactsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContactsMvvmTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = viewModel.bgColor
                ) {
                   Button(
                       onClick = {
                           viewModel.changeBackground()
                       },
                       modifier = Modifier.size(48.dp)
                   ) {
                       Text(text = "Change")
                   }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ContactsMvvmTheme {

    }
}