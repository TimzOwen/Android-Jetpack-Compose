package com.timzowen.birthdayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.birthdayapp.ui.theme.BirthdayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImageText()
                }
            }
        }
    }
}

@Composable
fun GreetingImageText(modifier: Modifier=Modifier){
    Box(modifier = modifier){
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentScale = ContentScale.Crop,
            alpha = 0.5f,
            contentDescription = "null")
    }
    GreetingText(
        message = stringResource(R.string.happy_birthday_owen),
        from = stringResource(R.string.from_timz) )

}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.Center,
        modifier= modifier
            .fillMaxSize()
            .padding(8.dp)) {
        Text(
            text = message,
            fontSize = 100.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        )
    }

}

@Composable
@Preview(showSystemUi = true, showBackground = true, name = "UI design")
fun HappyBirthDayPreview() {
    GreetingImageText()
}
