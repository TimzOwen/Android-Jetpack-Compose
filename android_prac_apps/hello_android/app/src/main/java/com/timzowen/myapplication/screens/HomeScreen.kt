package com.timzowen.myapplication.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.timzowen.myapplication.MealCard
import com.timzowen.myapplication.model.Meal
import com.timzowen.myapplication.model.getMenuItems
import com.timzowen.myapplication.navigation.RestaurantScreens


@OptIn(ExperimentalMaterial3Api::class)
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
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = "back Arrow",
                            modifier = Modifier.clickable {
                                navController.navigate(RestaurantScreens.RoomsScreen.name)
                            }
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "HomeBase")
                        }
                        Icon(
                            imageVector = Icons.Filled.Home,
                            contentDescription = "Rooms",
                            modifier = Modifier
                                .padding(end = 8.dp)
                                .clickable {
                                navController.navigate(RestaurantScreens.RoomsScreen.name)
                            }
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFF9F9F9))
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



