package com.timzowen.birthdayapp.artSpace

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.birthdayapp.R
import java.time.Year

@Composable
fun ArtSpaceApp() {
    var currentIndex by remember { mutableIntStateOf(0) }
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ArtWorkWall(currentIndex)
        ArtDescription(currentIndex)
        ArtControllers(currentIndex){newIndex -> currentIndex = newIndex}
    }
}

@Composable
fun ArtWorkWall(currentIndex: Int) {
    Surface(
        modifier = Modifier
            .padding(16.dp),
        shadowElevation = 4.dp,
        tonalElevation = 8.dp
    ) {
        Image(
            modifier = Modifier
                .padding(32.dp)
                .height(400.dp)
                .width(300.dp)
                .border(2.dp, color = Color.Gray),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = artworks[currentIndex].artImage),
            contentDescription = "Art description"
        )
    }
}

@Composable
fun ArtDescription(currentIndex: Int) {
    Surface(modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth(),
        color = Color(0xFFECE6E6)
        ) {
        Column {
            Text(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp),
                text = "${artworks[currentIndex].title} ",
                style = TextStyle(
                    fontSize = 32.sp
                )
            )
            Text(modifier = Modifier.padding(bottom = 16.dp, start = 16.dp, top = 8.dp),
                text = "Generation Zii ${artworks[currentIndex].year}",
                style = TextStyle(
                    fontWeight = FontWeight.Bold
                )
                )
        }
    }
}

@Composable
fun ArtControllers(currentIndex: Int, onIndexChanged: (Int) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(
            modifier = Modifier.weight(1f),
            onClick = {
               onIndexChanged(if (currentIndex>0) currentIndex -1 else artworks.size-1)
            }
        ) {
            Text(text = "Previous")
        }
        Spacer(Modifier.width(80.dp))
        Button(
            modifier = Modifier.weight(1f),
            onClick = {
                onIndexChanged((currentIndex+1)% artworks.size)
            }
        ) {
            Text(text = "Next")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun ArtSpacePreview() {
    ArtSpaceApp()
}