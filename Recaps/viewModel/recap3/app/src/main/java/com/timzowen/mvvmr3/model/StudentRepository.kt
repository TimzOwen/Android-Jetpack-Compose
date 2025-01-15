package com.timzowen.mvvmr3.model

import kotlinx.coroutines.delay

class StudentRepository {

    suspend fun getStudents(): Student{
        delay(2000)
        return Student("Timz","Owen")
    }

}