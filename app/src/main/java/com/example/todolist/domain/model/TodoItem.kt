package com.example.todolist.domain.model

import java.time.LocalDate

data class TodoItem(
    val title: String,
    val description: String,
    val date: LocalDate = LocalDate.now(),
    val isDone: Boolean
)

















