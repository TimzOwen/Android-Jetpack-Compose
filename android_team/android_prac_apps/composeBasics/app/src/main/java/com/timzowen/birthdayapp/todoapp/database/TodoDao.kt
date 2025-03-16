package com.timzowen.birthdayapp.todoapp.database

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.timzowen.birthdayapp.todoapp.data.Todo

interface TodoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: Todo)

}