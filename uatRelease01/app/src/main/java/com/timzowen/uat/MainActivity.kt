package com.timzowen.uat

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.timzowen.uat.ui.theme.UatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    Surface(color = Color.Gray,modifier = Modifier.fillMaxSize()) {
        Surface(color = Color.Cyan,
            modifier = Modifier.wrapContentSize(align = Alignment.TopEnd)) {
            Text(text = "Jetpack compose",
                style = MaterialTheme.typography.displaySmall
            )
        }
    }f
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UatTheme {
        MainScreen()
    }
}