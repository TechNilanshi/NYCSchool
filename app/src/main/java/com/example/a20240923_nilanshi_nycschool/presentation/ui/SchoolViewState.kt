package com.example.a20240923_nilanshi_nycschool.presentation.ui

import com.example.a20240923_nilanshi_nycschool.domain.model.SchoolListData

data class SchoolViewState(val isLoading : Boolean = false,
    val schoolList : List<SchoolListData> = emptyList(),
    val error : String? = null
)