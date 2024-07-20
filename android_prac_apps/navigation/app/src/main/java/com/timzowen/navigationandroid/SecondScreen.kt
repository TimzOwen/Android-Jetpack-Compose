package com.timzowen.navigationandroid

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SecondScreen(navigateToScreenOne: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Second Screen 2", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Button(modifier = Modifier.padding(top = 16.dp),
            onClick = { navigateToScreenOne() }) {
            Text(text = "First Screen")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SecondScreenPreview() {
    SecondScreen({})
}