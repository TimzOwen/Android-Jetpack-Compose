package com.timzowen.intro101

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StateScoreViewModel : ViewModel() {
    private val _currentScore = MutableLiveData<String>()
    var currentScore: LiveData<String> = _currentScore

    private val _totalScore = MutableLiveData<String>()
    val totalScore: LiveData<String> = _totalScore

    fun updateScore(newScore: String){
        _currentScore.value = newScore
    }

    fun updateTotalScore(totalScore: String){
        _totalScore.value = totalScore
    }
}