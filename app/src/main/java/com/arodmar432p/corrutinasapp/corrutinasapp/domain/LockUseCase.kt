package com.arodmar432p.corrutinasapp.corrutinasapp.domain

import com.arodmar432p.corrutinasapp.corrutinasapp.data.MyApi

class LockUseCase (private val api: MyApi) {
    suspend fun fetchData(): String {
        return api.fetchData()
    }
}