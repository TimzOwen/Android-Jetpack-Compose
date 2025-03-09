package com.timzowen.birthdayapp.widgets

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.birthdayapp.R
import com.timzowen.birthdayapp.courseApp.data.Topic

@Composable
fun EditNumberField(
    modifier: Modifier = Modifier,
    value : String,
    @DrawableRes leadingIcon: Int,
    @StringRes label: Int,
    onValueChange: (String) -> Unit,
    keyboardOptions: KeyboardOptions) {
    TextField(
        value = value,
        onValueChange = onValueChange ,
        label =  { Text(stringResource(label)) },
        singleLine = true,
        modifier = modifier,
        keyboardOptions = keyboardOptions,
        leadingIcon = { Icon(painter = painterResource(id = leadingIcon),null) }
    )
}


@Composable
fun CourseCard(modifier: Modifier = Modifier,topic: Topic ) {
    Surface(
        modifier
            .fillMaxWidth()
            .height(80.dp)
    ) {
        Row(modifier  = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            Image(
                modifier = Modifier
                    .size(68.dp),
                painter = painterResource(id = topic.coursePreview),
                contentDescription = "${topic.courseName}"
            )
            Column(
                modifier= Modifier.weight(1f)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 8.dp),
                    text = stringResource(id = topic.courseName),
                    style = MaterialTheme.typography.bodyLarge
                )
                Row(modifier = Modifier
                    .padding(start = 16.dp)){
                    Image(
                        modifier = Modifier.padding(end = 8.dp),
                        painter = painterResource(R.drawable.ic_grain),
                        contentDescription = "${topic.courseName}"
                    )
                    Text(
                        text = stringResource(id = topic.courseEnrolment))
                }
            }
        }
    }
}


@Composable
fun RoundTipRow(
    modifier: Modifier = Modifier,
    roundUp: Boolean,
    onRoundUpChanged: (Boolean) -> Unit) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .size(48.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(stringResource(R.string.round_up_tip))
        Switch(
            modifier = modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End),
            checked = roundUp,
            onCheckedChange = onRoundUpChanged
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EditNumberFieldPreview(){
    RoundTipRow(
        roundUp = true,
        onRoundUpChanged = {}
    )
}

@Preview(showBackground = true)
@Composable
fun CoursePreview(modifier: Modifier = Modifier) {
    CourseCard(
        topic = Topic(
            courseName = R.string.business,
            courseEnrolment = 456,
            coursePreview = R.drawable.business
        )
    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldPreview(){
    EditNumberField(
        modifier = Modifier.padding(2.dp),
        onValueChange = {},
        value = "3",
        label = R.string.bill_amount,
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Next
        ),
        leadingIcon = R.drawable.baseline_attach_money_24
    )
}
