package com.timzowen.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.timzowen.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayCardText(message = "Happy Birthday Sam!", from = "From Timz Owen")
                }
            }
        }
    }
}

@Composable
fun BirthDayWithImage(message: String, from: String){
    val image = painterResource(id = R.drawable.ic_launcher_background)
    Image(painter = image, contentDescription = "birthday.Image")
}

@Composable
fun BirthdayCardText(message : String, from : String){
    Column() {
        Text(text = message, fontSize = 18.sp)
        Text(text = from, fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HappyBirthdayTheme {
        BirthDayWithImage(message = "Happy Birthday Sam!", from = "From Timz Owen")
    }
}