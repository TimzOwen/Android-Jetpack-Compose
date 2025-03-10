package com.timzowen.birthdayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.timzowen.birthdayapp.ui.theme.AppTheme
import com.timzowen.birthdayapp.woofApp.WoofApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme  {
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
    AppTheme (darkTheme = false) {
        WoofApp()
    }
}
