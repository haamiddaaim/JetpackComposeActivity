package com.example.myapplication.state_management.homework

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun TodoList(modifier: Modifier) {
    data class Todo(
        val title: String,
        val description: String,
        var isChecked: Boolean

    )
    @Composable
    fun Checkbox () {
        var checked by remember {
            mutableStateOf(
                Todo(
                    title = "",
                    description = "",
                    isChecked = false
                ),
            )

        }
        Checkbox(
            checked = checked.isChecked,
            onCheckedChange = {
                checked.isChecked = true
            }
        )
//        Checkbox(
//            checked = checked.isChecked,
//            onCheckedChange = { isChecked ->
//                checked = isChecked
//
//                }
       // )


            //  checked = false, onCheckedChange = { it }

            //  if (state.isGuessCorrect){

    }

    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
           // modifier = Modifier
              //  .fillMaxWidth()
              //  .width(350.dp),
           // modifier = Modifier
           // .weight(7f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterVertically)
        ) {
            Row (
                modifier = Modifier
                    // .background(PrimaryRed)
                    // .height(115.dp)

                   // .padding(horizontal = 16.dp)
                    // .background(Color.Blue)
                    .width(300.dp)
               // .weight(1f)

            ) {
                Text(
                    text = "Bring out the trash",
                    fontWeight = FontWeight.Bold
                )
                // textAlign =  TextAlign.Start )
            }
            Row(
                modifier = Modifier
                    // .background(PrimaryRed)
                    // .height(115.dp)

                   // .padding(horizontal = 16.dp)

                // .background(Color.Blue)
                // .weight(1f)


            ) {
                Text("Better do this before wife comes home.",
                    )

            }

        }

        Box(
            modifier = Modifier
                // .background(PrimaryRed)
                // .height(115.dp)
                .fillMaxWidth()
                //.padding(horizontal = 16.dp)
            // .background(Color.Blue)
            // .weight(1f)
                .weight(1f)
        ) {
Checkbox()

        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun TodoListPreview() {
    MyApplicationTheme {
        TodoList(
            modifier = Modifier)
    }
}