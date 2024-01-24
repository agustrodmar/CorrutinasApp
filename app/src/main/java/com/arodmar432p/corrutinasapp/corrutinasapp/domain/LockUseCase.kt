package com.arodmar432p.corrutinasapp.corrutinasapp.domain

import com.arodmar432p.corrutinasapp.corrutinasapp.data.MyApi

class LockUseCase (private val api: MyApi) {
    fun bloqueoApp(): String {
        return api.lockApp()
    }
}