package com.timzowen.recap4.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.timzowen.recap4.model.Customer
import com.timzowen.recap4.model.CustomerRepository
import kotlinx.coroutines.launch

class CustomerViewModel: ViewModel() {
    private val _customerData = MutableLiveData<Customer>()
    val customerData:LiveData<Customer> = _customerData

    private val _isLoading = MutableLiveData(false)
    val isLoading:LiveData<Boolean> = _isLoading

    private val repository = CustomerRepository()


    fun getCustomer(){
        _isLoading.value = true
        viewModelScope.launch {
            val customer = repository.fetchCustomerData()
            _customerData.value = customer
            _isLoading.value = false
        }
    }

}