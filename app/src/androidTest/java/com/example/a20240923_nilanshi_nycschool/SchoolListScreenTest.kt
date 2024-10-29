package com.example.a20240923_nilanshi_nycschool

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.navigation.NavController
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.a20240923_nilanshi_nycschool.presentation.navigation.ScreenList
import com.example.a20240923_nilanshi_nycschool.presentation.ui.SchoolListDataScreen
import com.example.a20240923_nilanshi_nycschool.presentation.ui.SchoolListScreen
import com.example.a20240923_nilanshi_nycschool.presentation.viewModel.SchoolDataViewModel
import io.mockk.impl.annotations.MockK
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class SchoolListScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @MockK
    private lateinit var viewModel: SchoolDataViewModel


    @MockK
    private var navigation : NavController? = null

    @Test
    fun checkButtonClick() {
        composeTestRule.setContent {
         navigation?.let { SchoolListScreen(it,viewModel) }

            //Do Something
            //composeTestRule.onAllNodes({},viewModel)

            // Check Something
          //  compareScreenshot(composeTestRule.onRoot(false))

        }


    }
}