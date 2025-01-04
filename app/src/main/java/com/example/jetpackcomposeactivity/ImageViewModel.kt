package com.example.jetpackcomposeactivity

import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ImageViewModel : ViewModel() {
    var uri :Uri? by mutableStateOf(null)
        private set
    //Uri? is a nullable uri
    //private set means it can only mutate within this model
    fun updateUri(uri: Uri?){
        this.uri = uri
    }
}