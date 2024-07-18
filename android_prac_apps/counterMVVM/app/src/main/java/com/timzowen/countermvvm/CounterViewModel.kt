package com.timzowen.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val  _count = mutableStateOf(0)

    // expose count to UI state as immutable state.
    val count: MutableState<Int> = _count

    fun increment(){
        _count.value ++
    }

    fun decrement() {
        _count.value --
    }


}