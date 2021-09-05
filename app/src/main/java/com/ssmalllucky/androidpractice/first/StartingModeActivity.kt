package com.ssmalllucky.androidpractice.first

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ssmalllucky.androidpractice.R
import com.ssmalllucky.androidpractice.helper.first.*
import kotlinx.android.synthetic.main.aty_starting_mode.*

class StartingModeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aty_starting_mode)
        Log.i("msg", "ThirdActivity getTaskId: " + taskId)

        standardBtn.setOnClickListener {
            startActivity(Intent(this, StandardAty::class.java))
        }

        singleTopBtn.setOnClickListener {
            startActivity(Intent(this, SingleTopAty::class.java))
        }

        singleTaskBtn.setOnClickListener {
            startActivity(Intent(this, SingleTaskAty::class.java))
        }

        singleInstanceBtn.setOnClickListener {
            startActivity(Intent(this, SingleInstanceAty::class.java))
        }

        singleInstancePerTaskBtn.setOnClickListener {
            startActivity(Intent(this, SingleInstancePerTaskAty::class.java))
        }
    }
}