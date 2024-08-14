package com.timzowen.recipe_one_recap

data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String,
)

data class CategoriesList(val category: List<Category>)
