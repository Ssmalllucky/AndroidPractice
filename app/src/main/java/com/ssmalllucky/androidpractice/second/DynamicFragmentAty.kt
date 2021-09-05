package com.ssmalllucky.androidpractice.second

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ssmalllucky.androidpractice.R
import kotlinx.android.synthetic.main.aty_dynamic_fragment.*

class DynamicFragmentAty : AppCompatActivity() {

    var counter = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aty_dynamic_fragment)
        addBtn.setOnClickListener {
            var trasaction = supportFragmentManager.beginTransaction()
            var fragment = DynamicFragment()
            var bundle = Bundle()
            bundle.putInt("counter", counter++)
            fragment.arguments = bundle
            trasaction.addToBackStack("")
            trasaction.replace(R.id.addFL, fragment)
            trasaction.commit()
        }
    }

}