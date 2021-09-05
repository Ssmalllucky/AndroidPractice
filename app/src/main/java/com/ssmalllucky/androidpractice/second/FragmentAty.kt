package com.ssmalllucky.androidpractice.second

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ssmalllucky.androidpractice.R
import kotlinx.android.synthetic.main.aty_fragment.*

class FragmentAty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aty_fragment)
        dynamicAddBtn.setOnClickListener {
            startActivity(Intent(this, DynamicFragmentAty::class.java))
        }
    }
}