package com.timzowen.intro101

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun ScoreScreenState(){
    var currentScore by rememberSaveable { mutableStateOf("0") }
    var totalScore by remember { mutableStateOf("0") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Score: $currentScore of $totalScore",
            style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold))
        OutlinedTextField(
            value = currentScore,
            onValueChange ={ currentScore = it },
            label = { Text(text = "Enter Score")})
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = totalScore,
            onValueChange ={totalScore=it},
            label = { Text(text = "Total Score")})
    }
}