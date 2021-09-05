package com.ssmalllucky.androidpractice.second

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ssmalllucky.androidpractice.R
import kotlinx.android.synthetic.main.aty_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aty_second)

        fragmentBtn.setOnClickListener {
            startActivity(Intent(this, FragmentAty::class.java))
        }

        desktopWidgetBtn.setOnClickListener {

        }
    }
}