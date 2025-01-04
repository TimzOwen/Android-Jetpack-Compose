package com.timzowen.mvvmr2.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.timzowen.mvvmr2.model.Iprs
import com.timzowen.mvvmr2.model.IprsRepository
import com.timzowen.mvvmr2.model.SecurityScore
import kotlinx.coroutines.launch

class IprsViewModel: ViewModel() {

    private val _iprsData = MutableLiveData<Iprs>()
    val iprsData: LiveData<Iprs> = _iprsData

    private val _isLoading = MutableLiveData<Boolean>(false)
    val isLoading: LiveData<Boolean> = _isLoading

    private val _score = MutableLiveData<SecurityScore>()
    val securityScore: LiveData<SecurityScore> = _score

    private val iprsRepository = IprsRepository()

    fun getIprsUserData(){
        viewModelScope.launch {
            _isLoading.value = true
            val fetchedData = iprsRepository.fetchUserData()
            _iprsData.postValue(fetchedData)
            _isLoading.value = false
        }
    }

    fun getSecurityScore(){
        viewModelScope.launch {
            val currentScore = iprsRepository.fetchScore()
            _score.value = currentScore
        }
    }
}