package com.example.todolist.domain.usecase

import com.example.todolist.domain.model.TodoItem
import com.example.todolist.domain.repository.TodoListRepository

class AddTodoListItemUseCase(
    private val todoListRepository: TodoListRepository
) {
    fun addTodoListItem(todoItem: TodoItem) {
        todoListRepository.addTodoListItem(todoItem = todoItem)
    }
}