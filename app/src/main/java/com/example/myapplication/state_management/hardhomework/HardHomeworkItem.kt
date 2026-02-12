package com.example.myapplication.state_management.hardhomework

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun TodoItem(
    state: HardHomeworkState,
    onEvent: (HardHomeworkAction) -> Unit,
    modifier: Modifier = Modifier) {


    Column (
        modifier = modifier
            .fillMaxSize()
          //  .padding(padding)
    ){
    LazyColumn( modifier = Modifier.weight(1f)
    ) {
        items (15) {
            Row(
                modifier = modifier
                    //.background(Color.Red.copy(alpha = 0.7f))
                    // alpha refers to the transparency of a color, with 0 being fully transparent and 255 being fully opaque.
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                    //if you want to add space between your things inside of column...you can give it a spacing arrangement
                    modifier = Modifier
                    //  .background(Color.Yellow)
                ) {
                    Text(
                        text = "Todo item ${it + 1}",
                        fontWeight = FontWeight.Bold,
                        textDecoration = if (state.isChecked) TextDecoration.LineThrough else TextDecoration.None
                    )
                    Text(
                        text = "Todo description ${it + 1}",
                        textDecoration = if (state.isChecked) TextDecoration.LineThrough else TextDecoration.None
                    )
                }
                Checkbox(
                    modifier = Modifier
                    // .background(Color.Black)
                    //  .weight(1f)
                    ,
                    checked = state.isChecked,
                    onCheckedChange = { newState ->
                        onEvent(HardHomeworkAction.onCheckButtonClick(state, newState))
                    })
                IconButton(
                    onClick = {
                    onEvent(HardHomeworkAction.OnDeleteButtonClick(state))
                    },
                    modifier = Modifier
                    // .background(Color.Magenta),
                ) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = null,
                    )
                }}}}}
}