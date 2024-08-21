package com.timzowen.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.recipeapp.screens.RecipeList
import com.timzowen.recipeapp.ui.theme.RecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecipeAppTheme {
                RecipeApp()
            }
        }
    }
}

@Composable
fun RecipeApp() {
    Scaffold(
        topBar = {
            RecipeTopAppBar()
        }
    ) { innerPadding ->
        RecipeList(paddingValues = innerPadding)
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeTopAppBar(modifier: Modifier = Modifier){
    CenterAlignedTopAppBar(
        title = {
            Row {
                Text(
                    text = "RecipeApp"
                )
            }
        },
        modifier = modifier.height(32.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RecipeAppTheme {
        RecipeApp()
    }
}