package com.havefun.kotlincode.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.havefun.kotlincode.R
import com.havefun.kotlincode.bean.User
import com.havefun.kotlincode.databinding.ActivityTestDatabindingBinding

class TestDataBindingActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityTestDatabindingBinding>(
            this,
            R.layout.activity_test_databinding
        )
        binding.user = User("zhangjunpu", "123456")
    }
}