package com.example.a20240923_nilanshi_nycschool.presentation.ui

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.example.a20240923_nilanshi_nycschool.R
import com.example.a20240923_nilanshi_nycschool.domain.model.SchoolListData
import com.example.a20240923_nilanshi_nycschool.presentation.navigation.ScreenList
import com.example.a20240923_nilanshi_nycschool.presentation.viewModel.SchoolDataViewModel

@Composable
internal fun SchoolListScreen(
    navController: NavController,
    viewModel: SchoolDataViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    SchoolListContent(navController, state = state)
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@Composable
fun SchoolListContent(navController: NavController, state: SchoolViewState) {
    Log.d("schoolData", state.schoolList.size.toString())

    Scaffold(
        topBar = {
            MyTopAppBAr("Schools")
        },
        content = { paddingValues ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(state.schoolList) { schoolsData ->
                    SchoolListDataScreen(navController, schoolsData)
                    Divider(
                        modifier = Modifier
                            .padding(top = 10.dp, bottom = 10.dp)
                            .height(1.dp)
                            .background(color = Color(R.color.black))
                    )
                }

            }
        })
}

@SuppressLint("ResourceAsColor")
@Composable
fun SchoolListDataScreen(navController: NavController, schoolListData: SchoolListData) {
    val detail = schoolListData.overview_paragraph
    val score = schoolListData.school_email
    val address = schoolListData.primary_address_line_1 + schoolListData.city + schoolListData.zip + schoolListData.state_code


    //Log.d("detalsss", detail)
    Card(
        modifier = Modifier
            .padding(2.dp)
            .fillMaxWidth(),

        shape = RoundedCornerShape(5.dp)
    ) {
        Column(modifier = Modifier.padding(5.dp)) {
            schoolListData.school_name?.let {
                Text(
                    text = it,
                    style = TextStyle(
                        fontSize = 15.sp,
                        color = Color(R.color.black)
                    )
                )
            }

            Spacer(modifier = Modifier.height(5.dp))

            schoolListData.school_email?.let {
                Text(
                    text = it,
                    style = TextStyle(
                        fontSize = 12.sp,
                        color = Color(R.color.black)
                    )
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {
                navController.navigate(
                    ScreenList.SchoolDetailScreen.withArgs(
                        detail!!,
                        address!!
                    )
                )
            }, modifier = Modifier.fillMaxSize()) {
                Text(text = "Show Details")
            }


        }
    }
}
