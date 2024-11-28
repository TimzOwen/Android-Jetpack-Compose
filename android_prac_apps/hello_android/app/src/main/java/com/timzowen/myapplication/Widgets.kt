package com.timzowen.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.timzowen.myapplication.model.Meal
import com.timzowen.myapplication.model.Room
import com.timzowen.myapplication.model.getMenuItems
import com.timzowen.myapplication.model.getRooms


@Composable
fun MealCard(meal: Meal = getMenuItems()[0], onClickedMenu: (String) -> Unit = {}) {
    var isExpanded by remember { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .clickable {
                onClickedMenu(meal.mealId)
            },
        elevation = CardDefaults.cardElevation(5.dp),
        colors = CardDefaults.cardColors(Color.White),
        shape = RoundedCornerShape(5.dp)
    ) {
        Row {
            Surface(
                modifier = Modifier
                    .size(100.dp)
                    .padding(6.dp)
                    .clip(
                        RoundedCornerShape(5.dp)
                    )
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(meal.menuImage[0])
                        .build(),
                    contentDescription = "Meal image",
                    contentScale = ContentScale.Crop
                )
            }
            Column(modifier = Modifier.padding(8.dp)) {
                Text(text = "Meal: ${meal.mealTitle}")
                Text(text = "Meal Type: ${meal.menuName}")
                Text(text = "Cost: ${meal.mealCost}")

                Icon(imageVector = if (isExpanded) Icons.Default.KeyboardArrowUp else
                    Icons.Default.KeyboardArrowDown,
                    contentDescription = "Arrow down",
                    modifier = Modifier.clickable {
                        isExpanded = !isExpanded
                    })
                if (isExpanded) {
                    MealIngredients(meal)
                }
            }
        }
    }
}

@Composable
fun RoomsCard(room: Room = getRooms()[0]){
    Card(modifier = Modifier.fillMaxWidth()) {
        Row() {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(room.roomImage)
                    .build(),
                contentDescription ="Room Image",
                contentScale = ContentScale.Crop)
            Column {
                Text(text = "Room 3")
                Text(text = "$2500 a night")
                Text(text = "2 bedrooms")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun RoomsCardPreview(){
    RoomsCard()
}

@Composable
private fun MealIngredients(meal: Meal) {
    Column {
        HorizontalDivider(modifier = Modifier.padding(4.dp))
        Text(text = "Ingredients: ${meal.mealIngredients.joinToString(",")}")
    }
}