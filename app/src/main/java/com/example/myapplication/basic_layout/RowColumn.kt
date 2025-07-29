package com.example.myapplication.basic_layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun RowColumnDemo (modifier: Modifier = Modifier) {
Row  (
    modifier = Modifier.fillMaxSize(),
   // horizontalAlignment = Alignment.CenterHorizontally,
    verticalAlignment = Alignment.CenterVertically

//verticalAlignment when using rows and horizontalAlignment for Columns

//    horizontalArrangement = Arrangement.aligned(Alignment.Horizontal { size, space, layoutDirection ->
//        (space * 0.5f).roundToInt()
//        //how to make a center alignment at exactly 50% of the space we have in our layout
//    }
//        //size gives you the size of the parent layout, space is all the space the rows need together, layoutdirection is right to left or left to right
//    //arrangement happens on the main axis alignment happens on another axis
//    //how to come up with your own alignment rule
//    )
){
//    Text(
//        text = "Hello World!",
//        fontSize = 40.sp,
//        modifier = Modifier
//            .width(150.dp)
//            .alignBy(LastBaseline)
//            //.alignByBaseline()
//        //by default it aligns to first baseline
//        //baseline is the invisible line at the bottom of a text
//        //how to align the bottom of each text
//
//    )
//    Text(
//        text = "Hello World!",
//        fontSize = 20.sp,
//        modifier = Modifier
//            .alignByBaseline()
//
//    )
Box(
    modifier = Modifier
        .size(100.dp)
        .background(Color.Red)
        .weight(1f)
)
    Column (
        modifier = Modifier
            .weight(3f)
    ) {
        Box(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .background(Color.Blue)


        )
        Box(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .background(Color.Gray)


        )
    }

//    Box(
//    modifier = Modifier
//        .size(100.dp)
//        .background(Color.Green)
//        .weight(1f)
//)

//    Text("Help me please")
//    Text("Help me please")
    //column is a linear layout with vertical orientation
}
    //comp is a shortcut to this
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFF
)
@Composable
private fun RowColumnDemoPreview () {
    MyApplicationTheme {
        RowColumnDemo()
    }
    //prev is a shortcut to this
}