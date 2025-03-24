package com.example.myapplication.basic_layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import kotlin.random.Random
import kotlin.random.nextInt

@Composable
fun LazyGridDemo (modifier: Modifier = Modifier) {
LazyVerticalStaggeredGrid (
    //difference between LazyVerticalGrid and LazyVerticalStaggeredGrid is that the latter has varying heights for each box
    columns = StaggeredGridCells.Fixed (5),
    //controls every single box width but if some have a larger width then you can use that as well
    //fixedsize controls how wide the boxes are and the left over boxes that can't fit on the row moves to the next one
        // GridCells.Fixed(5) controls how many items are in each row
//verticalArrangement = Arrangement.spacedBy(16.dp),
    horizontalArrangement = Arrangement.spacedBy(16.dp),
    verticalItemSpacing = 16.dp
) {
    items(100){
        Box (
            modifier = Modifier
                .height(
                    height = Random.nextInt(
                        1..200
                    ).dp
                )
                .height(100.dp)
                //lazyverticalgrid overrides width so we can only have height
                //.size(100.dp) controls height and width if it's supported
                .clip(RoundedCornerShape(10.dp))
                //clips the corners of the box
                .background(Color(Random.nextInt()))
        )
    }
}
}

@Preview(
    showBackground = true
)
@Composable
private fun FlexLayoutDemoPreview() {
    MyApplicationTheme {
        LazyGridDemo()
    }

}