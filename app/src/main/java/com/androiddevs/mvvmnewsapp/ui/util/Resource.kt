package com.androiddevs.mvvmnewsapp.ui.util

sealed class Resource<T>(
    val data: T? = null, //actual response body
    val message: String? = null //response error msg
) {
    // only these classes are allowed to inherit from this class
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T> : Resource<T>()
}