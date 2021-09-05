package com.ssmalllucky.androidpractice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ssmalllucky.androidpractice.first.FirstActivity
import com.ssmalllucky.androidpractice.second.SecondActivity
import com.ssmalllucky.androidpractice.third.ThirdActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstBtn.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }

        secondBtn.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        thirdBtn.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }
}