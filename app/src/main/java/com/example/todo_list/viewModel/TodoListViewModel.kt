package com.example.todo_list.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todo_list.repository.TodoRepository
import kotlinx.coroutines.launch

class TodoListViewModel(
    private val repository: TodoRepository
) : ViewModel() {
    val todos = repository.todos

    private val _uiState = mutableStateOf(TodoListUiState())
    val uiState: State<TodoListUiState> = _uiState

    init {
        loadTodos()
    }

    fun loadTodos() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)
            try {
                repository.refreshTodos()
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = null
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = e.message ?: "Unknown error"
                )
            }
        }
    }
}

data class TodoListUiState(
    val isLoading: Boolean = false,
    val error: String? = null
)