package com.timzowen.birthdayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.birthdayapp.affirmationsApp.AffirmationsApp
import com.timzowen.birthdayapp.artSpace.ArtSpaceApp
import com.timzowen.birthdayapp.courseApp.MainCourse
import com.timzowen.birthdayapp.diceRoller.DiceRollerApp
import com.timzowen.birthdayapp.lemonade.LemonadeApp
import com.timzowen.birthdayapp.phonecontact.PhoneContact
import com.timzowen.birthdayapp.quadrant2.QuadrantApp
import com.timzowen.birthdayapp.tipCalculator.TipCalculator
import com.timzowen.birthdayapp.ui.theme.BirthdayAppTheme
import com.timzowen.birthdayapp.ui.theme.WoofTheme
import com.timzowen.birthdayapp.woofApp.WoofApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WoofTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .systemBarsPadding()
//                    color = MaterialTheme.colorScheme.background
                ) {
                    WoofApp()
//                    MainCourse()
//                    AffirmationsApp()
//                    ArtSpaceApp()
//                    TipCalculator()
//                    LemonadeApp()
//                    DiceRollerApp()
//                    PhoneContact()
//                    QuadrantApp()
//                    TaskManager()
//                    QuadrantApp()
//                    HappyBirthdayApp()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun WoofPreview() {
    WoofTheme(darkTheme = true) {
        WoofApp()
    }
}
