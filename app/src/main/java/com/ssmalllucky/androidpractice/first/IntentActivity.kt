package com.ssmalllucky.androidpractice.first

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ssmalllucky.androidpractice.R
import kotlinx.android.synthetic.main.aty_intent.*

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aty_intent)

        xianshiIntent.setOnClickListener {
            var intent = Intent("com.ssmalllucky.targetmain.ACTION_START")
            intent.addCategory("com.ssmalllucky.endingapp.category.ENDING")
            startActivity(intent)
        }
    }
}