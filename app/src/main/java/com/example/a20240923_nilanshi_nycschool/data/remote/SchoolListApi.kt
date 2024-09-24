package com.example.a20240923_nilanshi_nycschool.data.remote

import com.example.a20240923_nilanshi_nycschool.domain.model.SchoolListData
import retrofit2.http.GET

interface SchoolListApi {
    @GET("s3k6-pzi2.json")
    suspend fun getSchoolListApi():List<SchoolListData>
}