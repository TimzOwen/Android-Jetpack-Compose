package com.timzowen.jettip

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
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
                JetTipApp {

                }
            }
        }
    }
}

@Composable
fun JetTipApp(content: @Composable  () -> Unit) {
    JetTipTheme {
        Surface(color = MaterialTheme.colorScheme.onBackground) {
            MainContent()
        }
    }
}

@Preview
@Composable
fun TopHeader(totalPrice: Double = 100.0){
    val totalAmount = "%.2f".format(totalPrice)
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(corner = CornerSize(12.dp)))
                .height(150.dp),
            color = Color(0xFFE9D7F7)
        ) {
            Column(
                modifier = Modifier.padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Total Price per Person",
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "$$totalAmount",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold
                )
            }

    }
}

@Preview
@Composable
fun MainContent(){
    BillForm(){ billAmount ->
        Log.d("TAG","Main content $billAmount")
    }
}

@Composable
fun BillForm(modifier: Modifier = Modifier,
             onValChange: (String) -> Unit = {}
) {
    val totalBillState = remember { mutableStateOf("0") }
    val validState = remember(totalBillState.value) { totalBillState.value.trim().isNotEmpty() }
    val keyboardController = LocalSoftwareKeyboardController.current

    Surface(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp, top = 16.dp),
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
                    if(!validState) return@KeyboardActions
                    onValChange(totalBillState.value.trim())
                    keyboardController?.hide()
                }
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun BillCardPreview() {
    JetTipTheme {
    }
}