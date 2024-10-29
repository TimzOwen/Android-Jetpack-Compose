package com.timzowen.intro101

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Preview(showBackground = true)
@Composable
fun ScoreScreenState(viewModel: StateScoreViewModel){
    val currentScore by viewModel.score.observeAsState(initial = "0")
    val totalScore by viewModel.totalScore.observeAsState(initial = "100")

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
            onValueChange ={ viewModel.onScoreUpdate(it) },
            label = { Text(text = "Enter Score")})
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = totalScore,
            onValueChange ={viewModel.totalScoreUpdate(it)},
            label = { Text(text = "Total Score")})
    }
}

