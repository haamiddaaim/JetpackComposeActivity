package com.example.myapplication.state_management.homework

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun TodoList(modifier: Modifier) {
    data class Todo(
        val title: String, val description: String, val isChecked: Boolean

    )

    @Composable
    fun Checkbox() {
        val checked = remember {
            mutableStateOf(
                Todo(
                    title = "", description = "", isChecked = false
                ),
            )

        }

        Row(
            modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(7f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterVertically)
            ) {

                Row(
                    modifier = Modifier.width(300.dp)


                ) {
                    Text(
                        text = "Bring out the trash",
                        //if (checked.value.isChecked) "Bring out the trash" else "ieowue",
                        fontWeight = FontWeight.Bold,
                        textDecoration = if (checked.value.isChecked) TextDecoration.LineThrough else TextDecoration.None

                    )
                }
                Row {
                    Text(

                        text = "Better do this before wife comes home.",
                        textDecoration = if (checked.value.isChecked) TextDecoration.LineThrough else TextDecoration.None
                    )
                }


            }



            Row(
                modifier = Modifier.weight(1f)
            ) {
                Box(
                    modifier = Modifier

                ) {
                    Checkbox(
                        checked = checked.value.isChecked, onCheckedChange = { isChecked ->
                            checked.value = checked.value.copy(isChecked = isChecked)


                        }, modifier = Modifier.padding(end = 105.dp)
                    )

                    IconButton(
                        onClick = {}
                                ,
                                modifier = Modifier
                                .padding(start = 20.dp)
                    ) {
                    Icon(
//                        modifier = Modifier
//                            .padding(start = 20.dp, top = 11.dp),
                        imageVector = Icons.Default.Delete,
                        contentDescription = null,

                        )

                }
                    }
            }
        }
    }



    Checkbox()

    //    }
}


@Preview(
    showBackground = true
)
@Composable
private fun TodoListPreview() {
    MyApplicationTheme {
        TodoList(
            modifier = Modifier
        )
    }
}