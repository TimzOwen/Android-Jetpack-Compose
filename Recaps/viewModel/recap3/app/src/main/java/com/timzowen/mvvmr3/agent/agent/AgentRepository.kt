package com.timzowen.mvvmr3.agent.agent

import kotlinx.coroutines.delay

class AgentRepository {

    suspend fun getAgentDetails(): Agent {
        delay(2000)
        return Agent("Timz", "Owen")
    }
}