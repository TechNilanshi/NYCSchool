package com.example.a20240923_nilanshi_nycschool.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.a20240923_nilanshi_nycschool.domain.repository.SchoolListRepository
import com.example.a20240923_nilanshi_nycschool.presentation.ui.SchoolViewState
import com.example.a20240923_nilanshi_nycschool.utils.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class SchoolDataViewModel @Inject constructor(private val schoolListRepository: SchoolListRepository) :
    ViewModel() {

    private val _state = MutableStateFlow(SchoolViewState())
    val state = _state.asStateFlow()

    init {
        getSchoolListFromViewModel()
    }

    fun getSchoolListFromViewModel() {
        viewModelScope.launch {
            _state.update {
                it.copy(isLoading = true)
            }
            schoolListRepository.getSchoolList()
                .onRight { schools ->
                    _state.update {
                        it.copy(schoolList = schools)
                    }

                }
                .onLeft { error ->
                    _state.update {
                        it.copy(error = error.error.message)
                    }
                    sendEvent(Event.Toast(error.error.message))
                }


            _state.update {
                it.copy(isLoading = false)
            }
        }
    }
}