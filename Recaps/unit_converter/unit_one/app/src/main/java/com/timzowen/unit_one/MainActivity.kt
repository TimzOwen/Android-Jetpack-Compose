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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt


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
    var inputValue by remember { mutableStateOf("") }
    var outputValue by remember { mutableStateOf("") }
    var inputUnit by remember { mutableStateOf("Meters") }
    var outputUnit by remember { mutableStateOf("Meters") }
    var inDropdownExpanded by remember { mutableStateOf(false) }
    var outDropdownExpanded by remember { mutableStateOf(false) }
    val inputConversionFactor = remember { mutableStateOf(1.00) }
    val outputConversionFactor = remember { mutableStateOf(1.00) }

    fun calculateConversion() {
        var inputToDouble = inputValue.toDoubleOrNull() ?: 0.0 // Elvis ops to default to null
        val results = (inputToDouble * inputConversionFactor.value * 100.0 / outputConversionFactor.value).roundToInt() / 100
        outputValue = results.toString()
    }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Unit Converter")
        Spacer(modifier = Modifier.padding(16.dp))

        OutlinedTextField(value = inputValue, onValueChange = {
            inputValue = it
            calculateConversion()
        }, label = { Text(text = "Enter units") })
        Spacer(modifier = Modifier.padding(16.dp))

        Row{
            Box {
                Button(onClick = {
                    inDropdownExpanded = true
                }) {
                    Text(text = inputUnit)
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "drop down")
                }
                DropdownMenu(expanded = inDropdownExpanded, onDismissRequest = { inDropdownExpanded = false }) {
                    DropdownMenuItem(text ={ Text(text = "Meters") } , onClick = {
                        inputUnit = "Meters"
                        inDropdownExpanded = false
                        inputConversionFactor.value = 1.00
                        calculateConversion()
                    })
                    DropdownMenuItem(text ={ Text(text = "Miles") } , onClick = {
                        inputUnit = "Miles"
                        inDropdownExpanded = false
                        inputConversionFactor.value = 1609.35
                        calculateConversion()
                    })
                    DropdownMenuItem(text ={ Text(text = "Kilometers") } , onClick = {
                        inputUnit = "Kilometers"
                        inDropdownExpanded = false
                        inputConversionFactor.value = 1000.00
                        calculateConversion()
                    })
                    DropdownMenuItem(text ={ Text(text = "Feet") } , onClick = {
                        inputUnit = "Feet"
                        inDropdownExpanded = false
                        inputConversionFactor.value = 3.281
                        calculateConversion()
                    })
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box {
                Button(onClick = {
                    outDropdownExpanded = true
                }) {
                    Text(text = outputUnit)
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Drop down")
                }
                DropdownMenu(expanded = outDropdownExpanded, onDismissRequest = { outDropdownExpanded = false }) {
                    DropdownMenuItem(text ={ Text(text = "Kilometers") } , onClick = {
                        outputUnit = "Kilometers"
                        outDropdownExpanded = false
                        outputConversionFactor.value = 100.00
                        calculateConversion()
                    })
                    DropdownMenuItem(text ={ Text(text = "Miles") } , onClick = {
                        outputUnit = "Miles"
                        outDropdownExpanded = false
                        outputConversionFactor.value = 1609.35
                        calculateConversion()
                    })
                    DropdownMenuItem(text ={ Text(text = "Meters") } , onClick = {
                        outputUnit = "Meters"
                        outDropdownExpanded = false
                        outputConversionFactor.value = 1.00
                        calculateConversion()
                    })
                    DropdownMenuItem(text ={ Text(text = "Feet") } , onClick = {
                        outputUnit = "Feet"
                        outDropdownExpanded = false
                        outputConversionFactor.value = 3.281
                        calculateConversion()
                    })
                }
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "Results: $outputValue $outputUnit", style = MaterialTheme.typography.headlineSmall)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UnitConverter()
}