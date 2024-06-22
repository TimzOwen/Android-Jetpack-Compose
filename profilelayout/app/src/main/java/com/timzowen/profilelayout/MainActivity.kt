package com.timzowen.profilelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.ContentAlpha
import androidx.wear.compose.material.LocalContentAlpha
import androidx.wear.compose.material.Scaffold
import com.timzowen.profilelayout.ui.theme.ProfileLayoutTheme
import com.timzowen.profilelayout.ui.theme.lightGreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileLayoutTheme {
                MainScreen()
            }

        }
    }
}

@Composable
fun MainScreen() {
    Scaffold() {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            ProfileCard()
        }
    }
}

@Composable
fun ProfileCard() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            ProfilePicture()
            ProfileContent()
        }
    }
}

@Composable
fun ProfilePicture() {
    Card(
        shape = CircleShape,
        modifier = Modifier.padding(16.dp),
        border = BorderStroke(width = 2.dp, color = lightGreen),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.profile_one),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(75.dp)
        )
    }
}

@Composable
fun ProfileContent() {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Timz Owen", style = MaterialTheme.typography.headlineSmall)
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(text = "Active now", style = MaterialTheme.typography.bodySmall)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProfileLayoutTheme {
        MainScreen()
    }
}