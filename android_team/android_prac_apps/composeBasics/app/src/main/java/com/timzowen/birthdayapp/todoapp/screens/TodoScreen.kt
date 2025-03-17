package com.timzowen.birthdayapp.todoapp.screens

import androidx.compose.animation.core.copy
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.approachLayout
import androidx.compose.ui.unit.dp
import com.timzowen.birthdayapp.todoapp.data.Todo
import com.timzowen.birthdayapp.todoapp.viewmodel.TodoViewModel

@Composable
fun TodoScreen(modifier: Modifier = Modifier, viewModel: TodoViewModel) {

    val todos by viewModel.todos.collectAsState()
    var newTask by remember { mutableStateOf("") }

    Column(modifier=Modifier.padding(16.dp)) {
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
            OutlinedTextField(
                value = newTask,
                onValueChange = {newTask = it},
                label = { Text("New Task") },
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Button(
                onClick = {
                    if (newTask.isNotBlank()) {
                        viewModel.addTodo(newTask)
                        newTask = ""
                    }
                }
            ) {
                Text("Add")
            }
        }
    }

    LazyColumn {
        items(todos){ todo ->
            TodoItem(todo = todo, onTodoChange = { updatedTodo ->
                viewModel.updateTodo(updatedTodo)
            },
                onDelete = {
                    viewModel.deleteTodo(it)
                })
        }
    }

}

@Composable
fun TodoItem(todo: Todo, onTodoChange: (Todo) -> Unit, onDelete: (Todo) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                onTodoChange(todo.copy(isCompleted = !todo.isCompleted))
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = todo.isCompleted,
            onCheckedChange = { isChecked ->
                onTodoChange(todo.copy(isCompleted = isChecked))
            }
        )
        Text(
            text = todo.task,
            modifier = Modifier.weight(1f)
        )
        IconButton(onClick = { onDelete(todo) }) {
            Icon(Icons.Filled.Delete, contentDescription = "Delete")
        }
    }
}