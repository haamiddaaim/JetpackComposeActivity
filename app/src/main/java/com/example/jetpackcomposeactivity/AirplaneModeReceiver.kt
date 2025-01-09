package com.example.jetpackcomposeactivity

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings

class AirplaneModeReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED){
            val isTurnedOn = Settings.Global.getInt(
                context?.contentResolver,
                Settings.Global.AIRPLANE_MODE_ON
            ) != 0
            //if it's not equal to 0 that means it's on...if it's 0 it's off
            //how to find out if the user has airplane mode on or off
        }
            //how to check if we are dealing with the intent we think we are dealing with
        //this is triggered when the broadcast receiver is fired
    }

}