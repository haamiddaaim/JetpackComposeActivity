package com.example.myapplication.state_management.hardhomework

import com.example.myapplication.state_management.number_guess.NumberGuessAction


sealed interface HardHomeworkAction {
    data object OnGuessClick :
        HardHomeworkAction

    //outline all things initiated with a action that a user could do
    data class OnNumberTextChange(val newNumberText: String) :
        HardHomeworkAction

    data object OnDeleteButtonClick : HardHomeworkAction
}

