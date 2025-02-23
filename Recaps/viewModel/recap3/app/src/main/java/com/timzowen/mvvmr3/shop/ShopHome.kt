package com.timzowen.mvvmr3.shop

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

@Composable
fun HomeShop(modifier: Modifier,viewModel: ShopViewModel){

    val shop = viewModel.shop.observeAsState()
    val loadingState = viewModel.isLoading.observeAsState()

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment =Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Button(
            onClick = {
                viewModel.shopDetails()
            }
        ) {
            Text("Load")
        }
        if (loadingState.value == true){
            CircularProgressIndicator()
        }else{
            shop.value?.let {
                Text("Shop: ${it.shopName}")
                Text("Loacation: ${it.shopLocation}")
                Text("NO.: ${it.shopNumber}")
            }
        }
    }
}