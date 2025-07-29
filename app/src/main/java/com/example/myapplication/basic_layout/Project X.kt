@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun ProjectX(modifier: Modifier = Modifier) {

    val PrimaryRed = Color(0xffe87457)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Hello World",
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    PrimaryRed
                ),
                actions = {
                    IconButton(onClick = { })
                    {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = "Search",
                            tint = Color.White,
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Outlined.CheckCircle,
                            contentDescription = "Go back",
                            tint = Color.White
                        )
                        //how to implement the back button the app bar
                    }

                }


            )
        },

        //floatingActionButtonPosition = FabPosition.Center
    ) { padding ->

            Row(
                //adds more space to the faded banner
                verticalAlignment = Alignment.Bottom,
               // horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    //.background(Color.Yellow)
                   // .align(Alignment.BottomEnd)
                    //.fillMaxSize()
                    .background(Color.Yellow)
                    //.height(315.dp)
                    .padding(padding)











            ) {


                Column(
                    modifier = Modifier
                      //  .weight(1f)
                    // .weight(1.6f)
                )
                {
//                            Text(
//                                text = """
//                    The advertisement features a vibrant and inviting design, showcasing the Hotel California Strawberry nestled in the heart of Los Angeles. Surrounded by the iconic Hollywood Sign, Griffith Park, and stunning beaches, the hotel is perfectly located for guests to explore L.A.’s best attractions.
//                """.trimIndent(),
//                                color = Color.White,
//                                modifier = Modifier
//                                    .fillMaxWidth()
//                                     .padding(start = 54.dp, end = 20.dp),
//
//
//
//                                )

                    Box(
                        // verticalArrangement = Arrangement.spacedBy(4.dp),
                        //if you want to add space between your things inside of column...you can give it a spacing arrangement
                        modifier = Modifier
                            .background(PrimaryRed)
                            //.weight(2f)
                           // .wrapContentHeight()
                            .fillMaxWidth()
                            //.fillMaxHeight()
                            //.align(Alignment.Top)
                            //.height(200.dp)


                        //weight helps to set a limit to the amount of space each comp can take so it can take all the space it can while leaving enough for others
                        //how to make the a layout go to the next line when having long text instead of stretching out on the other layouts
                    )
                    {
                        Text(
//                            text = "This is a short description.",
                                text = """
                    The advertisement features a vibrant and inviting design, showcasing the Hotel California Strawberry nestled in the heart of Los Angeles. Surrounded by the iconic Hollywood Sign, Griffith Park, and stunning beaches, the hotel is perfectly located for guests to explore L.A.’s best attractions.
                """.trimIndent(),
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding( start = 57.dp, end = 23.dp, bottom = 15.dp)

                            //  textAlign = TextAlign.Justify
                        )

                    }
                    Box(
                        modifier = Modifier
                            .background(PrimaryRed)
                           // .height(115.dp)
                            .fillMaxWidth()
                           // .background(Color.Blue)
                       // .weight(1f)


                    ) {
                        Text(
                            text = "March 5, 10:00",
                            color = Color.White,
                            modifier = Modifier.padding( end = 20.dp, bottom = 15.dp)
                                .align(Alignment.CenterEnd),
                            //   .padding(horizontal = 30.dp, vertical = 15.dp)
                            // .weight(1f)
                            //  .padding(start = 54.dp),
                            //.padding(horizontal = 6.dp, vertical = 16.dp),


                        )
                    }

                    //this is where the content of the scaffold would be placed
                }
            }
        }
//    LazyColumn(
//        //inside a lazycolumn every single item is a different composable which allows us to only draw what's visible
//        modifier = modifier
//            .fillMaxSize(),
//        verticalArrangement = Arrangement.spacedBy(16.dp),
//      //  horizontalAlignment = Alignment.CenterHorizontally
//    )
//    {
//        item {
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .background(PrimaryRed)
//                    .heightIn(
//                        max = 250.dp
//                        //makes more space for the image as you increase it
//                    )
//
//            ){


//                    Text(
//                        text = """
//                    The advertisement features a vibrant and inviting design, showcasing the Hotel California Strawberry nestled in the heart of Los Angeles. Surrounded by the iconic Hollywood Sign, Griffith Park, and stunning beaches, the hotel is perfectly located for guests to explore L.A.’s best attractions.
//                """.trimIndent(),
//                        fontSize = 13.sp,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(horizontal = 16.dp),
//                        textAlign = TextAlign.Justify
//                        //TextAlign.Justify will arrange the text to the edges of the screen
//
//                    )
//
//
//
//
//            }
//
//        }
//    }
    }

@Preview(
    showBackground = true,
    // device = Devices.NEXUS_9
)
@Composable
private fun ProjectXPreview() {
    MyApplicationTheme {
        ProjectX()
    }
}