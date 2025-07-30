@file:OptIn(ExperimentalLayoutApi::class, ExperimentalLayoutApi::class)

package com.example.myapplication.basic_layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.window.core.layout.WindowWidthSizeClass
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme


private val tags = listOf(
    "City Center",
    "Luxury",
    "Instant Booking",
    "Exclusive Deal",
    "Early Bird Discount",
    "Romeway",
    "24/7 Support",
)
private val offers = mapOf(
    R.drawable.bed to "2 Bed",
    R.drawable.breakfast to "Breakfast",
    R.drawable.cutlery to "Cutlery",
    R.drawable.pawprint to "Pet Friendly",
    R.drawable.serving_dish to "Dinner",
    R.drawable.snowflake to "Air Conditioning",
    R.drawable.television to "TV",
    R.drawable.wi_fi_icon to "Wifi",
    //how to map the drawable to specific offer text
)
@Composable
fun HotelBookingScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        //inside a lazycolumn every single item is a different composable which allows us to only draw what's visible
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        item {
            Box {
                Image(
                    painter = painterResource(R.drawable.living_room),
                    contentDescription = null,
                    //contentDescription doesn't matter for a static image
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(
                            max = 250.dp
                            //makes more space for the image as you increase it
                        ),
                    //height assigns a fixed height and heightIn assigns a max height
                    //this will allow the bounds of the image to fill the width but the image dimension will be the same
                    contentScale = ContentScale.Crop

                    //says this height is available but if more height is needed then parts of the image should be cropped
                )
                HotelFadedBanner(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter) //aligns the banner at the bottom of the box


                )
            }

        }
        item {
            HorizontalDivider(
                modifier.padding(horizontal = 16.dp)
            )
        }
        item {
            FlowRow(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                //padding horizontal stops chips from being right at the edge of the screen on bigger screens
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),


//flowlayouts allow text to jump to next line when there's too many to fit in the first line
            ){
                tags.forEach{ tag ->
                    AssistChip(
                        onClick = {},
                        label = {
                            Text(
                                text = tag
                                //how to show one chip for each text in our tags list
                            )
                        }
                    )
                }
            }
        }
        item {
            Row (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                //padding horizontal stops chips from being right at the edge of the screen on bigger screens
            ){
                Text(
                    text = """
                    The advertisement features a vibrant and inviting design, showcasing the Hotel California Strawberry nestled in the heart of Los Angeles. Surrounded by the iconic Hollywood Sign, Griffith Park, and stunning beaches, the hotel is perfectly located for guests to explore L.A.’s best attractions.
                """.trimIndent(),
                    fontSize = 13.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    textAlign = TextAlign.Justify
                    //TextAlign.Justify will arrange the text to the edges of the screen

                )


            }
        }
        item {
            Row (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                //padding horizontal stops chips from being right at the edge of the screen on bigger screens
            ){

                Text(
                    text = "What we offer",
                    fontSize = 18.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )


            }
        }
        item {
            LazyRow  (
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.spacedBy(16.dp,Alignment.CenterHorizontally)
            ){
                items(offers.entries.toList())
                //how to convert a map of text strings to a list
                { (drawableResId, label) ->
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .background(Color.Gray.copy(alpha = 0.3f))
                            .padding(8.dp)
                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(drawableResId),
                            contentDescription = label,
                            modifier = Modifier.size(36.dp)
                        )
Text(
    text = label,
    fontSize = 13.sp

)

                    }
                }
        }
    }
        item {
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .widthIn(
                        max = 400.dp
                    )
                    .fillMaxWidth()
                //use widthin to make the button scale up on bigger screens
                //fillmaxwidth() fills to the max dp
            ) {
                Text(text = "Book now!")
            }
        }
    }
}

