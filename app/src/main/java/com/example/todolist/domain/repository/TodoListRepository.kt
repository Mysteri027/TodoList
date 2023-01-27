package com.example.todolist.domain.repository

import com.example.todolist.domain.model.TodoItem

interface TodoListRepository {

    fun getTodoList() : List<TodoItem>
    fun addTodoListItem(todoItem: TodoItem)
    fun deleteTodoListItem(todoItem: TodoItem)

}