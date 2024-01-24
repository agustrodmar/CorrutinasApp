package com.arodmar432p.corrutinasapp.corrutinasapp.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.arodmar432p.corrutinasapp.corrutinasapp.domain.LockUseCase

class MainViewModel(private val lockUseCase: LockUseCase) : ViewModel() {
    val apiResponse = mutableStateOf("")

    fun callApi() {
        apiResponse.value = lockUseCase.bloqueoApp()
    }
}