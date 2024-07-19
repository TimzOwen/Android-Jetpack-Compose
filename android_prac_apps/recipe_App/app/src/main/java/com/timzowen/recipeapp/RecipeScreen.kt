package com.timzowen.recipeapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

@Composable
fun RecipeScreen(modifier: Modifier = Modifier){

    val recipeViewModel: MainViewModel = viewModel()
    val viewState by recipeViewModel.categoriesState
}