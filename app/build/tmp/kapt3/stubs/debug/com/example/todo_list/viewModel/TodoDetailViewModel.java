package com.example.todo_list.viewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/todo_list/viewModel/TodoDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/todo_list/repository/TodoRepository;", "todoId", "", "(Lcom/example/todo_list/repository/TodoRepository;I)V", "todo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/todo_list/local/TodoEntity;", "getTodo", "()Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public final class TodoDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.todo_list.repository.TodoRepository repository = null;
    private final int todoId = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.todo_list.local.TodoEntity> todo = null;
    
    public TodoDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.todo_list.repository.TodoRepository repository, int todoId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.todo_list.local.TodoEntity> getTodo() {
        return null;
    }
}