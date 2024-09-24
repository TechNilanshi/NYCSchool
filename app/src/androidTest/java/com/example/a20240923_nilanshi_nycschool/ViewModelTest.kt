package com.example.a20240923_nilanshi_nycschool
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.mockk.MockKAnnotations

import com.example.a20240923_nilanshi_nycschool.domain.repository.SchoolListRepository
import com.example.a20240923_nilanshi_nycschool.presentation.viewModel.SchoolDataViewModel
import io.mockk.every
import io.mockk.impl.annotations.MockK
import junit.framework.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ViewModelTest {

    @MockK
    lateinit var schoolListRepository: SchoolListRepository
    private var viewModel = SchoolDataViewModel(schoolListRepository)

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
        viewModel = SchoolDataViewModel(schoolListRepository)
    }

    @Test
    fun testViewModeln() {
        viewModel.getSchoolListFromViewModel()
    }
}