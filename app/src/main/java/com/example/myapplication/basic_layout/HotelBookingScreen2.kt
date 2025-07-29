package com.example.myapplication.basic_layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.AssistChip
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
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
                    ),
                    contentScale = ContentScale.Crop

                )

                HotelBanner(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                )
            }
            HorizontalDivider(
                color = Color.Black,
                //thickness = 1.dp,
                modifier = Modifier.padding(top = 16.dp)
                    .padding(horizontal = 16.dp)
            )
        }

        item {
            AssistChip(
                onClick =
                    { /* Handle chip click */ },
                label =
                    { tags },
                leadingIcon =
                    { },
                // other properties like colors, modifier, etc.
            )
            HorizontalDivider(
                color = Color.Black,
                //thickness = 1.dp,
                modifier = Modifier.padding(top = 16.dp)
                    .padding(horizontal = 16.dp)
            )
        }

        item {
            Box(
                modifier = Modifier,
                contentAlignment = Alignment.Center
            )
            {
                Image(
                    painter = painterResource(R.drawable.living_room),
                    contentDescription = null,
                    modifier = Modifier

                )

                Row(
                    modifier = modifier
                        .background(Color.White.copy(alpha = 0.7f))
                        // alpha refers to the transparency of a color, with 0 being fully transparent and 255 being fully opaque.
                        .padding(16.dp),
                    //adds more space to the faded banner
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Box(
                        modifier = Modifier
                            .height(20.dp)
                            .fillMaxWidth(),
                        //.size(300.dp)
                        //.fillMaxWidth(),
                    )

                }
            }
        }
        item {
            Box(
                modifier = Modifier,
                contentAlignment = Alignment.Center
            )
            {
                Image(
                    painter = painterResource(R.drawable.living_room),
                    contentDescription = null,
                    modifier = Modifier

                    //.fillMaxWidth()

                )

                Row(
                    modifier = modifier
                        .background(Color.White.copy(alpha = 0.7f))
                        // alpha refers to the transparency of a color, with 0 being fully transparent and 255 being fully opaque.
                        .padding(16.dp),
                    //adds more space to the faded banner
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Box(
                        modifier = Modifier
                            .height(20.dp)
                            .fillMaxWidth(),
                        //.size(300.dp)
                        //.fillMaxWidth(),
                    )


                }
            }
        }
    }
}

@Composable
fun HotelBanner(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .background(Color.White.copy(alpha = 0.7f))
            // alpha refers to the transparency of a color, with 0 being fully transparent and 255 being fully opaque.
            .padding(60.dp),
        //adds more space to the faded banner
//                    verticalAlignment = Alignment.Bottom,
//                    horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            //.size(300.dp)
            //.fillMaxWidth(),
        )

    }
}