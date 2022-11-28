package com.timzowen.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
                    color = MaterialTheme.colors.background
                ) {
                    BirthDayGreetingWithImage("Welcome to compose","-From Timz Owen")
                }
            }
        }
    }
}

@Composable
fun BirthDayGreetingWithImage(message: String, from: String){
    val image = painterResource(R.drawable.androidparty)
    Box{
        Image(
            painter = image,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop,
            contentDescription =null
        )
        BirthDayCardWithText(
            message = message,
            from = from
        )
    }
}

@Composable
fun BirthDayCardWithText(message : String, from: String){
    Column{
         Text(
             text = message,
             fontSize = 34.sp
         )
        Text(
            text = from,
            fontSize = 24.sp
        )
    }
}

//@Preview(showBackground = false)
//@Composable
//fun BirthdayCardImagePreview(){
//    BirthDayGreetingWithImage("hello Compose"," -From Timz ")
//}

//@Preview(showBackground = false)
//@Composable
//fun BirthDayCardPreview(){
//    HappyBirthdayTheme {
//        BirthDayCardWithText(message = "Welcome to Compose ","From Owen")
//    }
//}


