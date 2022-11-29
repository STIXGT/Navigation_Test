package com.example.navigation_test.ui.lolview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LolviewViewModel : ViewModel(){
    private val _text = MutableLiveData<String>().apply {
        value = "This is lolview Fragment"
    }
    val text: LiveData<String> = _text
}