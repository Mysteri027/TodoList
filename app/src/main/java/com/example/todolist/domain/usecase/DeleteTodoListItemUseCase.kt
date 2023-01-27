package com.example.todolist.domain.usecase

import com.example.todolist.domain.model.TodoItem
import com.example.todolist.domain.repository.TodoListRepository

class DeleteTodoListItemUseCase(
    private val todoListRepository: TodoListRepository
) {

    fun deleteTodoListItem(todoItem: TodoItem) {
        todoListRepository.deleteTodoListItem(todoItem = todoItem)
    }
}