@file:OptIn(ExperimentalLayoutApi::class)

package com.example.myapplication.basic_layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.FlowRowOverflow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun FlowLayoutDemo (modifier: Modifier = Modifier) {
    FlowRow(
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        maxItemsInEachRow = 3,
overflow = FlowRowOverflow.Clip
    //overflow defines what happens if this items overflow
      //  verticalArrangement = Arrangement.SpaceBetween
//        horizontalArrangement = Arrangement.spacedBy(
//            16.dp,
//            alignment = Alignment.CenterHorizontally)

//flowlayouts allow text to jump to next line when there's too many to fit in the first line
    ) {
        for (i in  1..30) {
            //shortcut for having 30 of the assistchips
        AssistChip(
            onClick = {},
            label = {
Text("Hello $i")
            }      )
    }


        //helps with having many comp that don't fit in the width of the row anymore

    }

}
@Preview(
    showBackground = true
)
@Composable
private fun FlowLayoutDemoPreview() {
    MyApplicationTheme {
        FlowLayoutDemo()
    }

    //lazylayout is a layout that does not draw out all of it's children but only those that we want to see at a time
}