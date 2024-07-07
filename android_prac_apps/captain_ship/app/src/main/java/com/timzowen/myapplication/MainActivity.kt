package com.timzowen.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.timzowen.myapplication.ui.theme.MyApplicationTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(modifier = Modifier.fillMaxSize()) {
                MyApplicationTheme {
                    CaptainTreasure()
                }
            }
        }
    }
}

@Composable
fun CaptainTreasure() {
    var treasureFound by remember { mutableStateOf(0) }
    var sailingDirection by remember { mutableStateOf("North") }
    val stormOrTreasure = remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Treasure Found: ${treasureFound}")

        Text(text = "Sailing direction: ${sailingDirection}")

        Button(onClick = {
            sailingDirection = "East"
            if (Random.nextBoolean()) {
                treasureFound += 1
                stormOrTreasure.value = "You found a treasure!"
            }else stormOrTreasure.value = "You found a storm!"
        }) {
            Text(text = "Sail East")
        }

        Button(onClick = {
            sailingDirection = "South"
            if (Random.nextBoolean()) {
                treasureFound += 1
                stormOrTreasure.value = "You found a treasure!"
            }else stormOrTreasure.value = "You found a storm!"
        }) {
            Text(text = "Sail South")

        }

        Button(onClick = {
            sailingDirection = "West"
            if (Random.nextBoolean()) {
                treasureFound += 1
                stormOrTreasure.value = "You found a treasure!"
            }else stormOrTreasure.value = "You found a storm!"
        }) {
            Text(text = "Sail West")
        }

        Button(onClick = {
            sailingDirection = "North"
            if (Random.nextBoolean()) {
                treasureFound += 1
                stormOrTreasure.value = "You found a treasure!"
            } else stormOrTreasure.value = "You found a storm!"
        }) {
            Text(text = "Sail North")

        }

        Text(text = stormOrTreasure.value)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        CaptainTreasure()
    }
}