package com.timzowen.mvvmr3.agent

import kotlinx.coroutines.delay

data class AgentRepository (
    val firstName: String,
    val secondName: String
)

suspend fun getAgentDetails(): AgentRepository{
    delay(200)
    return AgentRepository("Timz","Owen")
}