package com.timzowen.mvvmr3.router

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
fun RouterHome(modifier: Modifier, viewModel: RouterViewModel){

    val loadingState  = viewModel.isLoading.observeAsState()
    val router = viewModel.router.observeAsState()

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Button(onClick = {
            viewModel.routerDetails()
        }) {
            Text("Load Router")
        }
        if (loadingState.value == true){
            CircularProgressIndicator()
        }else
        router.value?.let {
            Text("Router: ${it.routerName}")
            Text("Router: ${it.vendor}")
            Text("Router: ${it.speed} mbps")
            Text("Router: ${it.price}")
        }
    }

}