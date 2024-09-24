package com.example.a20240923_nilanshi_nycschool.data.repositoryImpl

import android.os.Build
import androidx.annotation.RequiresExtension
import arrow.core.Either
import com.example.a20240923_nilanshi_nycschool.data.mapper.toNetworkError
import com.example.a20240923_nilanshi_nycschool.data.remote.SchoolListApi
import com.example.a20240923_nilanshi_nycschool.domain.model.NetworkError
import com.example.a20240923_nilanshi_nycschool.domain.model.SchoolListData
import com.example.a20240923_nilanshi_nycschool.domain.repository.SchoolListRepository
import javax.inject.Inject

class SchoolListRepositoryImpl @Inject constructor(private val schoolListApi: SchoolListApi) :
    SchoolListRepository {
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    override suspend fun getSchoolList(): Either<NetworkError, List<SchoolListData>> {
        return Either.catch {
            schoolListApi.getSchoolListApi()
        }.mapLeft { it.toNetworkError() }
    }
}