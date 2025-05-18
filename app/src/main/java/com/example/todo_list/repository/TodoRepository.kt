package com.example.todo_list.repository

import com.example.todo_list.local.TodoDao
import com.example.todo_list.local.TodoEntity
import com.example.todo_list.remote.TodoApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first

class TodoRepository(
    private val todoApiService: TodoApiService,
    private val todoDao: TodoDao
) {
    val todos: Flow<List<TodoEntity>> = todoDao.getAllTodos()

    fun getTodoById(id: Int): Flow<TodoEntity?> {
        return todoDao.getTodoById(id)
    }

    suspend fun refreshTodos() {
        try {
            val remoteTodos = todoApiService.getTodos()
            todoDao.insertAll(remoteTodos.map { todo ->
                TodoEntity(
                    id = todo.id,
                    userId = todo.userId,
                    title = todo.title,
                    completed = todo.completed
                )
            })
        } catch (e: Exception) {
            throw e
        }
    }
}