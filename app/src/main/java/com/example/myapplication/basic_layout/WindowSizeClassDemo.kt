package com.example.myapplication.basic_layout

import androidx.collection.mutableObjectIntMapOf
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.currentWindowSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowWidthSizeClass
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun WindowSizeClassDemo (modifier: Modifier = Modifier) {
    val windowClass = currentWindowAdaptiveInfo().windowSizeClass
    Scaffold { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        )
        {
            when (windowClass.windowWidthSizeClass) {
                WindowWidthSizeClass.COMPACT,
                WindowWidthSizeClass.MEDIUM -> {
                    MyLazyList()
                }

                WindowWidthSizeClass.EXPANDED -> {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxHeight()
                                .weight(3f)
                                .background(Color.Red)
                        ) {
                            Text("Menu Option 1")
                            Text("Menu Option 2")
                            Text("Menu Option 3")
                        }
                        MyLazyList(
                            modifier = Modifier
                                .weight(7f)
                                .fillMaxHeight()
                        )
                    }
                }
            }
        }
    }
}
@Composable
fun MyLazyList (modifier: Modifier = Modifier) {
    LazyColumn (
        modifier = modifier
            .fillMaxSize()
    ) {
        items(40) {
            Text(
                text = "Item $it",
                modifier = Modifier
                    .padding(16.dp)
            )

        }
    }
}

@Preview(
    showBackground = true,
    device = Devices.NEXUS_6
    //how to change the size of the preview in code and set the device that is used
)
@Composable
private fun WindowSizeClassDemoPreview() {
    MyApplicationTheme {
        WindowSizeClassDemo()
    }

}