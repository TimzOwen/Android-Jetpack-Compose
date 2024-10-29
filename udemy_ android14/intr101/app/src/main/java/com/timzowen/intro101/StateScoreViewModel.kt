package com.timzowen.intro101

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StateScoreViewModel: ViewModel() {

    private val _score = MutableLiveData<String>()
    val score: LiveData<String> = _score
    private val _totalScore = MutableLiveData<String>()
    val totalScore: LiveData<String> = _totalScore

    fun onScoreUpdate(newScore: String){
        _score.value = newScore
    }

    fun totalScoreUpdate(finalScore: String){
        _totalScore.value = finalScore
    }
}