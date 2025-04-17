package com.example.myapplication.state_management.number_guess

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlin.random.Random

class NumberGuessViewModel : ViewModel() {
//    var state by mutableStateOf(NumberGuessState())
//        private set
    //this is a compose state as opposed to the state flow below
    //private set is to set it to just the viewmodel is allowed to change the state but the getter var state is actually public so you can observe it from the ui but not change the state from the ui

    private var number = Random.nextInt(1,101)
    //generate random numbers
    private var attempts = 0
        //sets attempts initial at 0
    private val _state = MutableStateFlow(NumberGuessState())
    //state flow is  used to store ui states
    val state = _state.asStateFlow()
    //how to store the state


fun onAction(action: NumberGuessAction) {
    when(action){
        NumberGuessAction.OnGuessClick -> {
val guess = state.value.numberText.toIntOrNull()
            //converts to an int or null
            if (guess != null) {
                attempts++
            }
            _state.update { it.copy(
                guessText = when {
                    guess == null -> "Please enter a number."
                    number > guess-> "Nope, my number is larger."
                    number < guess -> "Nope, my number is smaller."
                    else -> "That was it! You needed $attempts attempts"
                },
                isGuessCorrect = guess == number,
                //how to update if it is correct
                numberText = ""
                //how to reset the number to default after guessing correct
            )
            }
        }
        is NumberGuessAction.OnNumberTextChange -> {
_state.update {
    it.copy(
        numberText = action.newNumberText
        //sets it to the new numbertext
        //it refers to the current state
        //when you copy it will create a new instance that will update while allowing us to change individual fields like numberText
    )
}

        }
        NumberGuessAction.OnStartNewGameButtonClick -> {
number = Random.nextInt()
            _state.update { it.copy(
                numberText = "",
                guessText = null,
                isGuessCorrect = false
            )
            }

        }
        //this is if statements for each action
    }
}
    //how to receive and handle the actions from interface and respond to them with a state update
}
//viewmodel is used to as a place that is used for data that is used to update state
// extension functions take a state flow which is just a data structure that holds a reference to state that convert it to a compose state