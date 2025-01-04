package com.example.jetpackcomposeactivity

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class ContactsViewModel(
val helloWorld : String
): ViewModel(){
//in order to we have to have this contactsviewmodel inherit from viewmodel to stop configuration changes when rotated
    var backgroundColor by mutableStateOf(Color.White)
        private set
    //private set because you don't want to be able to change outside of this viewmodel
    //with it we make sure the UI can read this property but cannot set it
    fun  changeBackgroundColor(){
  backgroundColor = Color.Black
    }
}