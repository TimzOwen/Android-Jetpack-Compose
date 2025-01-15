package com.timzowen.recap4.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.timzowen.recap4.viewmodel.CustomerViewModel

@Composable
fun HomeScreen(modifier: Modifier, viewModel: CustomerViewModel) {

    val customer = viewModel.customerData.observeAsState()
    val loadingState = viewModel.isLoading.observeAsState()

    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            viewModel.getCustomer()
        }) {
            Text(text = "Load Customer")
        }
        if (loadingState.value == true) {
            CircularProgressIndicator()
        } else
            customer.value?.let {
                Text(text = "FirstName: ${it.userName}")
                Text(text = "Location: ${it.location}")
                Text(text = "IdNo: ${it.idNo}")
            }
    }
}