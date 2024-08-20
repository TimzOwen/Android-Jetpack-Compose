package com.timzowen.woofappr3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.woofappr3.ui.theme.WoofAppR3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WoofAppR3Theme {
                WoofAppCard()
            }
        }
    }
}

@Composable
fun WoofAppCard(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .background(Color.Gray)
    ) {
        Card {
            Column {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.bella),
                        modifier = Modifier
                            .padding(8.dp)
                            .size(70.dp)
                            .clip(RoundedCornerShape(50))
                            .aspectRatio(1f),
                        contentScale = ContentScale.Crop,
                        contentDescription = stringResource(id = R.string.dog_name_1)
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = modifier.padding(8.dp)
                    ) {
                        Text(
                            text = stringResource(id = R.string.dog_name_1)
                        )
                        Text(
                            text = "5"
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(
                        onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Filled.ExpandMore,
                            contentDescription = null,
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
                Column (modifier = modifier
                    .padding(8.dp)) {
                    Text(
                        text = stringResource(id = R.string.about) )
                    Text(
                        text = stringResource(id = R.string.dog_description_1) )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WoofAppR3Theme {
        WoofAppCard()
    }
}