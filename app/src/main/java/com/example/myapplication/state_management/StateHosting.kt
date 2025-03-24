package com.example.myapplication.state_management

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun StateHoistingDemo(modifier: Modifier = Modifier) {
    var counter by rememberSaveable {
        mutableIntStateOf(0)
    }
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
Counter(
counter = counter,
    onCounterButtonClick = {
        counter++
        //counter += 2 how to make it count by 2
    }
)
        Button(
            onClick = {
                counter = 0
            }
        ) {
            Text("Reset Counter")
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun StateHoistingPreview() {
    MyApplicationTheme {
        StateHoistingDemo()
    }
}