package com.timzowen.birthdayapp.quadrant2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun QuadrantApp(){
    Column (
        modifier = Modifier.fillMaxWidth()
            .padding(2.dp)
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ){
            QuadrantBoxCard(background = Color.Red, title = "Bamburi", description = "Cement is good for construction", modifier = Modifier.weight(1f) )

            QuadrantBoxCard(background = Color.Yellow, title = "Engineering", description = "Find what suits you best along the way", modifier = Modifier.weight(1f))
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            QuadrantBoxCard(background = Color.Gray, title = "Outstanding", description = "Cement is good for construction", modifier = Modifier.weight(1f) )
            QuadrantBoxCard(background = Color.Cyan, title = "Engineering", description = "Find what suits yoou best", modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun QuadrantBoxCard(
    background: Color,
    title: String,
    description: String,
    modifier: Modifier = Modifier) {
    Column(
       modifier = modifier
           .fillMaxSize()
           .padding(2.dp)
           .background(background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = title, style = MaterialTheme.typography.titleMedium, textAlign = TextAlign.Justify)
        Text(text = description, style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Justify)
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun QuadrantBoxPreview() {
//    QuadrantBoxCard(Color.Red, "Box1", "Interesting things about life")
    QuadrantApp()
}