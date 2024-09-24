package com.example.a20240923_nilanshi_nycschool.navigation

sealed class ScreenList(val route : String){
    object SchoolListScreen : ScreenList("SchoolList")
    object SchoolDetailScreen : ScreenList("SchoolDetailScreen")

    fun withArgs(vararg args : String): String{
        return buildString {
            append(route)
            args.forEach {
                args ->
                append("/$args")
            }
        }
    }
}
