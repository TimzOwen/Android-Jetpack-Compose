package com.timzowen.birthdayapp

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.timzowen.birthdayapp.ui.theme.BirthdayAppTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

//class TipUITests {
//
//    @get:Rule
//    val composeTestRule = createComposeRule()
//
//    @Test
//    fun calculate_20_percent_tip(){
//        composeTestRule.setContent{
//            BirthdayAppTheme {
//                BirthdayAppTheme{
//                }
//            }
//            composeTestRule.onNodeWithText("Bill amount")
//                .performTextInput("10")
//            composeTestRule.onNodeWithText("Tip Percentage")
//                .performTextInput("20")
//            val expectedTip = NumberFormat.getCurrencyInstance().format(2)
//            composeTestRule.onNodeWithText("Tip Amount: $expectedTip").assertExists(
//                "No node with this text was found."
//            )
//        }
//    }
//
//}