package com.timzowen.viewmodel001.viewmodel

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.timzowen.viewmodel001.model.ParkingSlots
import com.timzowen.viewmodel001.model.UserData
import com.timzowen.viewmodel001.model.UserRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class UserViewModel: ViewModel() {

    private val userRepository = UserRepository()

    private val _userData = MutableLiveData<UserData>()
    val userData: LiveData<UserData> = _userData

    private val _parkingSlot = MutableLiveData<ParkingSlots>()
    val parkingSlots:LiveData<ParkingSlots> = _parkingSlot

    private val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean> = _isLoading

    fun getUserData(){
        _isLoading.postValue(true)
        viewModelScope.launch {
            val userResult = userRepository.fetchUserData()
            _userData.postValue(userResult) // assign value to data
            _isLoading.postValue(false)
        }
    }

    fun getParkingSlots(){
        viewModelScope.launch {
            val parking = userRepository.fetchParking()
            _parkingSlot.postValue(parking)
        }
    }
}