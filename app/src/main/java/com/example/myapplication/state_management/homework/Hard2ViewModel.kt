package com.example.myapplication.state_management.homework

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class Hard2ViewModel: ViewModel() {
    var state by mutableStateOf(Hard2Model())
        private set
}