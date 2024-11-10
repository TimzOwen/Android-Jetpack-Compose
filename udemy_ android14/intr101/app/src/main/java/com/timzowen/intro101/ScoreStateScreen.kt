package com.timzowen.intro101

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ScoreKeeper(viewModel: ScoreStateViewModel){

    val currentScore by viewModel.currentScore.observeAsState(initial = "0")
    var totalScore by rememberSaveable { mutableStateOf("0") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Text(text = "Score $currentScore of $totalScore")

        OutlinedTextScore(
            value = currentScore,
            onValueChanged = {viewModel.updateCurrentScore(it)},
            label = {Text(text = "current Score")}
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = totalScore,
            onValueChange = {totalScore = it},
            label = { Text(text = "total Score")}
        )

    }
}

@Composable
fun OutlinedTextScore(value: String, onValueChanged: (String) -> Unit, label: @Composable () -> Unit){
    OutlinedTextField(
        value = value ,
        onValueChange = onValueChanged,
        label = label,
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next)
    )
}

//@Composable
//@Preview(showBackground = true)
//fun ScoreKeeperPreview(){
//    ScoreKeeper()
//}