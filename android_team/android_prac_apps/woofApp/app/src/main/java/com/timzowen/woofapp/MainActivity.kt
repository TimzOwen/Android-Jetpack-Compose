package com.timzowen.woofapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.woofapp.data.WoofData
import com.timzowen.woofapp.module.Woof
import com.timzowen.woofapp.ui.theme.WoofAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WoofAppTheme {
                WoofApp(woof = WoofData().loadWoof())
            }
        }
    }
}

@Composable
fun WoofApp(woof: List<Woof>) {
   LazyColumn {
       items(woof){ woofs ->
           WoofCard(
               woof = woofs )
       }
   }
}


@Composable
fun WoofCard(woof: Woof, modifier: Modifier = Modifier) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically){
            Box {
                Image(
                    painter = painterResource(id = woof.imageResourceId),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(80.dp)
                        .aspectRatio(1f)
                        .clip(CircleShape)
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            ) {
                Text(
                    text = stringResource(id = woof.nameStringResourceId),
                    modifier = modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = "${woof.ageResource}"
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.drop_down_icon_menu) ,
                modifier = modifier
                    .padding(end = 16.dp)
                    .size(24.dp),
                contentDescription = null
            )
    }
}

@Preview(showBackground = true)
@Composable
fun WoofCardPreview() {
    WoofAppTheme {
        WoofApp(
            woof = WoofData().loadWoof() )
    }
}