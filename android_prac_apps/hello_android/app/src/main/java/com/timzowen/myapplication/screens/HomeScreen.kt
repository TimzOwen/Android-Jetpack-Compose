package com.timzowen.myapplication.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.timzowen.myapplication.MealCard
import com.timzowen.myapplication.model.Meal
import com.timzowen.myapplication.model.getMenuItems
import com.timzowen.myapplication.navigation.RestaurantScreens


@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "back Arrow"
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "HomeBase")
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(8.dp)
        ) {
            MenuItemsList(navController=navController)
        }
    }
}

@Composable
fun MenuItemsList(navController: NavController,mealList: List<Meal> = getMenuItems()){
    LazyColumn {
        items(items = mealList){menu ->
          MealCard(meal = menu){ mealId ->
              navController.navigate(route = RestaurantScreens.MenuScreen.name+"/$mealId" )
          }
        }
    }
}



