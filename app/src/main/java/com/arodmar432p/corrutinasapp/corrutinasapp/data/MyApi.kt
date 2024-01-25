package com.arodmar432p.corrutinasapp.corrutinasapp.data

/**
 * This class represents a fake API that simulates a long-running operation.
 */
class MyApi {

    var count = 0

    /**
     * Simulates a long-running operation and returns a response.
     *
     * This function blocks the current thread for 5 seconds to simulate a long-running operation,
     * then returns a string that includes the number of times this function has been called.
     *
     * @return a string that represents the response from the API.
     */
    fun lockApp(): String {
        Thread.sleep(5000)
        count++
        return "Respuesta de la API $count"
    }
}