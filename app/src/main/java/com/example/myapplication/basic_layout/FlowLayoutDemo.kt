@file:OptIn(ExperimentalLayoutApi::class)

package com.example.myapplication.basic_layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.FlowRowOverflow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun FlowLayoutDemo(modifier: Modifier = Modifier) {
    FlowRow(
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        maxLines = 4,
        overflow = FlowRowOverflow.expandOrCollapseIndicator(
            expandIndicator = {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Expand"
                    )
                }

            },
            collapseIndicator = {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = "Expand"
                    )
                }
            }

//flowlayouts allow text to jump to next line when there's too many to fit in the first line
        )
    )
    {
        for (i in 1..30) {
            //shortcut for having 30 of the assistchips
            AssistChip(
                onClick = {},
                label = {
                    Text("Hello $i")
                })
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