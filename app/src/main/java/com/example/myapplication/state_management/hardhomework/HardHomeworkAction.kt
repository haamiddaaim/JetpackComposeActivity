package com.example.myapplication.state_management.hardhomework

import com.example.myapplication.state_management.number_guess.NumberGuessAction


sealed interface HardHomeworkAction {

    //outline all things initiated with a action that a user could do

    data class OnDeleteButtonClick (val todo : HardHomeworkState): HardHomeworkAction
    object OnAddButtonClick : HardHomeworkAction
    data class onCheckButtonClick (val todo : HardHomeworkState, val isChecked: Boolean): HardHomeworkAction


}