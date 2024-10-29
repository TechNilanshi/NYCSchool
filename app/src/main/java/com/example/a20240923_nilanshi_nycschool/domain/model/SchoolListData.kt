package com.example.a20240923_nilanshi_nycschool.domain.model

data class SchoolListData(val school_name : String? = null,
    val overview_paragraph : String? = null,
                          val primary_address_line_1 : String? = null,
                          val city : String? = null,
                          val zip: String? = null,
                          val state_code: String? = null,

                          val school_email : String? = null)