package com.timzowen.birthdayapp.todoapp

import com.timzowen.birthdayapp.todoapp.data.Todo
import com.timzowen.birthdayapp.todoapp.database.TodoDao
import kotlinx.coroutines.flow.Flow

class TodoRepository(private val todoDao: TodoDao) {

    fun getAllTodos(): Flow<List<Todo>> = todoDao.getAllNotes()

    suspend fun insertTodo(todo: Todo) = todoDao.insertTodo(todo)

    suspend fun updateTodo(todo: Todo) = todoDao.updateTodo(todo)

    suspend fun deleteTodo(todo: Todo) = todoDao.deleteTodo(todo)
}