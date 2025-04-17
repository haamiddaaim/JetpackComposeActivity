package com.example.myapplication.state_management.homework


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowWidthSizeClass
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun TodoItemList(modifier: Modifier) {

    val windowClass = currentWindowAdaptiveInfo().windowSizeClass


    var filledTextTitle by remember {
        mutableStateOf("")
    }
    var filledTextDescription by remember {
        mutableStateOf("")
    }
    Scaffold(
        bottomBar = {
            Row {
                Column(
                    modifier = Modifier
                        .weight(6f)
                        .padding(vertical = 10.dp),
                    verticalArrangement = Arrangement.spacedBy(
                        10.dp, Alignment.CenterVertically
                    )
                )

                {

                    Row(
                        modifier = Modifier.padding(start = 10.dp)
                    ) {

                        TextField(

                            value = filledTextTitle,

                            // colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.Yellow),

                            // .fillMaxSize(),
                            onValueChange = { newText ->
                                filledTextTitle = newText
                                //how to update the text to the new text
                            }, placeholder = {
                                Text("Title")
                            }

                        )
                    }
                    Row(
                        modifier = Modifier.padding(start = 10.dp)
                    ) {

                        TextField(

                            value = filledTextDescription,

                            // colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.Yellow),

                            // .fillMaxSize(),
                            onValueChange = { newText ->
                                filledTextDescription = newText
                                // onAction(NumberGuessAction.OnNumberTextChange(newText))
                                //how to update the text to the new text
                            }, placeholder = {
                                Text("Description")
                            }

                        )
                    }


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
        },

    ) { padding ->
        @Composable
        fun MyLazyList(modifier: Modifier = Modifier) {

            LazyColumn(
                modifier = modifier
                    .fillMaxSize()
                    .padding(padding)

            ) {
                items(16) {
                    val checked = remember {
                        mutableStateOf(
                            Todo(
                                title = "", description = "", isChecked = false,
                            ),
                        )
                    }
                    Row(
                        //modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(7f)
                                .padding(vertical = 20.dp, horizontal = 20.dp),
                            verticalArrangement = Arrangement.spacedBy(
                                10.dp, Alignment.CenterVertically
                            )
                        ) {

                            Row {
                                Text(
                                    text = "Todo item $it",
//                                modifier = Modifier
//                                    .padding(start = 20.dp),
                                    fontWeight = FontWeight.Bold,
                                    textDecoration = if (checked.value.isChecked) TextDecoration.LineThrough else TextDecoration.None

                                )
                            }
                            Row {
                                Text(
                                    text = "Todo description $it",
//                                modifier = Modifier
//                                    .padding(start = 20.dp),
                                    textDecoration = if (checked.value.isChecked) TextDecoration.LineThrough else TextDecoration.None

                                )
                            }


                        }

                        Row(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically

                        ) {
                            Box(
                                modifier = Modifier,

                                ) {
                                Checkbox(


                                        checked = checked.value.isChecked, onCheckedChange = { isChecked ->
                                        checked.value = checked.value.copy(isChecked = isChecked)

                                    }, modifier = Modifier.padding(end = 20.dp)
                                )


                            }

                        }
                        IconButton(
                            onClick = {

                            }
                            ,
                            modifier = Modifier
                                   .padding(start = 20.dp, end = 20.dp),
                        ) {
                        Icon(

                            imageVector = Icons.Default.Delete,
                            contentDescription = null,

                            )
                    }
                        }
                }

            }

        }

        when (windowClass.windowWidthSizeClass) {
            WindowWidthSizeClass.COMPACT, WindowWidthSizeClass.MEDIUM -> {
                MyLazyList()
            }

            WindowWidthSizeClass.EXPANDED -> {
                Row(
                    modifier = Modifier.fillMaxSize()
                ) {

                    MyLazyList(
                        modifier = Modifier
                            .weight(7f)
                            .fillMaxHeight()
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true, device = Devices.NEXUS_6
    //how to change the size of the preview in code and set the device that is used
)
@Composable
private fun TodoItemListPreview() {
    MyApplicationTheme {
        TodoItemList(modifier = Modifier)
    }

}