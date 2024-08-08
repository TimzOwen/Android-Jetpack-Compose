package com.timzowen.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    ArtSpaceApp( )
                }
            }
        }
    }
}

@Composable
fun ArtSpaceApp() {
    var result by remember { mutableStateOf(0) }

    when(result){
        1 -> ArtWithContents(
            artPicture = R.drawable.lemon_drink,
            artTitle = stringResource(R.string.lemonade_to_drink),
            artDescription = "New article in town" 
        )
        2 -> ArtWithContents(
            artPicture = R.drawable.lemon_tree,
            artTitle = stringResource(R.string.this_is_lemon_tree),
            artDescription = stringResource(R.string.produces_lemon_fruits)
        )
        3 -> ArtWithContents(
            artPicture = R.drawable.lemon_restart,
            artTitle = stringResource(R.string.time_to_restart),
            artDescription = stringResource(R.string.lets_restart_the_lemon_tree)
        )
        4 -> ArtWithContents(
            artPicture = R.drawable.lemon_squeeze,
            artTitle = stringResource(R.string.lets_squeeze_lemon),
            artDescription = stringResource(R.string.squeeze_to_drink_the_lemon)
        )
    }


    Row (horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 750.dp)){
        Button(
            onClick = { result -- },
            shape = RoundedCornerShape(50.dp),
            border = BorderStroke(2.dp, Color.Gray),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 20.dp
            )
        ) {
            Text(text = "previous")
        }
        Button(
            onClick = { result ++ },
            shape = RoundedCornerShape(50.dp),
            border = BorderStroke(2.dp, Color.Gray),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 20.dp
            )) {
            Text(text = "Next")
        }
        
    }

}

@Composable
fun ArtWithContents(artPicture: Int, artTitle: String, artDescription: String){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = artPicture),
            contentDescription = null,
            modifier= Modifier
                .padding(20.dp)
                .height(300.dp)
                .width(300.dp)
                .border(border = BorderStroke(2.dp, color = Color.Gray), shape = RectangleShape)
                .shadow(elevation = 4.dp)
                .padding(10.dp)
        )

        Card(
            modifier = Modifier.padding(horizontal = 45.dp, vertical = 90.dp)
        ) {}

        Column (modifier = Modifier.padding(16.dp)){
            Text(
                text = artTitle,
                fontSize = 25.sp,
                textAlign = TextAlign.Start,
                lineHeight = 30.sp
            )
            Text(
                text = artDescription,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
    
}

@Preview(showBackground = true)
@Composable
fun ArtSpaceAppPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}