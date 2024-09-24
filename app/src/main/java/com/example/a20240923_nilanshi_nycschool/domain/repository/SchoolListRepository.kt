package com.example.a20240923_nilanshi_nycschool.domain.repository

import arrow.core.Either
import com.example.a20240923_nilanshi_nycschool.domain.model.NetworkError
import com.example.a20240923_nilanshi_nycschool.domain.model.SchoolListData

interface SchoolListRepository {
    suspend fun getSchoolList():Either<NetworkError,List<SchoolListData>>
}