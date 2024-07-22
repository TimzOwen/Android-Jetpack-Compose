package com.timzowen.recipeapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CategoryDetailScreen(category: Category){
    Column(modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = category.strCategory, textAlign = TextAlign.Center)
    }
}

@Composable
@Preview(showBackground = true)
fun CategoryDetailScreenPreview(){
    CategoryDetailScreen(category = Category(
        "1",
        "Fast Food",
        "https:",
        "More food"
    ))
}