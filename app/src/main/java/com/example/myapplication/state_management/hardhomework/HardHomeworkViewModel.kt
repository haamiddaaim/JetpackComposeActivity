package com.example.myapplication.state_management.hardhomework


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HardHomeworkViewModel : ViewModel() {
//    var state by mutableStateOf(HardHomeworkState())
//        private set

private val _state = MutableStateFlow(HardHomeworkState())
    val state = _state.asStateFlow()


}