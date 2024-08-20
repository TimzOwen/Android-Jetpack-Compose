package com.timzowen.recipeapp.model

import com.timzowen.recipeapp.R

object RecipeRepository{

    val recipes = listOf(
        Recipe(
            recipeName = R.string.recipe_name_1,
            recipeCaption = R.string.recipe_caption_1,
            recipeImageResourceId = R.drawable.recipe_1,
            recipeCookingOrder = R.string.recipe_order_1
        ),
        Recipe(
            recipeName = R.string.recipe_name_2,
            recipeCaption = R.string.recipe_caption_2,
            recipeImageResourceId = R.drawable.recipe_2,
            recipeCookingOrder = R.string.recipe_order_2
        ),
        Recipe(
            recipeName = R.string.recipe_name_3,
            recipeCaption = R.string.recipe_caption_3,
            recipeImageResourceId = R.drawable.recipe_3,
            recipeCookingOrder = R.string.recipe_order_3
        )
    )

}