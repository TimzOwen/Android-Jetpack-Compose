package com.timzowen.countermvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val viewModel: CounterViewModel = viewModel()
            Surface(modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background) {
                TheCounterScreen(viewModel)
            }
        }
    }
}

@Composable
fun TheCounterScreen(viewModel: CounterViewModel) {
    //val counter = remember { mutableStateOf(0) }



    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Text(text = "Counter: ${viewModel.count.value}",
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp))
        
        Spacer(modifier = Modifier.height(16.dp))

        Row() {
            Button(onClick = { viewModel.increment() }) {
                Text(text = " Increment ")
            }
            Spacer(modifier = Modifier.padding(16.dp))
            Button(onClick = { viewModel.decrement() }) {
                Text(text = " Decrement ")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TheCounterScreenPreview() {
    TheCounterScreen(viewModel = CounterViewModel() )
}