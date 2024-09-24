package com.example.a20240923_nilanshi_nycschool.di

import com.example.a20240923_nilanshi_nycschool.data.remote.SchoolListApi
import com.example.a20240923_nilanshi_nycschool.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton
    fun provideSchoolApi():SchoolListApi{
        return Retrofit
            .Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SchoolListApi::class.java)
    }
}