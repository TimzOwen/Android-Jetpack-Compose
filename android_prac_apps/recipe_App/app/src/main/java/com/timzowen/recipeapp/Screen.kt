package com.timzowen.recipeapp

sealed class Screen(val route: String){
    object RecipeScreen: Screen("recipe_screen")
    object DetailsScreen: Screen("detail_screen")

}