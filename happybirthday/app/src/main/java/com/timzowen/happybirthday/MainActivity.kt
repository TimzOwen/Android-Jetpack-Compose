package com.timzowen.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    BirthDayWithImage(message = "Hello Compose!", from = "From Timz Owen")
                }
            }
        }
    }
}

@Composable
fun BirthDayWithImage(message: String, from: String){
    val image = painterResource(id = (R.drawable.androidparty))
    Box{
       Image(painter = image, contentDescription = null,
           modifier = Modifier
               .fillMaxHeight()
               .fillMaxWidth(),
           contentScale = ContentScale.Crop
       )
        BirthdayCardText(message = message, from =from)
    }
}

@Composable
fun BirthdayCardText(message : String, from : String){
    Column() {
        Text(text = message, fontSize = 32.sp, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(start = 16.dp, top = 16.dp))
        Text(text = from, fontSize = 26.sp, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(start = 16.dp, end = 16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HappyBirthdayTheme {
        BirthDayWithImage(message = "Hey Jetpack!", from = "From Timz Owen")
    }
}