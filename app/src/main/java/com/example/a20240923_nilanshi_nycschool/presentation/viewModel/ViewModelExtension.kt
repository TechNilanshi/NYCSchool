package com.example.a20240923_nilanshi_nycschool.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.a20240923_nilanshi_nycschool.utils.EventBus
import kotlinx.coroutines.launch

fun ViewModel.sendEvent(event : Any){
    viewModelScope.launch{
        EventBus.sendEvent(event)
    }
}