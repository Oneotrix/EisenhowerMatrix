package com.oneotrix.eisenhowermatrix.view.model

data class Task(
    val id: Int,
    val title: String,
    val description: String,
    val status: Status
)
