package com.timzowen.birthdayapp.woofApp

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.MarqueeSpacing
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
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
import kotlin.math.exp

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
    var isExpanded by remember { mutableStateOf(false) }
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(
            bottomStart = dimensionResource(R.dimen.padding_medium),
            topEnd = dimensionResource(R.dimen.padding_medium)
        )
    ) {
        Column {
            isExpanded = DogMainView(dog, modifier, isExpanded)
            if (isExpanded) {
                DogInfoHobby(
                    modifier = Modifier.padding(
                        start = dimensionResource(R.dimen.padding_medium),
                        end = dimensionResource(R.dimen.padding_medium),
                        bottom = dimensionResource(R.dimen.padding_medium),
                        top = dimensionResource(R.dimen.padding_small)
                    ),
                    dog.hobbies
                )
            }
        }
    }
}

@Composable
private fun DogMainView(
    dog: Dog,
    modifier: Modifier,
    isExpanded: Boolean
): Boolean {
    var isExpanded1 = isExpanded
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(dimensionResource(R.dimen.image_size))
                .clip(CircleShape)
        ) {
            Image(
                painter = (painterResource(id = dog.imageResourceId)),
                contentDescription = stringResource(dog.name),
                contentScale = ContentScale.Crop
            )
        }
        Column(
            modifier = modifier
                .padding(start = dimensionResource(R.dimen.padding_medium)),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(dog.name),
                style = MaterialTheme.typography.displayMedium
            )
            Text(
                text = "${dog.age} years old",
                style = MaterialTheme.typography.bodyLarge
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        DogIconButton(
            expanded = isExpanded1,
            onClick = { isExpanded1 = !isExpanded1 }
        )
    }
    return isExpanded1
}

@Composable
fun DogIconButton(
    modifier: Modifier = Modifier,
    expanded: Boolean,
    onClick: () -> Unit) {
    IconButton(
        onClick = onClick
    ) {
        Icon(
            imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            contentDescription = "drop down icon button",
            tint = MaterialTheme.colorScheme.secondary
        )
    }
}


@Composable
fun DogInfoHobby(
    modifier: Modifier = Modifier,
    @StringRes hobby: Int) {
    Column (modifier = modifier){
        Text(stringResource(R.string.about),
            style = MaterialTheme.typography.labelSmall)
        Text(
            stringResource(hobby),
            style = MaterialTheme.typography.bodyLarge)

    }
}

@Preview(showBackground = true)
@Composable
fun WooCArdPreview() {
    val dog = Dog(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1)
    AppTheme(darkTheme = false) {
        WoofAppCard(
            modifier = Modifier,
            dog)
    }
}

//@Preview(showBackground = true)
//@Composable
//fun WoofAppPreview() {
//    val dog = Dog(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1)
//    AppTheme(darkTheme = false) {
//        WoofApp(modifier = Modifier)
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun WoofAppDarkThemePreview() {
//    val dog = Dog(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1)
//    AppTheme(darkTheme = true) {
//        WoofApp()
//    }
//}

