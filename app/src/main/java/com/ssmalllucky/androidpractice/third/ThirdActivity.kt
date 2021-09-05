package com.ssmalllucky.androidpractice.third

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ssmalllucky.androidpractice.R
import com.ssmalllucky.androidpractice.receiver.AnoBroadcastReceiver
import com.ssmalllucky.androidpractice.receiver.CustomizeBroadcastReceiver
import com.ssmalllucky.androidpractice.receiver.NormalBroadcastReceiver
import kotlinx.android.synthetic.main.aty_third.*

class ThirdActivity : AppCompatActivity() {

    lateinit var mReceiver: NormalBroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aty_third)
        var mAnoReceiver = AnoBroadcastReceiver()
        var mIntentFilter = IntentFilter()
        mIntentFilter.priority = 100
        mIntentFilter.addAction("com.ssmalllucky.action.CUSTOMIZE_RECEIVER")
        registerReceiver(mAnoReceiver, mIntentFilter)
        var mCusReceiver = CustomizeBroadcastReceiver()
        mIntentFilter.priority = 101
        registerReceiver(mCusReceiver, mIntentFilter)

        normalBroadcastBtn.setOnClickListener {
            mReceiver = NormalBroadcastReceiver()
            var mIntentFilter = IntentFilter()
            mIntentFilter.addAction("android.intent.action.TIME_TICK")
            registerReceiver(mReceiver, mIntentFilter)
        }

        orderedBroadcastBtn.setOnClickListener {
            var mIntent = Intent()
            mIntent.action = "com.ssmalllucky.action.CUSTOMIZE_RECEIVER"
            sendOrderedBroadcast(mIntent, null)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (mReceiver != null) {
            unregisterReceiver(mReceiver)
        }
    }
}