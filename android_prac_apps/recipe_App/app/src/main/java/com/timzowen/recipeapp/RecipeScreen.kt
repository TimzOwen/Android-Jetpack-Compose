package com.timzowen.recipeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter

@Composable
fun RecipeScreen(modifier: Modifier = Modifier, navigateToDetails: (Category) -> Unit){
    // Step 1 --> declare both states
    val recipeViewModel: MainViewModel = viewModel()
    val viewState by recipeViewModel.categoriesState

    // Step 2 --> check the state and adapt to UI
    Box(modifier = Modifier.fillMaxSize()){
        when{
            viewState.isLoading -> {
                CircularProgressIndicator(modifier.align(Alignment.Center))
            }
            viewState.errorMessage != null ->{
                Text(text = "Error occurred!!! ")
            }
            else -> {
                CategoryScreen(categories = viewState.list,navigateToDetails)
            }
        }
    }
}

@Composable
fun CategoryScreen(categories: List<Category>, navigateToDetails: (Category) -> Unit){
    LazyVerticalGrid(GridCells.Fixed(2), modifier = Modifier.fillMaxSize()) {
       items(categories){
           category -> 
           CategoryItems(category = category,navigateToDetails)
       }
    }
}

@Composable
fun CategoryItems(category: Category, navigateToDetails: (Category) -> Unit){
    Column(modifier = Modifier
        .padding(8.dp)
        .fillMaxSize()
        .clickable { navigateToDetails(category) },
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = rememberAsyncImagePainter(category.strCategoryThumb),
            contentDescription =null,
            modifier = Modifier
                .fillMaxSize()
                .aspectRatio(1f))

        Text(
            text = category.strCategory,
            color = Color.Black,
            style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(top = 4.dp))
    }

}