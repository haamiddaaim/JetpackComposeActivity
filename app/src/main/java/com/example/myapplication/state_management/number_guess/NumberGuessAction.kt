package com.example.myapplication.state_management.number_guess

sealed interface NumberGuessAction {
    data object OnGuessClick: NumberGuessAction
            //outline all things initiated with a action that a user could do
    data class OnNumberTextChange (val newNumberText: String) : NumberGuessAction
    data object OnStartNewGameButtonClick : NumberGuessAction

    //how to bundle all of the actions a user could do on a screen in one interface
}