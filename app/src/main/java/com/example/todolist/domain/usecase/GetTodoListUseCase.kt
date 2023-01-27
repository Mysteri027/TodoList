package com.example.todolist.domain.usecase

import com.example.todolist.domain.model.TodoItem
import com.example.todolist.domain.repository.TodoListRepository

class GetTodoListUseCase(
    private val todoListRepository: TodoListRepository
) {

    fun getTodoList(): List<TodoItem> {
        return todoListRepository.getTodoList()
    }
}