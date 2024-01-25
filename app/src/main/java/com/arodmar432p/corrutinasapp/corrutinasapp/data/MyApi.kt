package com.arodmar432p.corrutinasapp.corrutinasapp.data

import kotlinx.coroutines.delay

/**
 * This class represents a fake API that simulates a long-running operation using coroutines.
 */
class MyApi {

    var count = 0


    /**
     * Simulates a long-running operation and returns a response.
     *
     * This function uses a coroutine to simulate a long-running operation,
     * then returns a string that includes the number of times this function has been called.
     *
     * @return a string that represents the response from the API.
     */
    suspend fun fetchData(): String {
        delay(5000)
        count++
        return "Respuesta de la API ($count)"
    }
}