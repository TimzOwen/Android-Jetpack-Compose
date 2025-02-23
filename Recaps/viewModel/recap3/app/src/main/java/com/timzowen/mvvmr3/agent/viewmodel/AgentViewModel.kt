package com.timzowen.mvvmr3.agent.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.timzowen.mvvmr3.agent.agent.Agent
import com.timzowen.mvvmr3.agent.agent.AgentRepository
import kotlinx.coroutines.launch

class AgentViewModel: ViewModel() {

    private val _agent = MutableLiveData<Agent>()
    val agent: LiveData<Agent> = _agent

    private val _isLoading = MutableLiveData(false)
    val isLoading = _isLoading

    private val agentRepository = AgentRepository()

    fun getAgentDetails() {
        viewModelScope.launch {
            isLoading.value = true
            val agent = agentRepository.getAgentDetails()
            _agent.value = agent
            isLoading.value = false
        }

    }
}