package com.ssmalllucky.androidpractice.first

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ssmalllucky.androidpractice.R
import kotlinx.android.synthetic.main.aty_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aty_first)

        firstBtn.setOnClickListener {
            startActivity(Intent(this, IntentActivity::class.java))
        }

        secondBtn.setOnClickListener {
            var intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:10086")
            startActivity(intent)
        }

        thirdBtn.setOnClickListener {
            startActivity(Intent(this, StartingModeActivity::class.java))
        }
    }
}