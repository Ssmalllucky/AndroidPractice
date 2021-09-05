package com.ssmalllucky.androidpractice.helper.first

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SingleInstancePerTaskAty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("msg","SingleInstancePerTaskAty getTaskId: " + taskId)
    }
}