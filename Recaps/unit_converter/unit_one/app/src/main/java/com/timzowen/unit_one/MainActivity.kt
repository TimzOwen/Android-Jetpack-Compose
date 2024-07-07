package com.timzowen.unit_one


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(modifier = Modifier.fillMaxSize()) {
                UnitConverter()
            }
        }
    }
}

@Composable
fun UnitConverter(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Unit Converter")
        Spacer(modifier = Modifier.padding(16.dp))
        OutlinedTextField(value = "Enter units", onValueChange = {})
        Spacer(modifier = Modifier.padding(16.dp))
        Row{
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "drop down")
                }
                DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text ={ Text(text = "Kilometers") } , onClick = { /*TODO*/ })
                    DropdownMenuItem(text ={ Text(text = "Miles") } , onClick = { /*TODO*/ })
                    DropdownMenuItem(text ={ Text(text = "Meters") } , onClick = { /*TODO*/ })
                    DropdownMenuItem(text ={ Text(text = "Feet") } , onClick = { /*TODO*/ })
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Drop down")
                }
                DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text ={ Text(text = "Kilometers") } , onClick = { /*TODO*/ })
                    DropdownMenuItem(text ={ Text(text = "Miles") } , onClick = { /*TODO*/ })
                    DropdownMenuItem(text ={ Text(text = "Meters") } , onClick = { /*TODO*/ })
                    DropdownMenuItem(text ={ Text(text = "Feet") } , onClick = { /*TODO*/ })
                }
            }

        }
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "Results")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UnitConverter()
}