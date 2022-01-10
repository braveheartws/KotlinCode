package com.havefun.kotlincode

import androidx.lifecycle.MutableLiveData

object MyLiveData {
    val info: MutableLiveData<String> by lazy { MutableLiveData() }
}