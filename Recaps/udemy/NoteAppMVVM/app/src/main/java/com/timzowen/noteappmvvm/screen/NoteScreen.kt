package com.timzowen.noteappmvvm.screen

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import com.timzowen.noteappmvvm.R
import com.timzowen.noteappmvvm.components.NoteButton
import com.timzowen.noteappmvvm.components.NoteInputText
import com.timzowen.noteappmvvm.data.NoteDataSource
import com.timzowen.noteappmvvm.model.Note

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(
    notes: List<Note>,
    onAddNote: (Note) -> Unit,
    onRemoveNote: (Note) -> Unit
) {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .padding(6.dp)
            .fillMaxSize()
    ) {
        TopAppBar(
            title = { Text(text = stringResource(id = R.string.crm_user_data)) },
            colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFDADFE3)),
            actions = {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = stringResource(R.string.notification)
                )
            },
        )
        Spacer(modifier = Modifier.height(6.dp))
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            NoteInputText(
                label = "Title",
                text = title,
                onTextChange = {  text->
                    if (text.all { char ->
                        char.isLetter() || char.isWhitespace()
                        })title=text
                })
            Spacer(modifier = Modifier.height(6.dp))
            NoteInputText(
                label = "Add a Note",
                text = description,
                onTextChange = {
                    if (it.all { char ->
                        char.isLetter() || char.isWhitespace()
                        }) description=it
                })
            Spacer(modifier = Modifier.height(6.dp))
            NoteButton(
                text = "save",
                onClick = {  })
        }
        HorizontalDivider(modifier = Modifier.padding(8.dp))
        LazyColumn {
            items(notes){note ->
                Text(text = note.title)
            }
        }
    }
}

@Composable
fun NoteRow(
    note: Note,
    modifier: Modifier=Modifier,
    onNoteClicked: (Note) -> Unit
){
    Surface(
        modifier
            .clip(RoundedCornerShape(topEnd = 33.dp, bottomStart = 33.dp))
            .fillMaxWidth()
            .padding(4.dp),
        color = Color(0xFFDFE6EB),
        tonalElevation = 6.dp,
        shadowElevation = 6.dp
    ) {
        Column(modifier = Modifier
            .padding(horizontal = 14.dp, vertical = 6.dp),
            horizontalAlignment = Alignment.Start) {
            Text(text = note.title, style = MaterialTheme.typography.titleMedium)
            Text(text = note.description, style = MaterialTheme.typography.titleSmall)

        }

    }
}


@Preview(showBackground = true)
@Composable
fun NoteScreenPreview() {
//    NoteScreen(notes = NoteDataSource().loadNotes(), onAddNote = {}, onRemoveNote = {})
    NoteRow(note = NoteDataSource().loadNotes()[0]) {
        
    }
}