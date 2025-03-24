package com.example.myapplication.state_management

import android.content.ClipData.Item
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme


@Composable
fun Counter(
    counter: Int,
    onCounterButtonClick: () -> Unit,
    modifier: Modifier = Modifier
) {
//     var count by rememberSaveable {
//         mutableIntStateOf(0)
            // listOf<String>(
             //creates state of mutable list of strings
            // "Item"


      //  mutableIntStateOf(0)
         //remembersavable takes the valu e of the state and saves it in a bundle which can be restored across configuration changes like screen rotation
   // }
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = onCounterButtonClick
               // items += "Item"
                //increments this count by 1
                //only update state like count++ in noncomposables or it will create side effects like an infinite loop
            )
        {
            Text("Count: $counter")
            //where the text of the button is determined
        }
//        Text(
//            text = items.toString(),
//            modifier = Modifier
//                .align(Alignment.TopCenter)
//        )
    }
    }
//        {
//            Text("Count: ${count}")
//            //recomposables is when a comp is called again with new inputs
//            //never have a state directly inside of a composable
//            )


@Preview(
    showBackground = true
)
@Composable
private fun CounterPreview() {
    MyApplicationTheme {
Counter(
    counter = 0,
    onCounterButtonClick = {}
)
    }
}