package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.basic_layout.BoxDemo
import com.example.myapplication.basic_layout.FlowLayoutDemo
import com.example.myapplication.basic_layout.HotelBookingScreen
import com.example.myapplication.basic_layout.HotelBookingScreen2
import com.example.myapplication.basic_layout.LazyGridDemo
import com.example.myapplication.basic_layout.LazyListDemo
import com.example.myapplication.basic_layout.ProjectX
import com.example.myapplication.basic_layout.RowColumnDemo
import com.example.myapplication.basic_layout.ScaffoldDemo
import com.example.myapplication.state_management.StateHoistingDemo
import com.example.myapplication.state_management.hardhomework.HardHomeworkScreen
import com.example.myapplication.state_management.hardhomework.HardHomeworkViewModel
import com.example.myapplication.state_management.homework.Easy2
import com.example.myapplication.state_management.homework.Hard2
import com.example.myapplication.state_management.homework.TodoItemListScreen
import com.example.myapplication.state_management.homework.TodoItemListScreenRoot
import com.example.myapplication.state_management.number_guess.NumberGuessScreenRoot
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HardHomeworkScreen(
                        modifier = Modifier.statusBarsPadding()
                            .navigationBarsPadding(),
                       // viewModel = HardHomeworkViewModel()

                    )
                }
            }
        }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        //Greeting("Android")
    }
}