package com.timzowen.birthdayapp.taskManager

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.birthdayapp.R

@Composable
fun TaskManager(){
    Column(modifier = Modifier
        .fillMaxSize()
        .systemBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = "Task Complete")
        Text(
            text = stringResource(R.string.all_tasks_completed),
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold)
        Text(
            text = "Nice Work!",
            fontSize = 16.sp)
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true, name = "Task Manager")
fun TaskManagerPreview(){
    TaskManager()
}
