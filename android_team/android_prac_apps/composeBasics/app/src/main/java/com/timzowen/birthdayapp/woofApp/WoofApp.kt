package com.timzowen.birthdayapp.woofApp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import com.timzowen.birthdayapp.woofApp.dog.Dog
import com.timzowen.birthdayapp.woofApp.dog.dogs

@Composable
fun WoofApp(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize()) {
        LazyColumn {
            items(dogs){ dog ->
                WoofAppCard(modifier,dog)
            }
        }
    }
}

@Composable
fun WoofAppCard(modifier: Modifier = Modifier, dog: Dog) {
    Surface(
        modifier.padding(dimensionResource(R.dimen.padding_small))) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(4.dp),
            verticalAlignment = Alignment.CenterVertically) {
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
            Column(modifier = Modifier
                .padding(start = 8.dp)
                .fillMaxSize(),
                verticalArrangement = Arrangement.Center) {
                Text(text = stringResource(dog.name))
                Text("${dog.age} years old" )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun WoofAppPreview() {
    val dog = Dog(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1)
    WoofApp(modifier = Modifier)
}