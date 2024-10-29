package com.example.a20240923_nilanshi_nycschool.presentation.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a20240923_nilanshi_nycschool.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("ResourceAsColor")
@Composable
fun SchoolDetailScreen(address: String?, detail: String?) {


    Scaffold( topBar = {
        MyTopAppBAr("Detail Screen")
    },content = { paddingValues ->
        Card(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth() ,
            shape = RoundedCornerShape(5.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(paddingValues)
            ) {

                Text(
                    text = "Detail -> \n" + address.toString(),
                    style = TextStyle(
                        fontSize = 15.sp,
                        color = Color(R.color.black)
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Address ->\n " + detail.toString(),
                    style = TextStyle(
                        fontSize = 12.sp,
                        color = Color(R.color.black)
                    )
                )


            }
        }

    })

}