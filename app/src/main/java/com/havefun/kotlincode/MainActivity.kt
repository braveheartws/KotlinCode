package com.havefun.kotlincode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        MyLiveData.info.observe(this,{
            textView.text = it
        })


        MyLiveData.info.postValue("hello kt");
    }
}