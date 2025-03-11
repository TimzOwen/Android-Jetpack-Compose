package com.timzowen.birthdayapp.woofApp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.birthdayapp.R
import com.timzowen.birthdayapp.ui.theme.AppTheme
import com.timzowen.birthdayapp.woofApp.dog.Dog
import com.timzowen.birthdayapp.woofApp.dog.dogs

@Composable
fun WoofApp(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
                WoofTopAppBar()
        }
    ) {
        LazyColumn(contentPadding = it) {
            items(dogs) { dog ->
                WoofAppCard(
                    dog = dog,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WoofTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        modifier = modifier,
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    modifier = Modifier
                        .size(dimensionResource(R.dimen.image_size))
                        .padding(dimensionResource(R.dimen.padding_small)),
                    painter = (painterResource(R.drawable.ic_woof_logo)),
                    contentDescription = stringResource(R.string.woof_app)
                )
                Text(
                    text = stringResource(R.string.woof_app),
                    style = MaterialTheme.typography.displayLarge)
            }
        }
    )
}

@Composable
fun WoofAppCard(modifier: Modifier = Modifier, dog: Dog) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(
            bottomStart = dimensionResource(R.dimen.padding_medium),
            topEnd = dimensionResource(R.dimen.padding_medium)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(dimensionResource(R.dimen.image_size))
                    .clip(androidx.compose.foundation.shape.CircleShape)
            ) {
                Image(
                    painter = (painterResource(id = dog.imageResourceId)),
                    contentDescription = stringResource(dog.name),
                    contentScale = ContentScale.Crop
                )
            }
            Column(
                modifier = modifier,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(dog.name),
                    style = MaterialTheme.typography.displayMedium
                )
                Text(
                    text = "${dog.age} years old" ,
                    style = MaterialTheme.typography.bodyLarge)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun WoofAppDarkThemePreview() {
    val dog = Dog(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1)
    AppTheme(darkTheme = true) {
        WoofApp()
    }
}

@Preview(showBackground = true)
@Composable
fun WoofAppPreview() {
    val dog = Dog(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1)
    AppTheme(darkTheme = false) {
        WoofApp(modifier = Modifier)
    }
}