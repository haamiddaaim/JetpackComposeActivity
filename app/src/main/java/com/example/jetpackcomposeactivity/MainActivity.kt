package com.example.jetpackcomposeactivity

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.AsyncImage
import com.example.jetpackcomposeactivity.ui.theme.JetpackComposeActivityTheme

//@Composable
//fun SimpleComposable() {
class MainActivity : ComponentActivity() {
    //private val viewModel by viewModels<ContactsViewModel>()
    //the two android ways of initializing a viewmodel
private val viewModel by viewModels<ImageViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
        enableEdgeToEdge()
        setContent {
            JetpackComposeActivityTheme {

//                Image(
//                    painter = painterResource(id = R.drawable.iknowwhatyouare),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                )

//                val viewModel = viewModel<ContactsViewModel>(
//                    factory = object : ViewModelProvider.Factory {
//                        override fun <T : ViewModel> create(modelClass: Class<T>): T {
//                            return ContactsViewModel(
//                               helloWorld =  "hello World"
//                            ) as T
//                            //cast as generic type T so that android studio doesn't complain here
//                        }
//                        //how to return an new instance of the viewmodel provider factory
//                    }
//                )
                //you can use this way with the compose version when you don't have direct access to the activity to intialize your viewmodel
                var name by remember {
                    mutableStateOf("")
                }
                var names by remember {
                    mutableStateOf(listOf<String>())
                }

                Column(

                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
//                        .padding(
//                            top = 32.dp,
//                            start = 16.dp,
//                            end = 16.dp

                        //)
                      //  .background(color = viewModel.backgroundColor)

                )
                {

//                    Row(
//                        modifier = Modifier.fillMaxWidth()
//
//                    ) {
//
//                        OutlinedTextField(
//                            value = name,
//                            //value is the text that is currently entered in the text field
//                            onValueChange = { text ->
//                                name = text
//                                //onValueChange is a lamda that will be called with a new text after it's changed. onValueChange is the fun that happenes when the user taps something
//                                //how to make text field text as a state since it's a value that can change over time
//                            },
//                            modifier = Modifier.weight(1f)
//                            //weight is a modifier that is only applicable in rows and columns
//                            //if we add a weight of 1 to our button...then the outlinedtextfield and button will share the exact same amount of space in our row
//                        )
//                        Spacer(modifier = Modifier.width(16.dp))
//                        //using spacer will add a little bit of spacing between our text field and button
//
//                        Button(onClick = {
//                            if (name.isNotBlank()) {
//                                names = names + name
//                                //we take our names list and we add our new name to it and we only do it if our name we entered in text field isn't blank
//                                name = ""
//                                //how to reset the name to empty string
//
//                                }
//
//
//                        }) {
//                            Text("Add")
//                            //text for button
//                        }
//
//                        Button(onClick = {
//
//                            //viewModel.changeBackgroundColor()
////                            Intent(applicationContext,SecondActivity::class.java).also {
////                                startActivity(it)
////                            }
//                            // Intent(Intent.ACTION_MAIN).also {
//                            //    it.`package` = "com.google.android.youtube"
//                            //use terminal in order to use adb so you can use your emulator to print all package names of all apps that are on it
//                            //how to assign the package name of the app we want to send this intent to
//
//
////                               try {
////                                startActivity(it)}
////                               catch (e: ActivityNotFoundException)
////                               {
////                                   e.printStackTrace()
////                               }
//                            //   }
//                            //checking to see if the app is installed
//
//                            //intent that would launch the youtube app
//                            //ACTION_MAIN is an action that specifies what we want to do with this intent
//
//                            val intent = Intent(Intent.ACTION_SEND).apply {
//                                type = "text/plain"
//                                //set the type like images/ etc
//                                putExtra(Intent.EXTRA_EMAIL, arrayOf("test@test.com"))
//                                putExtra(Intent.EXTRA_SUBJECT, "this is my subject")
//                                putExtra(Intent.EXTRA_TEXT,"This is the content of my email")
//                                //how to attach data to intents
//                                }
//                            if (intent.resolveActivity(packageManager)  != null)
//                            {
//                                startActivity(intent)
//                                //if we have apps that can satisfy this intent
//
//                                //checks if there are activities or other apps that can't satisfy these requirements because if there are no email apps..then no apps will open
//                            }
//                        }){
//
//                            Text("change background color")
//                        }
//
//                    }
//
//                    LazyColumn {
//                        items(names) { currentName ->
//                            //currentName is a reference to show a certain item like a text
//                            Text(text = currentName,
//                                modifier = Modifier
//                                    .fillMaxWidth()
//                                    .padding(16.dp)
//                            )
//                            HorizontalDivider()
//                        }
                    viewModel.uri?.let {
                        //checks if the uri exists
                        AsyncImage(
                            model = viewModel.uri,
                            contentDescription = null,
                            alignment = Alignment.Center
//                                    git remote add origin https://github.com/haamiddaaim/tiktok-app.git
//                                    git branch -M main
//                                    git push -u origin main
                            )
                    }
                }

                    }
                }

            }

        }

//    override fun onNewIntent(intent: Intent) {
//        super.onNewIntent(intent)
//        val uri = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
//            intent?.getParcelableExtra(Intent.EXTRA_STREAM, Uri::class.java)
//        } else {
//            intent?.getParcelableExtra(Intent.EXTRA_STREAM)
//            //don't use Uri::class.java on the latest versions since it's deprecated
//        }
//        viewModel.updateUri(uri)
//        /*@Preview(showBackground = true)
//@Composable
//fun SimpleComposablePreview() {
//    SimpleComposable()*/
//    }

//    override fun onStart() {
//        super.onStart()
//        println("onStart")
//    }
//    override fun onResume() {
//        super.onResume()
//        println("onResume")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        println("onPause")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        println("onStop")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        println("onRestart")
//    }
//    override fun onDestroy() {
//        super.onDestroy()
//        println("onDestroy")
//    }
//}


