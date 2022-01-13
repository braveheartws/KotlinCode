package com.havefun.kotlincode

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.havefun.kotlincode.fragment.MainFragment

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private val imgUrl = "https://cn.bing.com/sa/simg/hpb/LaDigue_EN-CA1115245085_1920x1080.jpg"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        MyLiveData.info.observe(this, {
            val color = ContextCompat.getColor(this, R.color.black)
            val color1 = ContextCompat.getColor(this, R.color.purple_500)
            textView.text = "# ${Color.parseColor("#0F000000")}    |  $color1"
            textView.textSize = 50f
        })


        MyLiveData.info.postValue("hello kt")



    }

    override fun onResume() {
        super.onResume()
        supportFragmentManager.beginTransaction().replace(R.id.container, MainFragment(), "TAG")
            .commit()
        val fragment = MainFragment()
        supportFragmentManager.beginTransaction().add(fragment, "TAG")
            .commit()
        supportFragmentManager.beginTransaction().show(fragment)
    }
}