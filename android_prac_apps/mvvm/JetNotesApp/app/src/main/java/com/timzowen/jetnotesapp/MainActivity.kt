package com.timzowen.jetnotesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.timzowen.jetnotesapp.screen.NoteScreen
import com.timzowen.jetnotesapp.screen.NoteViewModel
import com.timzowen.jetnotesapp.ui.theme.JetNotesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetNotesAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    val noteViewModel: NoteViewModel by viewModels() // instantiate
                    NotesApp(noteViewModel)
                }
            }
        }
    }
}

@Composable
fun NotesApp(noteViewModel: NoteViewModel = viewModel()){

    val notesList = noteViewModel.getAllNotes()

    NoteScreen(
        notes = notesList,
        onAddNote = {
            noteViewModel.addNote(it)
        },
        onRemoveNote = {
            noteViewModel.removeNote(it)
        }
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetNotesAppTheme {
        NoteScreen(
            notes = emptyList(),
            onAddNote = {},
            onRemoveNote = { }
        )
    }
}