package com.timzowen.birthdayapp.tipCalculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.birthdayapp.R
import com.timzowen.birthdayapp.widgets.EditNumberField
import com.timzowen.birthdayapp.widgets.RoundTipRow
import java.text.NumberFormat
import kotlin.math.round

@Composable
fun TipCalculator(){
    Surface (modifier = Modifier.fillMaxSize()){
        TipTimeLayout()
    }
}

@Composable
fun TipTimeLayout(){
    var amountInput by remember { mutableStateOf("0") }
    var tipInput by remember { mutableStateOf("0") }
    var roundUp by remember { mutableStateOf(false) }

    val amount = amountInput.toDoubleOrNull() ?: 0.0
    val tipPercent = tipInput.toDoubleOrNull() ?: 0.0

    val tip = calculateTip(amount,tipPercent,roundUp)


    Column(modifier = Modifier
        .statusBarsPadding()
        .padding(horizontal = 40.dp)
        .verticalScroll(rememberScrollState())
        .safeDrawingPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.calculate_tip),
            modifier = Modifier
                .padding(bottom = 16.dp, start = 6.dp)
                .align(Alignment.Start)
        )
        EditNumberField(
            value = amountInput,
            onValueChange = {amountInput = it},
            label = R.string.bill_amount,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            leadingIcon = R.drawable.baseline_attach_money_24
        )
        Spacer(Modifier.height(14.dp))

        EditNumberField(
            value = tipInput,
            onValueChange = {tipInput = it},
            label = R.string.how_was_the_service,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done),
            leadingIcon = R.drawable.baseline_percent_24
        )
        RoundTipRow(
            roundUp = roundUp,
            onRoundUpChanged = {roundUp = it}
        )
        Text(
            text = stringResource(R.string.tip_amount, tip),
            style = MaterialTheme.typography.displayLarge,
            modifier = Modifier.padding(top = 10.dp)
        )
        Spacer(Modifier.height(150.dp))
    }
}

fun calculateTip(amount: Double,tipPercent: Double = 15.0,roundUp: Boolean): String {
    var tip = tipPercent / 100 * amount
    if (roundUp){
        tip = kotlin.math.ceil(tip)
    }
    return NumberFormat.getCurrencyInstance().format(tip)
}

@Preview(showBackground = true)
@Composable
fun TipCalculatorPreview(){
    TipTimeLayout()
}