package com.timzowen.businesscard

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF99A59E)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,) {

        Column(
            modifier = Modifier.wrapContentSize().weight(4f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                modifier = Modifier.size(150.dp),
                contentDescription = null
            )
            Text(
                text = "Timz Owen",
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(8.dp),
                fontSize = 24.sp
            )
            Text(
                text = "Android Developer Instructor",
                color = Color(0xFF3ddc84))
        }
        Spacer(modifier = Modifier.padding(24.dp))

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()) {
            Column (
                modifier = Modifier
                    .wrapContentSize()
                    .align(Alignment.BottomCenter)){
            Row {
                Icon(painter = painterResource(R.drawable.icon_email_24),
                    tint = Color.Green,
                    contentDescription = "email")
                Spacer(modifier = Modifier.padding(start = 8.dp))
                Text(text = "timzowen@gmail.com")
            }
                Spacer(modifier = Modifier.padding(8.dp))
            Row {
                Icon(painter = painterResource(R.drawable.icon_share_24),
                    tint = Color(0xFF3ddc84),
                    contentDescription = "share" )
                Spacer(modifier = Modifier.padding(start = 8.dp))
                Text(text = "@AndroidDev")
            }
                Spacer(modifier = Modifier.padding(8.dp))
            Row {
                Icon(painter = painterResource(id = R.drawable.icon_add_call_24),
                    tint = Color.Green,
                    contentDescription = "call")
                Spacer(modifier = Modifier.padding(start = 8.dp))
                Text(text = "+25 4740 3541 7654")
            }
                Spacer(modifier = Modifier.padding(8.dp))
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}