package com.example.todo_list

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.todo_list.local.TodoDatabase
import com.example.todo_list.remote.RetrofitClient
import com.example.todo_list.repository.TodoRepository
import com.example.todo_list.ui.TodoDetailScreen
import com.example.todo_list.ui.TodoListScreen
import com.example.todo_list.viewModel.TodoDetailViewModel
import com.example.todo_list.viewModel.TodoListViewModel

@Composable
fun TodoNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "todo_list"
    ) {
        composable("todo_list") {
            val viewModel: TodoListViewModel = viewModel(
                factory = TodoViewModelFactory(
                    TodoRepository(
                        RetrofitClient.instance,
                        TodoDatabase.getDatabase(LocalContext.current).todoDao()
                    )
                )
            )
            TodoListScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable("todo_detail/{todoId}") { backStackEntry ->
            val todoId = backStackEntry.arguments?.getString("todoId")?.toIntOrNull() ?: 0
            val viewModel: TodoDetailViewModel = viewModel(
                factory = TodoDetailViewModelFactory(
                    TodoRepository(
                        RetrofitClient.instance,
                        TodoDatabase.getDatabase(LocalContext.current).todoDao()
                    ),
                    todoId
                )
            )
            TodoDetailScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    }
}

class TodoViewModelFactory(private val repository: TodoRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TodoListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TodoListViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

class TodoDetailViewModelFactory(
    private val repository: TodoRepository,
    private val todoId: Int
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TodoDetailViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TodoDetailViewModel(repository, todoId) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}