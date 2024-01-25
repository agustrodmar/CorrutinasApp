package com.arodmar432p.corrutinasapp.corrutinasapp.data

import kotlinx.coroutines.delay

class MyApi {

    var count = 0

    suspend fun fetchData(): String {
        delay(5000)
        count++
        return "Respuesta de la API ($count)"
    }
}