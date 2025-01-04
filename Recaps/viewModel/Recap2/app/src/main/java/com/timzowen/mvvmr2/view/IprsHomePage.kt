package com.timzowen.mvvmr2.view

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
import com.timzowen.mvvmr2.viewModel.IprsViewModel

@Composable
fun HomePage(modifier: Modifier, viewModel: IprsViewModel){

    val iprsData = viewModel.iprsData.observeAsState()
    val securityScore = viewModel.securityScore.observeAsState()
    val isLoading = viewModel.isLoading.observeAsState()

//    LaunchedEffect(Unit) {
//        viewModel.getIprsUserData()
//        viewModel.getSecurityScore()
//    }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            viewModel.getIprsUserData()
            viewModel.getSecurityScore()
        }) {
            Text(text = "Fetch Iprs")
        }
        if (isLoading.value == true){
            CircularProgressIndicator()
        }else {
            iprsData.value?.let { iprsData ->
                Text(text = "Name: ${iprsData.userName}")
                Text(text = "Amount: ${iprsData.amount}")
            }
            securityScore.value?.let {
                Text(text = "History: ${it.history}")
                Text(text = "Score: ${it.score}")
            }
        }
    }
}