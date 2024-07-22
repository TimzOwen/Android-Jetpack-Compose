package com.timzowen.navigationr2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
fun ScreenOne(navigateToScreenTwo: () -> Unit){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Screen one", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = { navigateToScreenTwo() }) {
            Text(text = "Go To Screen 2")
        }
    }
}

@Composable
@Preview(showBackground = true)
    fun ScreenOnePreview(){
    ScreenOne(){}
}