package com.arodmar432p.corrutinasapp.corrutinasapp.domain

import com.arodmar432p.corrutinasapp.corrutinasapp.data.MyApi


/**
 * This class represents a use case for the fetch data operation.
 *
 * @property api an instance of [MyApi] that this use case will use to perform the fetch data operation.
 */
class LockUseCase ( private val api: MyApi ) {

    /**
     * Performs the fetch data operation.
     *
     * This function calls [MyApi.fetchData] to perform the fetch data operation and returns its result.
     *
     * @return a string that represents the result of the fetch data operation.
     */

    suspend fun fetchData(): String {
        return api.fetchData()
    }
}