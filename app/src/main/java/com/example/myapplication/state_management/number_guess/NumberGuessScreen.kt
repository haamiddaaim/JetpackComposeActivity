package com.example.myapplication.state_management.number_guess

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun NumberGuessScreenRoot(modifier: Modifier = Modifier) {
    val viewModel = viewModel<NumberGuessViewModel>()
    //how to get reference to the viewmodel for compose
    val state by viewModel.state.collectAsStateWithLifecycle()
    //how to convert a stateflow into a compose state
    //collectAsStateWithLifecycle makes sure the underlining flow does not keep processing if it goes into the background
    //if any field of the data class changes...this state value will change

    //put viewModel info in a separate composable so we can still preview the viewModel with a constructor added
    NumberGuessScreen(
        state = state,
        onAction = viewModel::onAction,
        //since onAction matches onAction in viewmodel...we can just reference it with viewModel::onAction
        modifier = modifier)
    //calls our NumberGuessScreen comp below

    //this comp is used just for creating the viewmodel and listening to the state
}
@Composable
fun NumberGuessScreen(
    state: NumberGuessState,
onAction: (NumberGuessAction) -> Unit,
    //instead of writing out every single action a user could do we can just write onAction lamda referencing the interface
    modifier: Modifier = Modifier) {

    Column (
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
    ) {
        TextField(
            value = state.numberText,
            onValueChange = { newText ->
                onAction(NumberGuessAction.OnNumberTextChange(newText))
                //how to update the text to the new text
            },
keyboardOptions = KeyboardOptions(
    keyboardType = KeyboardType.Number
    //makes the keyboard only numbers
)
        )
        Button(
            onClick = {
                onAction(NumberGuessAction.OnGuessClick)
            }
        ) {
            Text("Make guess")
        }
        if (state.guessText != null) {
            //if guess text is not null
            Text(
                text = state.guessText
            )
        }
        if (state.isGuessCorrect){
            Button(
                onClick = {
                    onAction(NumberGuessAction.OnStartNewGameButtonClick)
                }
            ) {
                Text("Start new game")
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun NumberGuessScreenPreview() {
    MyApplicationTheme {
        NumberGuessScreen(state = NumberGuessState(),
            onAction = {}

        )
        //now it will reflect to updated number since the comp we are previewing is no longer relies on creating the viewmodel
    }
}