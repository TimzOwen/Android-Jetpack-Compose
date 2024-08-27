package com.timzowen.jetnotesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.timzowen.jetnotesapp.screen.NoteScreen
import com.timzowen.jetnotesapp.ui.theme.JetNotesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetNotesAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    NoteScreen(
                        notes = emptyList(),
                        onAddNote = {},
                        onRemoveNote = { }
                    )
                }
            }
        }
    }
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