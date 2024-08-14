package com.timzowen.shopping_list

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


data class ShoppingItems(
    var id: Int,
    var name: String,
    var quantity: Int,
    var isEditing: Boolean = false
)

@Composable
fun ShoppingListApp() {
    var shoppingItemsList by remember { mutableStateOf(listOf<ShoppingItems>()) }
    var showDialog by remember { mutableStateOf(false) }
    var itemName by remember { mutableStateOf("") }
    var itemQuantity by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { showDialog = true },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Add Item")
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(shoppingItemsList.size) {
            }
        }
    }
    if (showDialog) {
        AlertDialog(onDismissRequest = { showDialog = false },
            confirmButton = {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(onClick = {
                        if (itemName.isNotBlank()){
                            val newItem = ShoppingItems(
                                id = shoppingItemsList.size + 1,
                                name = itemName,
                                quantity = itemQuantity.toInt()
                            )
                            shoppingItemsList = shoppingItemsList + newItem
                            showDialog = false
                            itemName = ""
                            itemQuantity = ""
                        }
                    }) {
                        Text(text = "Add")
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Cancel")
                    }
                }
            },
            title = { Text(text = "Add Shopping Item") },
            text = {
                Column {
                    OutlinedTextField(
                        value = itemName, onValueChange = { itemName = it },
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    )

                    OutlinedTextField(
                        value = itemQuantity, onValueChange = { itemQuantity = it },
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    )
                }
            }
        )
    }
}


@Composable
fun ShoppingItemEditor(item: ShoppingItems, onEditComplete: (String, Int) -> Unit){
    var editedName by remember { mutableStateOf(item.name) }
    var editedQuantity by remember { mutableStateOf(item.quantity.toString()) }
    var isEditing by remember { mutableStateOf(item.isEditing) }

    Row (modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()
        .background(Color.White),
        horizontalArrangement = Arrangement.SpaceEvenly,){
        Column {
            BasicTextField(
                value = editedName,
                onValueChange = { editedName = it },
                modifier = Modifier
                    .padding(8.dp)
                    .wrapContentSize(),
                singleLine = true
            )
            BasicTextField(
                value = editedQuantity,
                onValueChange = { editedQuantity = it },
                modifier = Modifier
                    .padding(8.dp)
                    .wrapContentSize(),
                singleLine = true
            )
        }
        Button(onClick ={
            isEditing = false
            onEditComplete(editedName, editedQuantity.toIntOrNull() ?: 1)
        } ){
            Text(text = "save")
        }
    }
}


@Composable
fun ShoppingListItem(item: ShoppingItems, onEditClick: () -> Unit, onDeleteClick: () -> Unit){
    Row (modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()
        .border(
            border = BorderStroke(2.dp, color = Color.Blue),
            shape = RoundedCornerShape(20)
        ),
        horizontalArrangement = Arrangement.SpaceBetween){
        Text(text = item.name, modifier = Modifier.padding(8.dp))
        Text(text = "Qty: ${item.quantity} ", modifier = Modifier.padding(8.dp))
        Row (modifier = Modifier.padding(8.dp)) {
            Icon(imageVector = Icons.Default.Edit, contentDescription = "Edit button")
            Spacer(modifier = Modifier.width(16.dp))
            Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete button")
        }
    }
}