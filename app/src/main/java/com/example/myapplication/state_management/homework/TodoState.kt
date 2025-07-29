package com.example.myapplication.state_management.homework

data class TodoState(
    val title: String,
    val description: String,
    var isChecked: Boolean,
)
