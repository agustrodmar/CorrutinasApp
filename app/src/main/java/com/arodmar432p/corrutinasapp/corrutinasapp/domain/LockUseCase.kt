package com.arodmar432p.corrutinasapp.corrutinasapp.domain

import com.arodmar432p.corrutinasapp.corrutinasapp.data.MyApi


/**
 * This class represents a use case for the lock operation.
 *
 * @property api an instance of [MyApi] that this use case will use to perform the lock operation.
 */
class LockUseCase (private val api: MyApi) {


    /**
     * Performs the lock operation.
     *
     * This function calls [MyApi.lockApp] to perform the lock operation and returns its result.
     *
     * @return a string that represents the result of the lock operation.
     */

    fun bloqueoApp(): String {
        return api.lockApp()
    }
}