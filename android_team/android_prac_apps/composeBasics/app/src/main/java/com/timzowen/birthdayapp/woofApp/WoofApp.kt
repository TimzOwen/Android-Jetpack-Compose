package com.timzowen.birthdayapp.woofApp

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun WoofApp() {
    Scaffold(
        topBar = {
            WoofTopAppBar()
        }
    ) { contentPadding ->
        LazyColumn(contentPadding = contentPadding) {
            items(dogs) {
                DogItem(
                    dog = it,
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
       title = {
           Row(verticalAlignment = Alignment.CenterVertically) {
               Image(
                   modifier = modifier
                       .size(dimensionResource(R.dimen.image_size))
                       .padding(dimensionResource(R.dimen.padding_small)),
                   painter = painterResource(R.drawable.ic_woof_logo),
                   contentDescription = "woof logo"
               )
               Text(
                   text = stringResource(R.string.woof_app),
                   style = MaterialTheme.typography.displayLarge)
           }
       },
       modifier=modifier
   )
}

@Composable
fun DogItem(dog: Dog, modifier: Modifier = Modifier) {

    var expanded by remember { mutableStateOf(false) }

    Card (modifier=modifier ,
        shape = RoundedCornerShape(bottomStart = dimensionResource(R.dimen.padding_small),
            topEnd = dimensionResource(R.dimen.padding_medium)
        )
    ){
        Column {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(R.dimen.padding_small))
            ) {
                DogIcon(dog.imageResourceId)
                DogInformation(dog.name, dog.age)
                Spacer(modifier = Modifier.weight(1f))
                DogIconButton(
                    expanded = expanded,
                    onClick = {
                        expanded = !expanded
                    }
                )

            }
            if (expanded){
                DogHobby(
                    modifier=Modifier
                        .padding(top = 8.dp , bottom = 16.dp, start = 16.dp),
                    dog.hobbies)
            }
        }
    }
}

@Composable
fun DogIconButton(modifier: Modifier = Modifier,
                  onClick: () -> Unit,
                  expanded: Boolean) {
    IconButton (
        onClick = onClick,
        modifier = modifier)
    {
        Icon(
            imageVector = if (expanded)Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            contentDescription = stringResource(R.string.expand_button_content_description),
            tint = MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
fun DogHobby(modifier: Modifier = Modifier, dogHobby: Int) {
    Column(modifier=modifier) {
        Text(
            text = stringResource(R.string.about),
            style = MaterialTheme.typography.labelSmall)
        Text(
            text = stringResource(dogHobby),
            style = MaterialTheme.typography.bodyLarge)
    }
}

@Composable
fun DogIcon(
    @DrawableRes dogIcon: Int,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .size(dimensionResource(R.dimen.image_size))
            .padding(dimensionResource(R.dimen.padding_small))
            .clip(CircleShape),
        painter = painterResource(dogIcon),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}


@Composable
fun DogInformation(
    @StringRes dogName: Int,
    dogAge: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(dogName),
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
        )
        Text(
            text = stringResource(R.string.years_old, dogAge),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}


//@Preview(showBackground = true)
//@Composable
//fun WoofPreviewDarkMode() {
//    AppTheme (darkTheme = false) {
//        val dog =  Dog(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1)
//        DogItem(dog)
//    }
//}


@Preview(showBackground = true)
@Composable
fun WoofPreview() {
    AppTheme (darkTheme = false) {
        WoofApp()
    }
}
