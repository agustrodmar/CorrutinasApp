package com.arodmar432p.corrutinasapp.corrutinasapp.data

class MyApi {

    var count = 0

    fun lockApp(): String {
        Thread.sleep(5000)
        count++
        return "Respuesta de la API $count"
    }
}