package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.basic_layout.BoxDemo
import com.example.myapplication.basic_layout.FlowLayoutDemo
import com.example.myapplication.basic_layout.HotelBookingScreen
import com.example.myapplication.basic_layout.HotelBookingScreen2
import com.example.myapplication.basic_layout.ScaffoldDemo
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HotelBookingScreen2(
                        modifier = Modifier
                            .padding(innerPadding),
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier.fillMaxSize()
    )
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFF
)
@Composable
fun GreetingPreview() {
        HotelBookingScreen()

}