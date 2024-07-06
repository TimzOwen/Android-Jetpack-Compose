package com.timzowen.unitconverter

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.timzowen.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitConverterTheme {
                Surface (modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    UnitConverter()
                }
            }
        }
    }
}


@Composable
fun UnitConverter(){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Unit Converter")
        OutlinedTextField(value = "Enter Values", onValueChange = {})
        Row {
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "select")
                    Icon(Icons.Default.ArrowDropDown,  contentDescription = "dropdown")
                }
            }

            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "select")
                }
            }
        }
        Text(text = "Results")
    }
}


@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
        UnitConverter()
}