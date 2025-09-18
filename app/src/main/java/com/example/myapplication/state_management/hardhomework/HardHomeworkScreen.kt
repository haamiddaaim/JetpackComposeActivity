package com.example.myapplication.state_management.hardhomework

import android.nfc.tech.MifareUltralight
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HardHomeworkScreen(modifier: Modifier = Modifier) {
    val viewModel = viewModel<HardHomeworkViewModel>()
    val state by viewModel.state.collectAsStateWithLifecycle()

    var isChecked by remember {
        mutableStateOf(false)
    }
    var title by remember {
        mutableStateOf("")
    }
    var description by remember {
        mutableStateOf("")
    }
    Scaffold (
        bottomBar = {
            Column(
                modifier = Modifier
                    .background(Color.Magenta)
                    // .weight(6f)
                    .padding(vertical = 10.dp),
//                verticalArrangement = Arrangement.spacedBy(
//                    10.dp, Alignment.Bottom
//                )

                horizontalAlignment = Alignment.Start
            )
            {
                TextField(

                    value = title,
                    // modifier = Modifier.padding(start = 10.dp),
                    // colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.Yellow),

                    // .fillMaxSize(),
                    onValueChange = { newText ->
                        title = newText
                        //how to update the text to the new text
                    }, placeholder = {
                        Text(
                            "" +
                                    "Title" +
                                    ""
                        )
                    }
                )

                TextField(
                    // modifier = Modifier.padding(start = 10.dp),
                    value = description,

                    // colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.Yellow),

                    // .fillMaxSize(),
                    onValueChange = { newText ->
                        description = newText
                        // onAction(NumberGuessAction.OnNumberTextChange(newText))
                        //how to update the text to the new text
                    }, placeholder = {
                        Text("Description")
                    }
                )
            }
        }
    ) { padding ->
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
               .padding(padding)
                .background(Color.Blue),
            //horizontalAlignment = Alignment.CenterHorizontally,
           // verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
        ) {
            items (15) {
                Row(
                    modifier = modifier
                        // .background(Color.Red.copy(alpha = 0.7f))
                        // alpha refers to the transparency of a color, with 0 being fully transparent and 255 being fully opaque.
                        .padding(16.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(4.dp),
                        //if you want to add space between your things inside of column...you can give it a spacing arrangement
                        modifier = Modifier
                            .background(Color.Yellow)
                        //.weight(1f)
                    ) {
                        Text(
                            text = "easymodel.titletitletitle",
                            fontWeight = FontWeight.Bold,
                            textDecoration = if (isChecked) TextDecoration.LineThrough else TextDecoration.None
                        )
                        Text(
                            text = "easymodel.description",
                            textDecoration = if (isChecked) TextDecoration.LineThrough else TextDecoration.None
                        )
                    }
                }


                Checkbox(
                    modifier = Modifier
                    .background(Color.Black)
                    //  .weight(1f)
                    ,
                    checked = isChecked,
                    onCheckedChange = { newState ->
                        isChecked = newState
                    })
                IconButton(
                    onClick = {

                    },
                    modifier = Modifier
                    .background(Color.Magenta),
                ) {
                    Icon(

                        imageVector = Icons.Default.Delete,
                        contentDescription = null,

                        )

                }
            }
        }



    }
}