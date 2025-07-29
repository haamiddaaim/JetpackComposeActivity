package com.example.myapplication.state_management.homework

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class TodoListViewModel (
//a viewmodel is nothing but a plain class
): ViewModel() {

private val _color = MutableStateFlow(0xFFFFFF)
    //sets the default color to white intially
    val color = _color.asStateFlow()
    //public immutable version of the default color

    //this is the normal approach when using state flow so that view model can change the mutable version but the ui only gets the immutable version



//    var composeColor: Long by mutableStateOf(0xFFFFFF)
//    private set
//
//    fun generateNewColor(){
//       val color = Random.nextLong(0xFFFFFF)
////        //generate random color and cap it at the highest color value white
//    _color.value = color
////        //assign the random color to the state flow
//        composeColor = color
        //assign to the compose color
    }
    //compose version

