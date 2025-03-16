package com.timzowen.birthdayapp.todoapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.timzowen.birthdayapp.todoapp.data.Todo

@Database(entities = [Todo::class], version = 1, exportSchema = false)
abstract class TodoDatabase : RoomDatabase(){
    abstract fun todoDao() : TodoDao

}