package com.timzowen.mvvmr3.router

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class RouterViewModel: ViewModel() {

    private val _router = MutableLiveData<Router>()
    val router:LiveData<Router> = _router

    private val _isLoading = MutableLiveData(false)
    val isLoading:LiveData<Boolean>  = _isLoading

    private val routerRepository = RouterRepository()

    fun routerDetails(){
        viewModelScope.launch {
            _isLoading.value = true
            val router = routerRepository.getRouterDetails()
            _router.value = router
            _isLoading.value = false
        }
    }
}