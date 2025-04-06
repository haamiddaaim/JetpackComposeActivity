@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.myapplication.basic_layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import kotlinx.coroutines.launch

@Composable
fun ScaffoldDemo(modifier: Modifier = Modifier) {
    val snackBarState = remember { 
        SnackbarHostState()
     }
    val scope = rememberCoroutineScope()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Hello World")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.ArrowBack,
                            contentDescription = "Go back"
                        )
                        //how to implement the back button the app bar

                    }
                }

            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    scope.launch {
                        snackBarState.showSnackbar(
                            message = "Clicked FAB",
                        )
                    }
                },
            ) {

Icon(
    imageVector = Icons.Default.Add,
    contentDescription = null
)            }
        },
        snackbarHost ={
            SnackbarHost(
                //links our scaffold with snackbar state
            hostState = snackBarState
            //
            //snackbarHost easily allows us to show a snackbar
        )
},
        bottomBar = {
            BottomAppBar {

                Column(
                    modifier = modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Bottom)
                ) {
                    TextField(
                        value = "checked.value.title",

                        onValueChange = { newText ->
                            // onAction(NumberGuessAction.OnNumberTextChange(newText))
                            //how to update the text to the new text
                        },
                        modifier = Modifier
                            .fillMaxWidth(),

                        )
                }
            }
        }
        //floatingActionButtonPosition = FabPosition.Center
    ) { padding ->
        //makes box fit screen in perfect size under the app bar and above the bottom navigation
        //always use even in activities as they by default use Scaffold and you need to add padding
Box (
    modifier = Modifier
        .fillMaxSize()
        .padding(padding)
        .background(Color.Red)
){
    Text(
        text = "Hello world"
    )

        //this is where the content of the scaffold would be placed
    }
}
}

@Preview(
    showBackground = true
)
@Composable
private fun ScaffoldDemoPreview() {
    MyApplicationTheme {
        ScaffoldDemo()
    }
    //scaffold is used for 3d things like navigation drawer bottom navigation top app bar etc
}