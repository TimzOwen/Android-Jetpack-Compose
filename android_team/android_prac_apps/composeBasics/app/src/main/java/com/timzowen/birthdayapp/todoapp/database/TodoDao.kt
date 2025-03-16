package com.timzowen.birthdayapp.todoapp.database

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.timzowen.birthdayapp.todoapp.data.Todo
import kotlinx.coroutines.flow.Flow

interface TodoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: Todo)

    @Update
    suspend fun updateTodo(todo: Todo)

    @Delete
    suspend fun deleteTodo(todo: Todo)

    @Query("SELECT * FROM todos")
    fun getAllNotes(): Flow<List<Todo>>

}