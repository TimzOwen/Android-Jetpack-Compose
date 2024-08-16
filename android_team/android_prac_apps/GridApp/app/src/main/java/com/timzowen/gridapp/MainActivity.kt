package com.timzowen.gridapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.gridapp.model.Topic
import com.timzowen.gridapp.ui.theme.GridAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GridAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Composable
fun TopicCard(topic: Topic, modifier: Modifier = Modifier){
    Card {
        Row {
            Box {
                Image(
                    painter = painterResource(id = topic.drawableResourceId),
                    contentDescription = stringResource(id = topic.stringCourseResourceId),
                    contentScale = ContentScale.Crop,
                    modifier = modifier
                        .size(68.dp)
                        .aspectRatio(1f)
                )
            }
            Column {
                Text(
                    text = stringResource(id = topic.stringCourseResourceId),
                    style = MaterialTheme.typography.bodyMedium
                )
                Row {
                    Image(painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = null
                    )
                    Text(text = "${topic.courseNumber}")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopicCardPreview() {
    GridAppTheme {
        TopicCard(
            Topic(R.drawable.architecture,101,R.string.architecture)
        )
    }
}