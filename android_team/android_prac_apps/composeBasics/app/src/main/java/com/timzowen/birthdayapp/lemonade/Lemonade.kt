package com.timzowen.birthdayapp.lemonade

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.birthdayapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LemonadeApp() {
    var currentStep by remember { mutableStateOf(1) }
    var squeezeCount by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("Lemonade", fontWeight = FontWeight.Bold)
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }
    ) { innerPadding ->
           Surface(modifier = Modifier
               .padding(innerPadding)
               .fillMaxSize()
               .background(MaterialTheme.colorScheme.tertiaryContainer),
               color = MaterialTheme.colorScheme.background) {

               when(currentStep){
                   1 -> {
                       LemonImageAndText(
                           drawableResourceId = R.drawable.lemon_tree,
                           contentDescriptionResourceId = R.string.lemon_tree,
                           textLabelResourceId = R.string.tap_lemon_tree,
                           onImageClick = {
                               currentStep = 2
                               squeezeCount = (2..4).random()
                           }
                       )
                   }
                   2 -> {
                       LemonImageAndText(
                           textLabelResourceId = R.string.squeeze_lemon,
                           drawableResourceId = R.drawable.lemon_squeeze,
                           contentDescriptionResourceId = R.string.lemon_tree,
                           onImageClick = {
                               squeezeCount--
                               if (squeezeCount == 0) {
                                   currentStep = 3
                               }
                           }
                       )
                   }

                   3 -> {
                       LemonImageAndText(
                           textLabelResourceId = R.string.squeeze_lemon,
                           drawableResourceId = R.drawable.lemon_drink,
                           contentDescriptionResourceId = R.string.squeeze_lemon,
                           onImageClick = {
                               currentStep = 4
                           }
                       )
                   }
                   4 -> {
                       LemonImageAndText(
                           textLabelResourceId = R.string.squeeze_lemon,
                           drawableResourceId = R.drawable.lemon_restart,
                           contentDescriptionResourceId = R.string.lemon_tree,
                           onImageClick = {
                               currentStep = 1
                           }
                       )
                   }
               }
           }
    }
}

@Composable
fun LemonImageAndText(
    modifier: Modifier = Modifier,
    drawableResourceId: Int,
    textLabelResourceId: Int,
    contentDescriptionResourceId: Int,
    onImageClick: () -> Unit
    ) {
    Box(modifier=modifier) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = onImageClick,
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.tertiaryContainer
                )
            ) {
                Image(
                    painter = painterResource(drawableResourceId),
                    contentDescription = stringResource(contentDescriptionResourceId),
                    modifier = Modifier
                        .height(200.dp)
                        .width(150.dp)
                        .padding(16.dp)
                )
            }
            Spacer(Modifier.height(16.dp))
            Text(
                text = stringResource(textLabelResourceId),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun LemonadeAppPreview() {
    LemonadeApp()
}