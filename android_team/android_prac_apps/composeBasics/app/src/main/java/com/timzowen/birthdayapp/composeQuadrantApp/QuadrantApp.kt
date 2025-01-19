package com.timzowen.birthdayapp.composeQuadrantApp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.birthdayapp.R

@Composable
fun QuadrantApp() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)) {
            QuadrantBoxCard(
                background = Color(0xFFEADDFF),
                title = stringResource(id = R.string.text_composable),
                description = stringResource(id = R.string.displays_text_and_follows_the_recommended_material_design_guidelines),
                modifier = Modifier.weight(1f)
            )
            QuadrantBoxCard(
                background = Color(0xFFD0BCFF),
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object",
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            QuadrantBoxCard(
                background = Color(0xFFB69DF8),
                title = "Row composable",
                description ="A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier.weight(1f)
            )
            QuadrantBoxCard(
                background = Color(0xFFF6EDFF),
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1f)
            )
        }
    }
}


@Composable
fun QuadrantBoxCard(
    modifier: Modifier = Modifier,
    background: Color,
    title: String,
    description: String
){
    Column(modifier = modifier
        .fillMaxSize()
        .padding(1.dp)
        .background(background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp))
        Text(
            text =description,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp))
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true, name = "Quadrant")
fun QuadrantPreview(){
    QuadrantApp()
}