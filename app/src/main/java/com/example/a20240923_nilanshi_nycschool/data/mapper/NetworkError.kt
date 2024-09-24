package com.example.a20240923_nilanshi_nycschool.data.mapper

import android.os.Build
import androidx.annotation.RequiresExtension
import com.example.a20240923_nilanshi_nycschool.domain.model.ApiError
import com.example.a20240923_nilanshi_nycschool.domain.model.NetworkError
import retrofit2.HttpException
import java.io.IOException

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
fun Throwable.toNetworkError():NetworkError{
    val error = when(this){
        is IOException ->ApiError.NetworkError
        is HttpException -> ApiError.UnknownResponse
        else ->ApiError.UnknownError
    }

    return NetworkError(error = error,
        t =this)
}