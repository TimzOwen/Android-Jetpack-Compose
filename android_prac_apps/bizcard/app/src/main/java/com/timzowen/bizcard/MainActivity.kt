package com.timzowen.bizcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.bizcard.ui.theme.BizCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BizCardTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    CreateBizCard()
                }
            }
        }
    }
}

@Composable
fun CreateBizCard(){
    val btnClickedState = remember { mutableStateOf(true) }

    Surface(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()) {
        Card(modifier = Modifier
            .height(390.dp)
            .width(200.dp)
            .padding(12.dp),
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
            elevation = 4.dp) {
            Column(modifier = Modifier
                .height(300.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally) {

                CreateImageProfile()

                Divider()

                CreateInfo()

                Button(
                    onClick = {
                        btnClickedState.value = false
                    }
                ) {
                    Text(text = "Portfolio", style = MaterialTheme.typography.bodySmall)
                }
                if (btnClickedState.value){
                    Content()
                }else{
                    Box{}
                }
            }

        }

    }

}

@Composable
fun CreateInfo() {
    Column {
        Text(text = "John doe")
        Text(text = "Level 1 Support Engineer" )
        Text(text = "Digital channels")
    }
}

@Composable
fun CreateImageProfile() {
    Image(
        modifier = Modifier
            .height(80.dp)
            .width(80.dp)
            .clip(CircleShape),
        painter = painterResource(id = R.drawable.profile_image) ,
        contentDescription = "Profile image"
    )
}


@Composable
fun Content(){
    Box (modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .padding(5.dp)){
        Surface(modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(3.dp),
            shape = RoundedCornerShape(corner = CornerSize(6.dp)),
            border = BorderStroke(2.dp, color = Color.LightGray)
        ) {
            Portfolio(data= listOf("Project1", "Project2","Project3"))
        }
    }
}

@Composable
fun Portfolio(data: List<String>) {
    LazyColumn {
        items(data){ item ->
            Text(text = item)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BizCardTheme {
        CreateBizCard()
    }
}