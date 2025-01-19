package com.timzowen.birthdayapp.composeArticle

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.birthdayapp.R

@Composable
fun ArticleApp(){
    Column(modifier = Modifier
        .fillMaxSize()
        .systemBarsPadding()) {
        Image(painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = "compose Article" )
        ArticleText()

    }
}

@Composable
fun ArticleText(){
    Column {
        Text(
            text = stringResource(R.string.jetpack_compose_tutorial),
            style = TextStyle(
                fontSize = 24.sp,
            ),
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(id = R.string.article_description),
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp))

        Text(text = stringResource(id = R.string.article_content),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp))
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true, name = "Quadrant")
fun QuadrantPreview(){
    ArticleApp()
}
