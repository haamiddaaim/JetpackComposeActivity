package com.example.myapplication

import android.os.Bundle
import android.print.PrintJob
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.basic_layout.BoxDemo
import com.example.myapplication.basic_layout.FlowLayoutDemo
import com.example.myapplication.basic_layout.HotelBookingScreen
import com.example.myapplication.basic_layout.LazyGridDemo
import com.example.myapplication.basic_layout.LazyListDemo
import com.example.myapplication.basic_layout.ProjectX
import com.example.myapplication.basic_layout.RowColumnDemo
import com.example.myapplication.basic_layout.ScaffoldDemo
import com.example.myapplication.basic_layout.WindowSizeClassDemo
import com.example.myapplication.state_management.Counter
import com.example.myapplication.state_management.homework.TodoItemList
import com.example.myapplication.state_management.homework.TodoList
import com.example.myapplication.state_management.number_guess.NumberGuessScreenRoot
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Scaffold (modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TodoItemList(
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
    MyApplicationTheme {
        Greeting("Android")
    }
}