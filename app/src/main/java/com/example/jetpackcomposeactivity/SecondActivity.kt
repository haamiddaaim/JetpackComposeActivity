package com.example.jetpackcomposeactivity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeactivity.ui.theme.JetpackComposeActivityTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        intent.getStringExtra()
        //how to recieve intents
        setContent {
            JetpackComposeActivityTheme  {
                Text(text = "SecondActivity",
                    fontSize = 40.sp)
            }
        }
    }
}