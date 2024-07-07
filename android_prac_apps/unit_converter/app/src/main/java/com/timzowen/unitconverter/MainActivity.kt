package com.timzowen.unitconverter

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
import androidx.compose.foundation.layout.height
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
import com.timzowen.unitconverter.ui.theme.UnitConverterTheme
import kotlin.math.roundToInt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitConverterTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter()
                }
            }
        }
    }
}

@Composable
fun UnitConverter() {
    var inputValue by remember { mutableStateOf("")}
    var outputValue by remember { mutableStateOf("")}
    var inputUnit by remember { mutableStateOf("Meters")}
    var outputUnit by remember { mutableStateOf("Meters")}
    var dropdownExpandedIn by remember { mutableStateOf(false)}
    var dropdownExpandedOut by remember { mutableStateOf(false)}
    val conversionType  = remember { mutableStateOf(1.00)}
    val outputConversionType  = remember { mutableStateOf(1.00)}


    fun convertUnits(){
        val inputToDouble = inputValue.toDoubleOrNull() ?: 0.0 // Elvis operator for return values
        val results = (inputToDouble * conversionType.value * 100.0 / outputConversionType.value).roundToInt() / 100   // Use the conversionType value
        outputValue = results.toString()
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Unit Converter", style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = inputValue, onValueChange = {
            inputValue = it
            convertUnits()
        },
            label = { Text(text = "Enter unit to convert..") },)
        Spacer(modifier = Modifier.padding(16.dp))
        Row {
            Box {
                Button(onClick = { dropdownExpandedIn = true }) {
                    Text(text = inputUnit)
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "dropdown")
                }
                DropdownMenu(expanded = dropdownExpandedIn, onDismissRequest = { dropdownExpandedIn=false }) {
                    DropdownMenuItem({ Text(text = "Centimeter") }, onClick = {
                        inputUnit = "Centimeter"
                        dropdownExpandedIn = false
                        conversionType.value = 0.1
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text(text = "Meters") }, onClick = {
                        inputUnit = "Meters"
                        dropdownExpandedIn = false
                        conversionType.value = 1.0
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text(text = "Millimeters") }, onClick = {
                        inputUnit = "Millimeters"
                        dropdownExpandedIn = false
                        conversionType.value = 0.001
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text(text = "Feet") }, onClick = {
                        inputUnit = "Feet"
                        dropdownExpandedIn = false
                        conversionType.value = 0.3048
                        convertUnits()
                    })
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box {
                Button(onClick = { dropdownExpandedOut = true }) {
                    Text(text = outputUnit)
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "select")
                }
                DropdownMenu(expanded = dropdownExpandedOut, onDismissRequest = { dropdownExpandedOut=false }) {
                    DropdownMenuItem({ Text(text = "Centimeter") }, onClick = {
                        dropdownExpandedOut = false
                        outputUnit = "Centimeter"
                        outputConversionType.value = 0.1
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text(text = "Meters") }, onClick = {
                        dropdownExpandedOut = false
                        outputUnit = "Meters"
                        outputConversionType.value = 1.00
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text(text = "Millimeters") }, onClick = {
                        dropdownExpandedOut = false
                        outputUnit = "Millimeters"
                        outputConversionType.value = 0.001
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text(text = "Feet") }, onClick = {
                        dropdownExpandedOut = false
                        outputUnit = "Feet"
                        outputConversionType.value = 0.3048
                        convertUnits()
                    })
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Results: $outputValue $outputUnit", style = MaterialTheme.typography.headlineMedium)
    }
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverter()
}