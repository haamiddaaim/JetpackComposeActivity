package com.example.myapplication.state_management.homework

import android.widget.TextView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowWidthSizeClass
import com.example.myapplication.state_management.number_guess.NumberGuessAction
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun TodoItemList(modifier: Modifier) {

    val windowClass = currentWindowAdaptiveInfo().windowSizeClass

    data class Todo(
        val title: String,
        val description: String,
        val isChecked: Boolean
    )

    val checked = remember {
        mutableStateOf(
            Todo(
                title = "",
                description = "",
                isChecked = false
            ),
        )

    }
    Scaffold (
        modifier = Modifier.wrapContentSize()
            .background(Color.Green)
            .wrapContentHeight(
            )
            .wrapContentWidth()
        ,
        bottomBar = {
            BottomAppBar {

                Box(
                    modifier = modifier
                        //.wrapContentSize()
                       .fillMaxWidth()
                        .background(Color.Black),

                   contentAlignment  = Alignment.BottomStart,

                 //  verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Bottom)
                ) {
                    TextField(
                        value = "title",
                        colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.Yellow),
                        modifier = Modifier
                            .fillMaxWidth(),
                           // .fillMaxSize(),
                        onValueChange = { newText ->
                            // onAction(NumberGuessAction.OnNumberTextChange(newText))
                            //how to update the text to the new text
                        }

                        )
                }
            }
        },
       // modifier = Modifier.background(Color.Black),
        containerColor = Color.Red,
        contentColor = Color.Red,



    ) { padding ->
    @Composable
    fun MyLazyList(modifier: Modifier = Modifier) {
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(padding)

        ) {
            items(16) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .weight(7f)
                            .padding(vertical = 20.dp, horizontal = 20.dp),
                        //  .padding(horizontal = 30.dp, vertical = 10.dp),
                        //  horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically)
                    ) {

                        Row(

                        ) {
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
                                checked = checked.value.isChecked,
                                onCheckedChange = {


                                },
                                modifier = Modifier
                                    .padding(end = 20.dp)
                            )

                        }

                    }
                    Icon(
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                        imageVector = Icons.Default.Delete,
                        contentDescription = null,

                        )
                }
            }

        }

    }
    Box(
        modifier = Modifier
            .fillMaxSize()

    )
    {
        when (windowClass.windowWidthSizeClass) {
            WindowWidthSizeClass.COMPACT,
            WindowWidthSizeClass.MEDIUM -> {
                MyLazyList()
            }

            WindowWidthSizeClass.EXPANDED -> {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(3f)
                            .background(Color.Red)
                    ) {
                        Text("Menu Option 1")
                        Text("Menu Option 2")
                        Text("Menu Option 3")
                    }
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



    }

@Preview(
    showBackground = true,
    device = Devices.NEXUS_6
    //how to change the size of the preview in code and set the device that is used
)
@Composable
private fun TodoItemListPreview() {
    MyApplicationTheme {
        TodoItemList(modifier = Modifier)
    }

}