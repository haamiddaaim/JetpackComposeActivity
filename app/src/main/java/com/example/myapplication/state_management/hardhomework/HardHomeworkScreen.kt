package com.example.myapplication.state_management.hardhomework

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HardHomeworkScreen(modifier: Modifier = Modifier,
                       viewModel: HardHomeworkViewModel = viewModel()
    )
{

//    var todo by remember  {
//        mutableStateOf(HardHomeworkState(1, "title", "description", false))
//    }
//    val items by remember {
//        mutableStateOf(viewModel.state)
//    }

    var isChecked by remember {
        mutableStateOf(false)
    }
    var title by remember {
        mutableStateOf("")
    }
    var description by remember {
        mutableStateOf("")
    }
    Scaffold (
        bottomBar = {

                Row(
//                verticalAlignment = (Alignment.CenterVertically
//                ),

                ) {
                    Column(
                        modifier = modifier,
                        // .background(Color.Magenta),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                        //horizontalAlignment = Alignment.Start
                    )
                    {
                        TextField(

                            value = title,
                            // modifier = Modifier.padding(start = 10.dp),
                            // colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.Yellow),

                            // .fillMaxSize(),
                            onValueChange = { newText ->
                                title = newText
                                //how to update the text to the new text
                            }, placeholder = {
                                Text(
                                    "" +
                                            "Title" +
                                            ""
                                )
                            }
                        )
//                    Spacer(
//                        modifier = Modifier.height(16.dp)
//                    )
                        TextField(
                            // modifier = Modifier.padding(start = 10.dp),
                            value = description,

                            // colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.Yellow),

                            // .fillMaxSize(),
                            onValueChange = { newText ->
                                description = newText
                                // onAction(NumberGuessAction.OnNumberTextChange(newText))
                                //how to update the text to the new text
                            }, placeholder = {
                                Text("Description")
                            }
                        )
                    }
                    Button(
                        modifier = Modifier
                            .weight(2.5f)
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),

//                    modifier = Modifier
//
                        //.fillMaxWidth()

                        onClick = {

                        },


                        ) {
                        Text("Add")
                        //where the text of the button is determined
                    }
                }
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()

        ) {
            items(15) { state ->
                TodoItem(
                    state =  state,
                    onEvent = viewModel::onEvent,
                    modifier = Modifier
                        .padding(paddingValues)
                )
            }
        }


    }
}