package com.timzowen.bizcard

class AgentsList {

    fun loadAgents(): List<Agents>{
        return listOf(
            Agents("Timz Owen","Mpesa Support"),
            Agents("James Mwangi","Sales Support"),
            Agents("Kenneth Kamau","Prime Support"),
            Agents("Oluoch Akech","Call Support"),
            Agents("Sandra Onyoyi","Service Support"),
            Agents("Stacy Kendi","Till Support"),
            Agents("Sam Kaunda","HR Support"),
        )
    }

}

data class Agents(
    val userName: String,
    val roleSupport: String
)