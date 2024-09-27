package com.example.a20240923_nilanshi_nycschool.presentation.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a20240923_nilanshi_nycschool.R

@SuppressLint("ResourceAsColor")
@Composable
fun SchoolDetailScreen(score: String?, detail: String?) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Detail ->\n " + detail.toString(),
            style = TextStyle(
                fontSize = 15.sp,
                color = Color(R.color.black)
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "SCORE -> \n" + score.toString(),
            style = TextStyle(
                fontSize = 12.sp,
                color = Color(R.color.black)
            )
        )
    }
}