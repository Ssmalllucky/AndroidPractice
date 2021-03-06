package com.ssmalllucky.androidpractice.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class CustomizeBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.i("msg", "CustomizeBroadcastReceiver has received.")
        abortBroadcast()
    }
}