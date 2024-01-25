package com.arodmar432p.corrutinasapp.corrutinasapp.data

import kotlinx.coroutines.delay
import java.lang.Exception


/**
 * This class represents a fake API that simulates a long-running operation using coroutines.
 */
class MyApi {

    private var count = 0

    /**
     * Simulates a long-running operation and returns a response.
     *
     * This function uses a coroutine to simulate a long-running operation,
     * then returns a string that includes the number of times this function has been called.
     * If an exception occurs during the operation, it returns an error message.
     *
     * @return a string that represents the response from the API.
     */
    suspend fun fetchData(): String {

        return try  {
            delay(5000)
            count++
            "Respuesta de la API ($count)"

        } catch (e: Exception) {
            "Error: $(Ups! Algo ha ido mal, vuelva a intentarlo.)"
        }
    }
}
