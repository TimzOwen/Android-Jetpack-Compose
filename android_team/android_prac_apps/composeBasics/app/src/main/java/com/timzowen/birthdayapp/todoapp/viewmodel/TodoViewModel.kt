package com.timzowen.birthdayapp.todoapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.timzowen.birthdayapp.todoapp.TodoRepository
import com.timzowen.birthdayapp.todoapp.data.Todo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TodoViewModel(private val repository: TodoRepository) : ViewModel() {

    private val _todos = MutableStateFlow<List<Todo>>(emptyList())
    val todos: StateFlow<List<Todo>> = _todos.asStateFlow()

    init {
        loadTodos()
    }

    fun loadTodos(){
        viewModelScope.launch {
            repository.getAllTodos().collect{ todos ->
                _todos.value = todos
            }
        }
    }
    fun addTodo(task: String) {
        viewModelScope.launch {
            val newTodo = Todo(task = task)
            repository.insertTodo(newTodo)
        }
    }

    fun updateTodo(todo: Todo){
        viewModelScope.launch {
            repository.updateTodo(todo)
        }
    }

    fun deleteTodo(todo: Todo){
        viewModelScope.launch {
            repository.deleteTodo(todo)
        }
    }
}