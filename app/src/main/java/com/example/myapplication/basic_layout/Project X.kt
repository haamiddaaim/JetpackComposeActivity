@file:OptIn(
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class
)

package com.example.myapplication.basic_layout


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


val PrimaryRed = Color(0xffe87457)

@Composable
fun ProjectX(modifier: Modifier = Modifier,
             title : String = "Project X",
             description: String = """
                    The advertisement features a vibrant and inviting design, showcasing the Hotel California Strawberry nestled in the heart of Los Angeles. Surrounded by the iconic Hollywood Sign, Griffith Park, and stunning beaches, the hotel is perfectly located for guests to explore L.A.’s best attractions.
                    """.trimIndent(),
                    description2: String = "This is a short description.",
             date: String = "March 5, 10:00" ) {

    Column (
        modifier = modifier
            .background(PrimaryRed)
            .clip(RoundedCornerShape(5.dp))
            .padding(16.dp)
            .wrapContentHeight()
        ,
        horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.spacedBy(16.dp),

    ) {
        Row (
            //verticalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier
                //.weight(2f)
           // .background(Color.Red)
                .fillMaxWidth()
            ,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
            //horizontalAlignment = Alignment.Start
            //weight helps to set a limit to the amount of space each comp can take so it can take all the space it can while leaving enough for others
            //how to make the a layout go to the next line when having long text instead of stretching out on the other layouts
        ) {
            LabeledIcon3(
                text = title,

                icon =
                    {
                        (
                                Icon(
                                    imageVector = Icons.Outlined.CheckCircle,
                                    tint = Color.White,
                                    contentDescription = null
                                )

                                )
                    }
            )
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "Search",
                tint = Color.White,
                modifier = Modifier.rotate(90f)
                   // .background(Color.Magenta),
            )
    }
    Row (
        modifier = Modifier
            .fillMaxWidth()
    ){


            Text(
                                text = description,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 36.dp)

            )
        }
        Text(
            text = date,
            color = Color.White,
            //modifier = Modifier.background(Color.Gray) ,
               // .align(Alignment.End)
        )
    }
      }

@Composable
fun LabeledIcon3(
    text: String,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        icon()
        Text(
            text = text,
            color = Color.White,
            fontSize = 25.sp,
            modifier = Modifier.padding(start = 10.dp)
        )
        //modifier = modifier
    }
}

//@Preview(
//    showBackground = true,
//    // device = Devices.NEXUS_9
//)
//@Composable
//private fun ProjectXPreview() {
//    MyApplicationTheme {
//        ProjectX(
//
//        )
//    }
//}