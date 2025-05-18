package com.example.todo_list.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/example/todo_list/repository/TodoRepository;", "", "todoApiService", "Lcom/example/todo_list/remote/TodoApiService;", "todoDao", "Lcom/example/todo_list/local/TodoDao;", "(Lcom/example/todo_list/remote/TodoApiService;Lcom/example/todo_list/local/TodoDao;)V", "todos", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/todo_list/local/TodoEntity;", "getTodos", "()Lkotlinx/coroutines/flow/Flow;", "getTodoById", "id", "", "refreshTodos", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TodoRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.todo_list.remote.TodoApiService todoApiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.todo_list.local.TodoDao todoDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.todo_list.local.TodoEntity>> todos = null;
    
    public TodoRepository(@org.jetbrains.annotations.NotNull()
    com.example.todo_list.remote.TodoApiService todoApiService, @org.jetbrains.annotations.NotNull()
    com.example.todo_list.local.TodoDao todoDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.todo_list.local.TodoEntity>> getTodos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.todo_list.local.TodoEntity> getTodoById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshTodos(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}