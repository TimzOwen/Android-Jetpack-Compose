package com.timzowen.birthdayapp.businessCard

import android.graphics.drawable.Icon
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.timzowen.birthdayapp.R

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF073042))
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(top = 250.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                modifier = Modifier.size(100.dp),
                contentDescription = "android logo"
            )
            Text(text = "Timz Owen", color = Color.White)
            Text(text = "Android Developer", color = Color.White)
        }
        Spacer(modifier = Modifier.height(200.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ContactCard(
                iconImage = Icons.Default.Call,
                "+254 740 354 167",
                textBlur = 1.dp
            )
            HorizontalDivider(modifier = Modifier.padding(6.dp))
            ContactCard(
                Icons.Default.Share,
                "@AndroidDev254"
            )
            HorizontalDivider(modifier = Modifier.padding(6.dp))
            ContactCard(
                Icons.Default.Email,
                "timz.owen@google.com"
            )
        }
    }
}

@Composable
fun ContactCard(iconImage: ImageVector, userAccount: String,textBlur: Dp = 0.dp) {
    Row(
        modifier = Modifier.padding(16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = iconImage,
            tint = Green,
            contentDescription = "share icon",
            modifier = Modifier.weight(1f)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = userAccount,
            color = Color.White,
            modifier = Modifier
                .weight(3f)
                .blur(textBlur)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun BusinessCardPreview() {
    BusinessCard()
}