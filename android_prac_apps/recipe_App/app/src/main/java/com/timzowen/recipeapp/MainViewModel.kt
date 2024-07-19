package com.timzowen.recipeapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    //Step 2------> create mutable state of Recipe
    private val _categoriesState = mutableStateOf(RecipeState())
    val categoriesState: State<RecipeState> = _categoriesState // hold state changes

    // Step 4 ------> init block to fetch data
    init {
        fetchCategories()
    }

    // Step 3 ------> Method to fetch data from Categories
    private fun fetchCategories() {
        viewModelScope.launch {
            try {
                val response = recipeService.getCategories()
                _categoriesState.value = _categoriesState.value.copy(
                    list = response.categories,
                    isLoading = false,
                    errorMessage = null
                )

            }catch (e: Exception){
                _categoriesState.value = _categoriesState.value.copy(
                    isLoading = false,
                    errorMessage = "Error Message: ${e.message}"
                )
            }
        }
    }

    //Step 1------> data class to check the current state
data class RecipeState(
    val isLoading: Boolean = true,
    val list: List<Category> = emptyList(), // set it up as a starting point
    val errorMessage: String? = null)



}