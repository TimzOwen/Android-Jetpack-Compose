package com.timzowen.intro101

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TeamScore(viewModel: StateScoreViewModel){
    val currentScore by viewModel.currentScore.observeAsState(initial = "0")
    var finalScore by remember { mutableStateOf("0") }


    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(
            text = "Score: $currentScore of $finalScore",
            style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold))
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextScore(
            value = currentScore,
            onValueChange = {viewModel.updateScore(it)},
            labelText = { Text(
                text = "score board",
                style = TextStyle(fontSize = 16.sp))
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextScore(
            value = finalScore,
            onValueChange = {finalScore = it},
            labelText = { Text(
                    text = "score board",
                    style = TextStyle(fontSize = 16.sp))
            }
        )
    }
}

@Composable
fun OutlinedTextScore(value: String, onValueChange: (String) -> Unit,
                      labelText: @Composable () -> Unit){
    OutlinedTextField(
        value = value ,
        onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
        label = labelText)
}

//@Preview(showBackground = true)
//@Composable
//fun TeamScorePreview(){
//    TeamScore()
//}