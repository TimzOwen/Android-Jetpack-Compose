package com.timzowen.mvvmr3.agent.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.timzowen.mvvmr3.agent.AgentRepository

class AgentViewModel: ViewModel() {

    private val agent = MutableLiveData<AgentRepository>()
    val _agent = agent

}