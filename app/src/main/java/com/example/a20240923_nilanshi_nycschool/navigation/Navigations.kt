package com.example.a20240923_nilanshi_nycschool.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.a20240923_nilanshi_nycschool.presentation.ui.SchoolDetailScreen
import com.example.a20240923_nilanshi_nycschool.presentation.ui.SchoolListContent
import com.example.a20240923_nilanshi_nycschool.presentation.ui.SchoolListScreen

@Composable
fun navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ScreenList.SchoolListScreen.route) {
        composable(route = ScreenList.SchoolListScreen.route) {
            SchoolListScreen(navController = navController)
        }

        composable(
            route = ScreenList.SchoolDetailScreen.route + "/{name}" + "/{name2}",
            arguments = listOf(navArgument("name") {
                type = NavType.StringType
                defaultValue = "Nilanshi"
                nullable = true
            },

                navArgument("name2") {
                    type = NavType.StringType
                    defaultValue = ""
                    nullable = true
                }
            ),
        ) { entry ->
            SchoolDetailScreen(
                score =  entry.arguments?.getString("name"),
                detail =  entry.arguments?.getString("name2")

            )
        }
    }
}