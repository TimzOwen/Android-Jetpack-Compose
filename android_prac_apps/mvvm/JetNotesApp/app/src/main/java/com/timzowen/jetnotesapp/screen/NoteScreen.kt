package com.timzowen.jetnotesapp.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.jetnotesapp.R
import com.timzowen.jetnotesapp.components.NoteButton
import com.timzowen.jetnotesapp.components.NoteInputText
import com.timzowen.jetnotesapp.data.NoteData
import com.timzowen.jetnotesapp.model.Note
import java.time.format.DateTimeFormatter


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(
    notes: List<Note>,
    onAddNote: (Note) -> Unit,
    onRemoveNote: (Note) -> Unit
) {
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
                    onClick = {
                        if(title.isNotEmpty() && description.isNotEmpty()){
                            title = ""
                            description = ""
                        }
                    }
                )
            }
            HorizontalDivider(modifier = Modifier.padding(10.dp))
            LazyColumn {
                items(notes){ note -> 
                    NoteRow(
                        note = note,
                        onNoteClicked = {})
                }
            }
        }
    }

@Composable
fun NoteRow(
    modifier: Modifier = Modifier,
    note: Note,
    onNoteClicked: (Note) -> Unit
){
    Surface(
        modifier
            .padding(4.dp)
            .clip(RoundedCornerShape(topEnd = 30.dp, bottomStart = 30.dp))
            .fillMaxWidth(),
        tonalElevation = 6.dp,
        color = Color(0xFFDFE6EB)) {
    }
    Column(
        modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp, horizontal = 14.dp)
            .clickable { },
        horizontalAlignment = Alignment.Start 
    ) {
        Text(
            text = note.title,
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = note.description,
            style = MaterialTheme.typography.bodySmall
        )
        Text(
            text = note.entryDate.format(DateTimeFormatter.ofPattern("EEE, d MMM")),
            style = MaterialTheme.typography.bodySmall
        )
    }

}



@Composable
@Preview(showBackground = true)
fun NoteScreenPreview() {
    NoteScreen(
        notes = NoteData().loadNotes() ,
        onAddNote = {},
        onRemoveNote = {}
    )
}