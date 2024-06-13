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
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    val greetingListState = remember { mutableStateListOf("timz","William") }
    val newNameStateContent = remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GreetingList(greetingListState,{
            greetingListState.add("Owen")
        },
            newNameStateContent.value,
            {newName -> newNameStateContent.value = newName})
    }
}

@Composable
fun GreetingList(namesList : List<String>,
                 btnClick : () -> Unit,
                 textFieldValue : String,
                 textFieldUpdate : (newName : String) -> Unit){

    for (name in namesList) {
        Greeting(name = name)
    }

    TextField(value = textFieldValue, onValueChange = textFieldUpdate)

    Button(onClick = btnClick) {
        Text(text = "Add Name")
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name", style = MaterialTheme.typography.bodyLarge)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainScreen()
}