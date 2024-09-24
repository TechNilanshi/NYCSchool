package com.example.a20240923_nilanshi_nycschool.domain.model

data class NetworkError(val error : ApiError,
    val t: Throwable)

enum class ApiError(val message : String){
    NetworkError("Network Error"),
    UnknownResponse("Unknown Response"),
    UnknownError("Unknown Error")
}