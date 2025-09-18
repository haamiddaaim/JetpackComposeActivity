@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.myapplication.state_management.homework

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
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
import kotlinx.coroutines.launch

@Composable
fun Hard2(modifier: Modifier = Modifier) {

    var isChecked by remember {
        mutableStateOf(false)
    }
    var title by remember {
        mutableStateOf("")
    }
    var description by remember {
        mutableStateOf("")
    }

    Scaffold(

        bottomBar = {

            Column(
                modifier = Modifier
                    .background(Color.Magenta)
                    // .weight(6f)
                    .padding(vertical = 10.dp),
                verticalArrangement = Arrangement.spacedBy(
                    100.dp, Alignment.Bottom
                ),
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

        //floatingActionButtonPosition = FabPosition.Center
    ) { padding ->
        //makes box fit screen in perfect size under the app bar and above the bottom navigation
        //always use even in activities as they by default use Scaffold and you need to add padding
        LazyColumn {

        }
        Row(
            modifier = modifier
                //.background(Color.Red.copy(alpha = 0.7f))
                // alpha refers to the transparency of a color, with 0 being fully transparent and 255 being fully opaque.
                .padding(padding)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            // horizontalArrangement = Arrangement.Start
        ) {

        }


    }


}