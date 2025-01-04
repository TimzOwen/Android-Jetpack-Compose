package com.timzowen.viewmodel001.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.timzowen.viewmodel001.viewmodel.UserViewModel

@Composable
fun HomePageView(modifier: Modifier, userViewmodel: UserViewModel){

    val userData = userViewmodel.userData.observeAsState()
    val isLoadingState = userViewmodel.isLoading.observeAsState()
    val parkingSlots = userViewmodel.parkingSlots.observeAsState()

    LaunchedEffect(Unit) {
        userViewmodel.getUserData()
        userViewmodel.getParkingSlots()
    }

    Column(
        modifier =modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            userViewmodel.getUserData()
            userViewmodel.getParkingSlots()
        }) {
            Text(text = "Get data")
        }
        if (isLoadingState.value == true){
           CircularProgressIndicator()
        }else {
            userData.value?.let { userData ->
                Text(text = "Name: ${userData.userName}")
                Text(text = "Age: ${userData.age}")
            }
            parkingSlots.value?.let { 
                Text(text = "Parking No: ${it.parkingNo}")
                Text(text = "Car Model: ${it.carModel}")
            }
        }

    }
}