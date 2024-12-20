package com.timzowen.noteappmvvm.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.timzowen.noteappmvvm.model.Note

@Dao
interface NoteDatabaseDao {

    @Query("SELECT * from notes_table")
    fun getAllNotes(): List<Note>

    @Query("SELECT * from notes_table where id=:id")
    fun getNote(id: String): Note

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateNote(note: Note)

    @Query("DELETE from notes_table")
    fun deleteAllNotes()

    @Delete
    fun deleteNote(note: Note)
}
