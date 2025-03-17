package com.timzowen.birthdayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.room.Room
import com.timzowen.birthdayapp.todoapp.screens.TodoScreen
import com.timzowen.birthdayapp.ui.theme.AppTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.ViewModelProvider
import com.timzowen.birthdayapp.todoapp.TodoRepository
import com.timzowen.birthdayapp.todoapp.database.TodoDatabase
import com.timzowen.birthdayapp.todoapp.viewmodel.TodoViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Build the Room database
        val db = Room.databaseBuilder(
            applicationContext,
            TodoDatabase::class.java, "todo-database"
        ).build()

        // Create the DAO and repository
        val todoDao = db.todoDao()
        val repository = TodoRepository(todoDao)

        // Create a ViewModelFactory
        val viewModelFactory = object : ViewModelProvider.Factory {
            override fun <T : androidx.lifecycle.ViewModel> create(modelClass: Class<T>): T {
                if (modelClass.isAssignableFrom(TodoViewModel::class.java)) {
                    @Suppress("UNCHECKED_CAST")
                    return TodoViewModel(repository) as T
                }
                throw IllegalArgumentException("Unknown ViewModel class")
            }
        }

        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .systemBarsPadding()
                ) {
                    // Get the ViewModel using the factory
                    val viewModel: TodoViewModel = viewModel(factory = viewModelFactory)
                    TodoScreen(modifier = Modifier,viewModel)
                }
            }
        }
    }
}