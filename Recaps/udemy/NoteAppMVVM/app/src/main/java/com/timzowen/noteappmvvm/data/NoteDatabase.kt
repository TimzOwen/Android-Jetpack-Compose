package com.timzowen.noteappmvvm.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.timzowen.noteappmvvm.model.Note
import com.timzowen.noteappmvvm.utils.DateTimeConverter
import com.timzowen.noteappmvvm.utils.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateTimeConverter::class, UUIDConverter::class)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao() : NoteDatabaseDao
}