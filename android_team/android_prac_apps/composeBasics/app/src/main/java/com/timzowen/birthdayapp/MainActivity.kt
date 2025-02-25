package com.timzowen.birthdayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.timzowen.birthdayapp.artSpace.ArtSpaceApp
import com.timzowen.birthdayapp.diceRoller.DiceRollerApp
import com.timzowen.birthdayapp.lemonade.LemonadeApp
import com.timzowen.birthdayapp.phonecontact.PhoneContact
import com.timzowen.birthdayapp.quadrant2.QuadrantApp
import com.timzowen.birthdayapp.tipCalculator.TipCalculator
import com.timzowen.birthdayapp.ui.theme.BirthdayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayAppTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .systemBarsPadding(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceApp()
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


