package com.timzowen.shimmerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.shimmerapp.ui.theme.ShimmerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShimmerAppTheme {
                Column(modifier = Modifier.fillMaxSize()) {

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.Absolute.SpaceBetween
                    ) {
                        repeat(6) {
                            ShimmerEffect(
                                modifier = Modifier
                                    .size(60.dp)
                                    .background(Color.LightGray, RoundedCornerShape(50)),
                                durationMillis = 1000
                            )
                        }
                    }

                    ShimmerEffect(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                            .height(60.dp)
                            .background(Color.LightGray, shape = RoundedCornerShape(12.dp))
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp),
                        horizontalArrangement = Arrangement.spacedBy(
                            space = 16.dp,
                            alignment = Alignment.CenterHorizontally
                        ),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Spacer(modifier = Modifier.width(16.dp))
                        ShimmerEffect(
                            Modifier
                                .size(80.dp)
                                .background(Color.LightGray, shape = RoundedCornerShape(50))
                        )

                        Column(
                            modifier = Modifier
                                .weight(0.7f)
                                .height(60.dp)
                                .padding(end = 20.dp)
                        ) {
                            ShimmerEffect(
                                Modifier
                                    .width(320.dp)
                                    .height(20.dp)
                                    .clip(RoundedCornerShape(20.dp))
                                    .background(Color.LightGray)
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            ShimmerEffect(
                                Modifier
                                    .width(100.dp)
                                    .height(20.dp)
                                    .clip(RoundedCornerShape(20.dp))
                                    .background(Color.LightGray)
                            )
                        }
                    }

                    ShimmerEffect(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .padding(16.dp)
                            .background(Color.LightGray, RoundedCornerShape(10.dp))
                    )
                }
            }
        }
    }
}






