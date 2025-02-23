package com.timzowen.mvvmr3.shop

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ShopViewModel: ViewModel() {

    private val _shop = MutableLiveData<Shop>()
    val shop:LiveData<Shop> = _shop

    private val _isLoading = MutableLiveData(false)
    val isLoading = _isLoading

    private val shopRepository = ShopRepository()

    fun shopDetails(){
        viewModelScope.launch {
            _isLoading.value = true
            val shop = shopRepository.getShopDetails()
            _shop.value = shop
            _isLoading.value = false
        }
    }

}