package com.timzowen.jetnotesapp.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.timzowen.jetnotesapp.data.NoteData
import com.timzowen.jetnotesapp.model.Note

class NoteViewModel: ViewModel() {
    private var notesList = mutableStateListOf<Note>()

    init {
        notesList.addAll(NoteData().loadNotes())
    }

    fun addNote(note: Note){
        notesList.add(note)
    }

    fun removeNote(note: Note){
        notesList.remove(note)
    }

    fun getAllNotes(): List<Note>{
        return notesList
    }
}