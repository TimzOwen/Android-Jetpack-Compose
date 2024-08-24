package com.timzowen.recipeapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.recipeapp.R
import com.timzowen.recipeapp.model.Recipe
import com.timzowen.recipeapp.model.RecipeRepository.recipes


@Composable
fun RecipeList(paddingValues: PaddingValues) {
    LazyColumn(modifier = Modifier.padding(paddingValues)) {
        items(recipes) {
            RecipeCard(
                recipe = it,
            )
        }
    }
}


@Composable
fun RecipeCard(recipe: Recipe, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .padding(8.dp, top = 16.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5)),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Column(
            modifier = Modifier.wrapContentSize()
        ) {
            Text(
                text = stringResource(recipe.recipeName),
                style = MaterialTheme.typography.labelLarge,
                fontSize = 22.sp,
                modifier = Modifier.padding(start = 8.dp, bottom = 4.dp, top = 8.dp)

            )
            Text(
                text = stringResource(recipe.recipeCaption),
                fontSize = 16.sp,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(start = 8.dp)
            )
            Image(
                painter = painterResource(id = recipe.recipeImageResourceId),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(170.dp)
                    .fillMaxWidth()
                    .padding(8.dp),
                contentDescription = null
            )


            Text(
                text = stringResource(id = recipe.recipeCookingOrder),
                style = MaterialTheme.typography.labelSmall,
                fontSize = 12.sp,
                modifier = Modifier.padding(start = 8.dp, top = 4.dp, bottom = 8.dp, end = 8.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun RecipeCardPreview() {
    RecipeCard(
        Recipe(
            recipeName = R.string.recipe_name_1,
            recipeCaption = R.string.recipe_caption_2,
            recipeImageResourceId = R.drawable.recipe_8,
            recipeCookingOrder = R.string.recipe_order_1
        )
    )
}