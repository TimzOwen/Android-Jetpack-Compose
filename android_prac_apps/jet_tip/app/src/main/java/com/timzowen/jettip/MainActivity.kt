package com.timzowen.jettip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.InputChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.jettip.components.InputField
import com.timzowen.jettip.ui.theme.JetTipTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetTipApp {

            }
        }
    }
}

@Composable
fun JetTipApp(content: @Composable  () -> Unit) {
    JetTipTheme {
        Surface() {
            TopHeader()
        }
    }
}

@Composable
fun TopHeader(totalPrice: Double = 100.0){
    val totalAmount = "%.2f".format(totalPrice)
    Surface(modifier = Modifier
        .fillMaxWidth()
        .clip(shape = RoundedCornerShape(corner = CornerSize(12.dp)))
        .height(150.dp),
        color = Color(0xFFE9D7F7)) {
        Column(
            modifier = Modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Total Price per Person",
                style = MaterialTheme.typography.displaySmall
            )
            Text(
                text = "$$totalAmount",
                style = MaterialTheme.typography.displayMedium,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview
@Composable
fun MainContent(){
    val totalBillState = remember { mutableStateOf("0") }
    Surface(modifier = Modifier
        .fillMaxWidth()
        .padding(2.dp),
        border = BorderStroke(width = 1.dp, color = Color.LightGray),
        shape = RoundedCornerShape(corner = CornerSize(8.dp))
    ) {
        Column {
            InputField(
                valueState = totalBillState,
                labelId = "Enter Bill",
                enabled = true ,
                isSingleLine = true,
                onAction = KeyboardActions {
                    
                }
            )
            Text("split")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BillCardPreview() {
    JetTipTheme {
        JetTipApp{}
    }
}