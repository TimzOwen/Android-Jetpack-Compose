package com.timzowen.birthdayapp.widgets

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun EditNumberField(
    modifier: Modifier = Modifier,
    ) {

    var amountInput by remember { mutableStateOf("0") }

    TextField(
        value = amountInput,
        onValueChange = {amountInput = it},
        modifier = modifier
    )
}

