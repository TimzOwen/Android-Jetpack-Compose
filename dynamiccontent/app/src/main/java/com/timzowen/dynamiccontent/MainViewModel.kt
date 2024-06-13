package com.timzowen.dynamiccontent

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val textFieldState = MutableLiveData("")

    fun updateTextField(newName: String) {
        textFieldState.value = newName
    }

}