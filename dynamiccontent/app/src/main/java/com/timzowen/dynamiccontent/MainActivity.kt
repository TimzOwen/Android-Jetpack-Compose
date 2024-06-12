package com.timzowen.dynamiccontent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

private val namesList: ArrayList<String> = arrayListOf("Timz", "Owen", "Shem", "John", "Kiptoo")

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingList(names = namesList)
        }
    }
}

@Composable
fun GreetingList(names: ArrayList<String>) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        for (name in names) {
            Greeting(name = name)
        }
        Button(onClick = { namesList.add("New Name") }) {
            Text(text = "Add Name")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name", style = MaterialTheme.typography.bodyLarge)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingList(names = namesList)
}