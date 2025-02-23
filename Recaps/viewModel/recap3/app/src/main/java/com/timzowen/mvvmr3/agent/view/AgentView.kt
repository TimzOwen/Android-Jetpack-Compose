package com.timzowen.mvvmr3.agent.view

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
import com.timzowen.mvvmr3.agent.viewmodel.AgentViewModel

@Composable
fun AgentView(modifier: Modifier, viewModel: AgentViewModel) {
    
    val agent = viewModel.agent.observeAsState()
    val isLoading = viewModel.isLoading.observeAsState()
    
    Column(
        modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Button(onClick = {
            viewModel.getAgentDetails()
        }) {
            Text(text = "Fetch..")
        }
        if (isLoading.value==true) {
            CircularProgressIndicator()
        }else{
            agent.value?.let {
                Text(it.firstName)
                Text(it.secondName)
            }
        }

    }
}