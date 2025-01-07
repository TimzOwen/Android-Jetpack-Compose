package com.timzowen.mvvmr3.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.timzowen.mvvmr3.model.Student
import com.timzowen.mvvmr3.model.StudentRepository
import kotlinx.coroutines.launch

class StudentViewModel: ViewModel() {

    private val _studentData = MutableLiveData<Student>()
    val studentData: LiveData<Student> = _studentData

    private val _isLoading = MutableLiveData(false)
    val isLoading = _isLoading

    private val studentRepository = StudentRepository()

    fun getListOfStudents(){
        viewModelScope.launch {
            _isLoading.value = true
            val students = studentRepository.getStudents()
            _studentData.value = students
            _isLoading.value = false
        }
    }

}