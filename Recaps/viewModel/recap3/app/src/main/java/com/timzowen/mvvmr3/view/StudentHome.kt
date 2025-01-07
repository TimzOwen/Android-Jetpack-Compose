package com.timzowen.mvvmr3.view

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
import com.timzowen.mvvmr3.viewmodel.StudentViewModel


@Composable
fun StudentHome(modifier: Modifier, viewModel: StudentViewModel) {

    val student = viewModel.studentData.observeAsState()
    val loadingState = viewModel.isLoading.observeAsState()

    Column(
        modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Button(onClick = {
            viewModel.getListOfStudents()
        }) {
            Text(text = "Fetch..")
        }
        if (loadingState.value == true) {
            CircularProgressIndicator()
        } else {
            student.value?.let {

                Text(text = "Student: ${it.firstName}")
                Text(text = "Student: ${it.secondName}")
            }
        }

    }
}
