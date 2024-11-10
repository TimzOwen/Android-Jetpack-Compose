package com.timzowen.intro101

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreStateViewModel : ViewModel() {

   private val _currentScore = MutableLiveData<String>()
    val currentScore: LiveData<String> = _currentScore

    private val _totalScore = MutableLiveData<String>()
    val totalScore: LiveData<String> = _totalScore

    fun updateCurrentScore(score: String){
        _currentScore.value = score
    }

    fun updateTotalScore(score: String) {
        _totalScore.value = score
    }

}