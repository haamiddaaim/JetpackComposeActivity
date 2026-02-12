package com.example.myapplication.state_management.hardhomework

data class HardHomeworkState (
    val id: Int,
    val title: String,
    val description: String,
    val isChecked: Boolean = false
)