@Composable
//composable made because there will be alot of information nested above if I don't put in a separate comp
fun HotelFadedBanner(modifier: Modifier = Modifier) {
    val windowClass = currentWindowAdaptiveInfo().windowSizeClass
    //how to dynamically increase the font based on the window size class

    Row(
        modifier = modifier
            .background(Color.White.copy(alpha = 0.7f))
            // alpha refers to the transparency of a color, with 0 being fully transparent and 255 being fully opaque.
            .padding(16.dp),
        //adds more space to the faded banner
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            //if you want to add space between your things inside of column...you can give it a spacing arrangement
            modifier = Modifier
               // .background(Color.Red)
                .weight(1f)
            //weight helps to set a limit to the amount of space each comp can take so it can take all the space it can while leaving enough for others
            //how to make the a layout go to the next line when having long text instead of stretching out on the other layouts
        )

        {
            //put the text in the column so the text can have it's own layout
            Text(
                text = "Hotel Califoria Strawberry",
                fontWeight = FontWeight.Bold,
                fontSize = when(
                    windowClass.windowWidthSizeClass){
                    WindowWidthSizeClass.COMPACT -> 18.sp
                    WindowWidthSizeClass.MEDIUM -> 24.sp
                    WindowWidthSizeClass.EXPANDED -> 28.sp
                    else -> 18.sp
                        //sets the size of fonts for each size class

                },

                //has to have something like a text inside of it to show up on the preview

                maxLines = 2,
                //put a limit on the amount of lines text can have
                overflow = TextOverflow.Ellipsis
                //if there's no more space for long text it gets clipped...in order to stop that we have to use overflow so it can be abbreviated
            )
            LabeledIcon(

                text = "Los Angeles, California",
                icon = {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = null,
                        tint = Color.DarkGray

                    )
                    //takes the called icon and text in we passed in Row in labeledIcon and defines what they are
                }
            )
            LabeledIcon(

                text = "4.9 (14k reviews)",
                icon = {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = null,
                        tint = Color.Yellow

                    )
                    //takes the called icon and text in we passed in Row in labeledIcon and defines what they are
                }
            )



        }
        Text(
            text = buildAnnotatedString {
                //buildAnnotatedString visual hightlight difference sections of the text
                //how to have text with two different font sizes in one
                val fontSizemulitiplier = when(
                    windowClass.windowWidthSizeClass){
                    WindowWidthSizeClass.COMPACT -> 1f
                    WindowWidthSizeClass.MEDIUM -> 1.2f
                    WindowWidthSizeClass.EXPANDED -> 1.5f
                    else -> 1f
                    //sets the size of fonts for each size class

                }
                withStyle(

                    style = SpanStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp * fontSizemulitiplier
                    )) {
                    append("420$/"
                    )

                }
                withStyle(
                    style = SpanStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp * fontSizemulitiplier
                    )
                )
                {
                    append("night")
                }

            }
        )

    }
}

@Composable
fun LabeledIcon(
    text: String,
    icon: @Composable () -> Unit,
    //@Composable () -> Unit is a composable lamda fun that we can dynamically decide which icon we want to switch to instead of having to decide everytime
    modifier: Modifier = Modifier
//when you have an icon and text together...it can be reused by extracting it into a separate comp so you won't have to keep redefining the placeholders over again

) {
    Row (
        //so we can align our icon and text vertically centered
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
icon()
        //calls the flexible icon we passed in LabeledIcon
        Text(
            text = text,
            fontSize = 13.sp
//can size the text from here for LabeledIcon above
        )
        //assigns texxt that we passed in LabeledIcon
    }

}


@Preview(
    showBackground = true,
    // device = Devices.NEXUS_9
)
@Composable
private fun HotelBookingScreenPreview() {
    MyApplicationTheme {
        HotelBookingScreen()
    }
}


@Preview(

     device = Devices.NEXUS_10
)
@Composable
private fun HotelBookingScreenTabletPreview() {
    MyApplicationTheme {
        HotelBookingScreen()
    }
}