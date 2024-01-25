package com.arodmar432p.corrutinasapp.corrutinasapp.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arodmar432p.corrutinasapp.corrutinasapp.domain.LockUseCase
import kotlinx.coroutines.launch

class MainViewModel(private val lockUseCase: LockUseCase) : ViewModel() {
    var apiResponse by mutableStateOf("")
    var color by mutableStateOf(Color.Red)

    fun callApi() {
        viewModelScope.launch {
            apiResponse = lockUseCase.fetchData()
        }
    }

    fun changeColor() {
        color = if (color == Color.Red) Color.Blue else Color.Red
    }
}