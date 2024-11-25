package com.timzowen.myapplication

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.timzowen.myapplication.model.Meal
import com.timzowen.myapplication.model.getMenuItems
import com.timzowen.myapplication.navigation.RestaurantNavigation
import com.timzowen.myapplication.navigation.RestaurantScreens


@Composable
fun MealCard(meal: Meal = getMenuItems()[0], onClickedMenu: (String) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .clickable {
                onClickedMenu(meal.menuId)
            },
        elevation = CardDefaults.cardElevation(5.dp),
        colors = CardDefaults.cardColors(Color.White),
        shape = RoundedCornerShape(5.dp)
    ) {
        Row {
         Surface(modifier = Modifier
             .size(100.dp)
             .padding(6.dp)
             .clip(
                 RoundedCornerShape(5.dp)
             )) {
             AsyncImage(model = ImageRequest.Builder(LocalContext.current)
                 .data(meal.menuImage)
                 .build(),
                 contentDescription ="Meal image",
                 contentScale = ContentScale.Crop)
         }
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = "Meal: ${meal.mealTitle}")
            Text(text = "Cost: ${meal.mealCost}")
            Text(text = "Ingredients ${meal.mealIngredients[0]}")
        }
        }
    }
}