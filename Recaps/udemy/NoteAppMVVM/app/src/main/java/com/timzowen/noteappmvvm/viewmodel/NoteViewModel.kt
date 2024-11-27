package com.timzowen.noteappmvvm.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.timzowen.noteappmvvm.data.NoteDataSource
import com.timzowen.noteappmvvm.model.Note

class NoteViewModel : ViewModel() {
    private val notesList = mutableStateListOf<Note>()

    init {
        notesList.addAll(NoteDataSource().loadNotes())
    }

    fun addNote(note: Note){
        notesList.add(note)
    }

    fun deleteNote(note: Note){
        notesList.remove(note)
    }

    fun getAllNotes(): List<Note>{
        return notesList
    }
}