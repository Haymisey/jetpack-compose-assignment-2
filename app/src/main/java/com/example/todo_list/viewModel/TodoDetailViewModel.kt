package com.example.todo_list.viewModel

import androidx.lifecycle.ViewModel
import com.example.todo_list.local.TodoEntity
import com.example.todo_list.repository.TodoRepository
import kotlinx.coroutines.flow.Flow

class TodoDetailViewModel(
    private val repository: TodoRepository,
    private val todoId: Int
) : ViewModel() {
    val todo: Flow<TodoEntity?> = repository.getTodoById(todoId)
}