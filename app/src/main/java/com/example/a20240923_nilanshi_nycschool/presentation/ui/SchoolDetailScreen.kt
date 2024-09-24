package com.example.a20240923_nilanshi_nycschool.presentation.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.a20240923_nilanshi_nycschool.R

@SuppressLint("ResourceAsColor")
@Composable
fun SchoolDetailScreen( score : String?, detail : String?){
    Column {
        Text(
            text = score.toString(),
            style = TextStyle(
                fontSize = 12.sp,
                color = Color(R.color.black)
            )
        )
        Text(
            text = detail.toString(),
            style = TextStyle(
                fontSize = 12.sp,
                color = Color(R.color.black)
            )
        )
    }
}