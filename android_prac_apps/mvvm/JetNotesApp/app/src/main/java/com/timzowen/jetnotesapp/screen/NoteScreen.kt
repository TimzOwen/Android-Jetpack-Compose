package com.timzowen.jetnotesapp.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.jetnotesapp.R
import com.timzowen.jetnotesapp.components.NoteButton
import com.timzowen.jetnotesapp.components.NoteInputText


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen() {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
        Column {
            TopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.app_name))
                },
                actions = {
                    Icon(
                        imageVector = Icons.Rounded.Notifications,
                        contentDescription = "Icon"
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFDADFE3))
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                NoteInputText(
                    modifier = Modifier.padding(top = 9.dp, bottom = 9.dp),
                    text = title,
                    label = "Title",
                    onTextChange = {
                        if (it.all { char ->
                                char.isLetter() || char.isWhitespace()
                            })
                            title = it
                    }
                )
                NoteInputText(
                    modifier = Modifier.padding(top = 9.dp, bottom = 9.dp),
                    text = description,
                    label = "Add a note",
                    onTextChange = {
                        if (it.all { char ->
                                char.isLetter() || char.isWhitespace()
                            })
                            description = it
                    }
                )
                NoteButton(
                    text = "Save",
                    onClick = { }
                )
            }
        }
    }


@Composable
@Preview(showBackground = true)
fun NoteScreenPreview() {
    NoteScreen()
}