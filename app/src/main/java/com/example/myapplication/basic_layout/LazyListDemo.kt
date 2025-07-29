

package com.example.myapplication.basic_layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import kotlin.random.Random

@Composable
fun LazyListDemo(modifier: Modifier = Modifier) {
    LazyRow  (
        modifier = Modifier.fillMaxSize()
        ,

//        verticalArrangement = Arrangement.spacedBy(16.dp),
//horizontalAlignment = Alignment.CenterHorizontally

        //you have to set the height to a fixed height in order for verticalarrangement to work
        //reverseLayout = true
        //contentPadding = PaddingValues(16.dp),
        //controls the padding inside of the lazycolumn instead of outside of it
    ){
        items(100) { i ->
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color(Random.nextInt()))
            )
//get 100 items then we get access to every single index
//            Text("Item $i")
        }
//        for (i in 1..100){
//            Text("Item $i")
//        }
//if you just use Column then it will have to keep track of all 100 items even the ones off screen
        //using Lazycolumn will load the items that's not on the screen as you scroll


//        stickyHeader {
//Text(text = "A",
//    modifier = Modifier
//        .fillMaxWidth()
//        .background(Color.Green))
//        }
//        items(100) { i ->
////get 100 items then we get access to every single index
//            Text("Item ${i + 100}")
//            //will add 100 more items
//        }
//        stickyHeader {
//            Text(text = "B",
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .background(Color.Green))
//        }
//        items(100) { i ->
////get 100 items then we get access to every single index
//            Text("Item ${i + 100}")
//            //will add 100 more items
//        }
//        item {
//            Text(
//                text = "Reached the end!",
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .background(Color.Red)
//            )
//        }

    }
}

@Preview(
    showBackground = true
)
@Composable
private fun FlexLayoutDemoPreview() {
    MyApplicationTheme {
        LazyListDemo()
    }
    
}