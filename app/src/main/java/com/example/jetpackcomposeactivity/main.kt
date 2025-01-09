package com.example.jetpackcomposeactivity

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeactivity.ui.theme.JetpackComposeActivityTheme

class main {

//composables are views
    //preview is basically what was the layout inspector intially for xml so where we can see what we're actually building
    //modifier is a completely new concept in jetpack compose that is used to modify or review our composable
    //for example where we this text to be positioned or what kind of background color the box around the text has. modifier is relevant for any type of ui component
    //Column is like a LinearLayout
    //Composables by default uses the minimum amount of space which is equivalent to wrap content
    //fillMaxSize will tell our column that it should take all the space it can get
    //fillMaxWidth() will fill the whole width but not the height of our screen
    //row can be used to arrange items horizontally
    //Row with horizontalArrangement = Arrangement.End is basically linearlayout with horizontal orientation
    //box layout is the equivalent to framelayout and you can place views on top of each other

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Box(
            // horizontalAlignment = Alignment.CenterHorizontally,
            // verticalArrangement = Arrangement.Center,
            //horizontalAlignment is used to how the views are arranged or aligned in the column
            //example Alignment.End will push the composable in this column to it's end in horizontal direction
            modifier = Modifier
                .size(400.dp),
            // contentAlignment makes all views move to that specific alignment


            //modifier = Modifier.background(Color.Black)
            //you can use a modifier to customize the whole layout

        ) {
            Text(
                text = "Hello $name!",
                color = Color.Blue,
                fontSize = 30.sp,
                modifier = Modifier.align(Alignment.BottomEnd)
                //we now just describe how our Ui looks in kotlin rather than having these xml files which we then inflate in kotlin
            )
            Text(
                text = "Some other text",
                color = Color.Blue,
                fontSize = 30.sp,
                //we now just describe how our Ui looks in kotlin rather than having these xml files which we then inflate in kotlin
            )
        }

    }

    @Composable
    fun Greting(name: String, modifier: Modifier = Modifier) {

        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier.background(Color.Black)
        )
    }
    //painterResource is the equivalent to having a imageview in xml and calling the set background resources


    @Composable
    fun Greeting(name: String) {
        if (name.length > 5) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null
            )

        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        JetpackComposeActivityTheme {
            Greeting(
                "Haamid"
                //   modifier = Modifier.padding(innerPadding)
            )
        }
    }
//when you write an if statement in compose...it updates in realtime on the preview

    @Composable
    fun Greetng(name: String) {
        Column {
            for (i in 1..10)
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null
                )
//if you want to show alot of icons...instead of writing them all out...you can use a for loop
        }
    }

    //recyclerviews are used to make lazy loading lists...those are lists where only the items the user is currently seeing are actually rendered on the screen and all the items that are not on the screen are hidden so they don't use resources
    //using column in a for loop is one way to make a recylerview but all the icons even off screen are using resources so we have to use Lazy Column
    //usine a lazy row you will be able to scroll horizontally in recyclerview
    //state is just a value that can change overtime
    @Composable
    fun Greetig(name: String) {
        LazyRow(modifier = Modifier.fillMaxSize()) {
            items(10) { i ->
                //we say we have 10 items then get index i
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
//if you want to show alot of icons...instead of writing them all out...you can use a for loop
                //lazyColumn is used for recyclerview vertical lazyrow is used for recyclerview horizontal
            }

        }

    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreiew() {
        JetpackComposeActivityTheme {
        }
    }

    //we need state to increase a number or add any changes to mutable values
    //if the value you assign to a paramenter changes...compose goes through all of the composables and see where it is used. for those composables only it will redraw them on the screen.
    //recomposition is whenever a state changes that a certain composable uses then that composable will recompose. and if another composable that doesn't use that state such as a button would not recompose
    //recompostion only works if you define a state with a mutablestateof
    //since when the value changes the whole funtion will be recalled including the value...the value will be resigned to 0 again so we have to save it wrapping it in remember block
    @Composable
    fun grspreview() {
        JetpackComposeActivityTheme {
            var count by remember {
                mutableStateOf(0)
            }
            //we declare count which we set to a mutable state of the intial value which is 0
            //how to define the state}
            //if you don't want to write count.value all the time...we can just use by and count.toString()
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = count.toString(),
                    //if you assign a vaulue
                    fontSize = 30.sp,
                )
                //how to increase number after button press
                Button(onClick = {
                    count++
                    //++ means you want to increase count
//this block of code will be executed
                }) {
                    Text(text = "Click me!")
                    //this is where you put the content of the button like text, images, etc
                }
            }
        }
    }
}
//onpause is called because it moves into the background and onstop is called because it completely gets invisible to the user
//backstack is just a stack of screens or activities
//task is the collection of multiple screens or activities that belong together and that form a back stack together in one app
//launch modes allow us the set the behaviour when a new activity gets pushed on the back stack
//by default the launch mode is standard and whenever it happens a new instance of that activity will be pushed on the backstack
//single top means if there is already an existing task on the app when you click the link from another app it will go to the existing one instead
//single task will make sure that new instances will be launched inside of a completely different task than the existing one
//you would use single task for example if you click on a link in instagram which you want to open in your browser app and when you want to go back you want to go back to instagram instead of the existing activities from before
//single instance will also launch a different task which is independent of the previous task but the difference from single task is that you're not allowed to open any other activities in your new separate task
//you would use single instance for example for payment apps

//MVVM stands for model view view model
//view is what is visible on the screen for a user
//model is where your apps data is so like database or remote api
//viewmodel is the bridge between the view and the model so it takes the raw data from the model for example like a list of contacts and brings it into a new format which is easy to display on the UI
//after that the viewmodel will notify the UI that there is a change...a new contact in the contact list
//when you rotate the device...it triggers a configuration change
//viewmodel factory is a class that defines how our viewmodel instance is to be created

//context is an instance of a class and is used to be a bridge between your app and the rest of the android operating system
//the difference between the two subclasses of Context activity and application is that the activity context is active as long as the activity is active...application is active as long as the app is not destroyed
//for example if the screen is rotated the activity would be destoryed so the context will
//context has a specific lifetime
//you need to use activity context because you need info fromt the activity itself for example you need access to certain permissions so you use ActivityCompat.requestPermissions

//qualifiers are specific resources that are only used for specific device configuration such as api level 24
//types of qualifiers
//mipmap is used for the icon of our app

//explicit intents are targeted towards one specific app that has been specified in that intent
//implicit intent are just specify an action then android will check which apps can satisfy that intent and show the user a chooser so they choose which app they want
//in order to launch one specific app that is installed we need it's package name
//the action is just a string so that the receiver of this intent knows how to handle it and what to do with this intent
//it refers to in this specific cast I want to launch the main activity of that app so the initial activity that shows up when you launch this app
//you can find the package name of an app by going to url of the google play link

//with an intent filter we can specify what our app can receive specific tabs of intents
//you use android.intent.action.MAIN because when the user initially launches your app the android system will send an intent with this main action to your app so the it will launch the main activity
//launchMode singleTop means if the app is already open we will just take the that active instance and send the data to that active instance instead of a new one
//this launchmode triggers onnewIntent fun because theres not a new activity that is created so oncreate will not be called
//uri is the address of that image on our device which you can read as a byte
//parcelables are just a way to package or serialize some data that is not a primitive data type


//broadcast in android is an intent that you don't just send to one app but to many apps and the apps that receive them will silently handle it without opening an activity


