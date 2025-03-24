package com.example.myapplication.state_management.homework

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.basic_layout.ScaffoldDemo
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun TodoList(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
              //  .fillMaxWidth()
                .widthIn(350.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterVertically)
        ) {
            Box(
                modifier = Modifier
                    // .background(PrimaryRed)
                    // .height(115.dp)

                    .padding(horizontal = 16.dp)
                // .background(Color.Blue)
                    .width(400.dp)
               // .weight(1f)

            ) {
                Text(
                    text = "Bring out the trash",
                    fontWeight = FontWeight.Bold
                )
                // textAlign =  TextAlign.Start )
            }
            Box(
                modifier = Modifier
                    // .background(PrimaryRed)
                    // .height(115.dp)
                    .width(300.dp)
                    .padding(horizontal = 16.dp)
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


        ) {
            Checkbox(
                checked = true, onCheckedChange = { it }

            )
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun TodoListPreview() {
    MyApplicationTheme {
        TodoList()
    }
}