package com.timzowen.noteappmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.timzowen.noteappmvvm.data.NoteDataSource
import com.timzowen.noteappmvvm.model.Note
import com.timzowen.noteappmvvm.screen.NoteScreen
import com.timzowen.noteappmvvm.ui.theme.NoteAppMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NoteApp()
        }
    }
}

@Composable
fun NoteApp() {
    NoteAppMVVMTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            val notes = remember { mutableStateListOf<Note>() }
            NoteScreen(
                notes = notes,
                onAddNote = {
                    notes.add(it)
                },
                onRemoveNote = {
                    notes.remove(it)
                }
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NoteAppMVVMTheme {
        NoteScreen(notes = emptyList(), onAddNote = {}, onRemoveNote = {})
    }
}