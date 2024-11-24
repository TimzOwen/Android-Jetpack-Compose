package com.timzowen.myapplication.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MyApp() {
    val totalAmount = remember { mutableIntStateOf(0) }
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        color = Color(0xFF546E7A)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                style = TextStyle(
                    fontSize = 35.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                ),
                text = "$${totalAmount.intValue}"
            )
            Spacer(modifier = Modifier.height(130.dp))

            CircleTap(moneyCounter = totalAmount.intValue){
                totalAmount.intValue = it
            }
        }
    }
}


@Composable
fun CircleTap(moneyCounter: Int, increaseCount: (Int) -> Unit ) {
    Card(
        modifier = Modifier
            .size(135.dp)
            .padding(3.dp)
            .clickable {
                increaseCount(moneyCounter + 5)
            },
        shape = CircleShape
    ) {
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center) {
            Text(text = "Tap")
        }
    }
}

