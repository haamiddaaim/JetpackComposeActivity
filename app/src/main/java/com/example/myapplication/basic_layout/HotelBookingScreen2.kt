package com.example.myapplication.basic_layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.window.core.layout.WindowWidthSizeClass
import com.example.myapplication.R

private val tags = listOf(
    "City Center",
    "Luxury",
    "Instant Booking",
    "Exclusive Deal",
    "Early Bird Discount",
    "Romantic Gateway",
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
fun HotelBookingScreen2(modifier: Modifier = Modifier) {
    val windowClass = currentWindowAdaptiveInfo().windowSizeClass
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
            )
            {
                Image(
                    painter = painterResource(R.drawable.living_room),
                    contentDescription = null,
                    modifier = Modifier.heightIn(
                        max = 250.dp
                        //makes more space for the image as you increase it
                    )
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop

                )

                HotelBanner(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                )
            }

        }
        item {
            HorizontalDivider(
                color = Color.Black,
                //thickness = 1.dp,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
        }
        item {
            FlowRow(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(
                    8.dp,
                    alignment = Alignment.CenterHorizontally,

                )
            ) {
                tags.forEach { tag ->
                    AssistChip(
                        onClick =
                            { /* Handle chip click */ },
                        label =
                            {
                                Text(text = tag)
                            },

                        leadingIcon =
                            { },
                    )

                }
            }

        }
        item {
            HorizontalDivider(
                color = Color.Black,
                //thickness = 1.dp,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                //padding horizontal stops chips from being right at the edge of the screen on bigger screens
            ) {
                Text(
                    text = """
                    The advertisement features a vibrant and inviting design, showcasing the Hotel California Strawberry nestled in the heart of Los Angeles. Surrounded by the iconic Hollywood Sign, Griffith Park, and stunning beaches, the hotel is perfectly located for guests to explore L.A.’s best attractions.
                """.trimIndent(),
                    fontSize = when (windowClass.windowWidthSizeClass) {
                        WindowWidthSizeClass.COMPACT -> 14.sp
                        WindowWidthSizeClass.MEDIUM -> 18.sp
                        WindowWidthSizeClass.EXPANDED -> 28.sp
                        else -> 18.sp
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    //textAlign = TextAlign.Justify,
                    textAlign = TextAlign.Center
                    //TextAlign.Justify will arrange the text to the edges of the screen

                )
            }
        }
        item {
            Text(
                "What we offer",
                fontSize = when (windowClass.windowWidthSizeClass) {
                    WindowWidthSizeClass.COMPACT -> 18.sp
                    WindowWidthSizeClass.MEDIUM -> 24.sp
                    WindowWidthSizeClass.EXPANDED -> 28.sp
                    else -> 18.sp},
                fontWeight = FontWeight.Bold
            )
        }
        item {
            LazyRow (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
            ) {
                items(offers.entries.toList()) { (drawableResId, label) ->
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .background(Color.Gray.copy(alpha = 0.3f))
                            .padding(8.dp)
                    ){
                        Icon(imageVector = ImageVector.vectorResource(drawableResId),
                            contentDescription = label,
                            modifier = Modifier.size(36.dp))
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
                    ).fillMaxWidth()
                //colors = (ButtonDefaults.buttonColors(Color.DarkGray)

            ) {
                Text(text = "Book Now")
            }
        }
    }
}

@Composable
fun HotelBanner(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .background(Color.White.copy(alpha = 0.7f))
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom,
        // alpha refers to the transparency of a color, with 0 being fully transparent and 255 being fully opaque.
        // .padding(40.dp)
        //adds more space to the faded banner
//                    verticalAlignment = Alignment.Bottom,
//                    horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier
                .weight(1f)
                //.background(Color.Red)
            ,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Hotel California Strawberry",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 6.dp)
            )
            LabeledIcon2(
                text = "Los Angeles, California",
                icon = {
                    (
                            Icon(
                                imageVector = Icons.Filled.LocationOn,
                                tint = Color.Gray,
                                contentDescription = null
                            )
                            )
                }
            )
            LabeledIcon2(
                text = "4.9 (14k reviews)",
                icon = {
                    (
                            Icon(
                                imageVector = Icons.Filled.Star,
                                tint = Color.Yellow,
                                contentDescription = null
                            )
                            )

                }
            )
        }
        Text(
//            modifier = Modifier
//                .background(Color.Red),
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                ) {
                    append("420$/")
                }
                withStyle(
                    style = SpanStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 15.sp
                    )
                ) {
                    append("night")
                }
            }
        )
    }
}

@Composable
fun LabeledIcon2(
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
            fontSize = 13.sp,
        )
        //modifier = modifier
    }
}