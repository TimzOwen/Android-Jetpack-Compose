package com.timzowen.contactsmvvm

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class ContactsViewModel: ViewModel() {

    var bgColor by mutableStateOf(Color.White)

    fun changeBackground(){
        bgColor = Color.Green
    }

}