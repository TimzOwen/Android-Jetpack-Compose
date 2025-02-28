package com.timzowen.birthdayapp.affirmationsApp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.birthdayapp.R
import com.timzowen.birthdayapp.affirmationsApp.data.Affirmation
import com.timzowen.birthdayapp.affirmationsApp.data.DataSource

@Composable
fun AffirmationsApp() {
    val affirmations = DataSource().loadAffirmations()
    Column(modifier=Modifier
        .fillMaxSize()) {
       LazyColumn {
           items(affirmations){affirmation ->
               AffirmationCard(
                   affirmation = affirmation
               )
           }
       }
    }
}

@Composable
fun AffirmationCard(modifier: Modifier=Modifier, affirmation: Affirmation) {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        tonalElevation = 8.dp,
        shadowElevation = 4.dp,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column {
            Image(modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth(),
                painter = painterResource(id = affirmation.imageResourceId),
                contentScale = ContentScale.Crop,
                contentDescription = stringResource(id = affirmation.stringResourceId)
            )
            Text(
                text = LocalContext.current.getString(affirmation.stringResourceId),
                modifier = Modifier.padding(16.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AffirmationPreview() {
    AffirmationCard(
        affirmation = Affirmation(R.string.affirmation10, R.drawable.image10)
    )
}
