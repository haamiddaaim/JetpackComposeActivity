package com.example.myapplication.state_management.homework

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.myapplication.state_management.number_guess.NumberGuessState

@Composable
fun Easy2(modifier: Modifier = Modifier) {
    var isChecked by remember {
        mutableStateOf(false)
    }
    var easymodel by remember {
        mutableStateOf(Easy2Model(title = "Bring out the trash", description = "Better do this before wife comes home", isChecked = false ))
    }
    Row(
        modifier = modifier
            // .background(Color.Red.copy(alpha = 0.7f))
            // alpha refers to the transparency of a color, with 0 being fully transparent and 255 being fully opaque.
            .padding(16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            //if you want to add space between your things inside of column...you can give it a spacing arrangement
            modifier = Modifier
            // .background(Color.Yellow)
        ) {
            Text(
                text = easymodel.title,
                fontWeight = FontWeight.Bold,
                textDecoration = if (isChecked) TextDecoration.LineThrough else TextDecoration.None
            )
            Text(
                text = easymodel.description,
                textDecoration = if (isChecked) TextDecoration.LineThrough else TextDecoration.None
            )
        }
        Checkbox(
            //  modifier = Modifier.background(Color.Black),
            checked = isChecked,
            onCheckedChange = { newState ->
                isChecked = newState
            }
        )
    }
}