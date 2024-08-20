package com.timzowen.recipeapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recipe(
    @StringRes val recipeName: Int,
    @StringRes val recipeCaption: Int,
    @DrawableRes val recipeImageResourceId: Int,
    @StringRes val recipeCookingOrder: Int
)

