package com.arodmar432p.corrutinasapp.corrutinasapp.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arodmar432p.corrutinasapp.corrutinasapp.domain.LockUseCase
import kotlinx.coroutines.launch

/**
 * This class represents a ViewModel for the main screen of the application.
 *
 * @property lockUseCase an instance of [LockUseCase] that this ViewModel will use to perform operations.
 */
class MainViewModel(private val lockUseCase: LockUseCase) : ViewModel() {
    var apiResponse by mutableStateOf("")
    var color by mutableStateOf(Color.Red)
    var isLoading by mutableStateOf(false)

    /**
     * Calls the API and updates [apiResponse] with the result.
     *
     * This function launches a coroutine to call [LockUseCase.fetchData] and updates [apiResponse] with the result.
     * It also updates [isLoading] to indicate whether the API call is in progress.
     */
    fun callApi() {
        viewModelScope.launch {
            isLoading = true
            apiResponse = lockUseCase.fetchData()
            isLoading = false
        }
    }

    /**
     * Changes the color.
     *
     * This function changes [color] between red and blue each time it's called.
     */
    fun changeColor() {
        color = if (color == Color.Red) Color.Blue else Color.Red
    }
}