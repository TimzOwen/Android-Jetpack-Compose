package com.timzowen.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.collection.emptyLongSet
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.composearticle.ui.theme.ComposeArticleTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ArticleApp()
                }
            }
        }
    }
}

@Composable
fun ArticleApp(){
    ComposeArticle(
        articleTitle = stringResource(R.string.article_title),
        articleDescription = stringResource(R.string.article_description),
        articleContents = stringResource(R.string.article_contents))
}

@Composable
fun ComposeArticle(articleTitle: String, articleDescription: String,
                    articleContents: String) {
    val articleImageResource = painterResource(id = R.drawable.bg_compose_background)
    Column(modifier = Modifier.fillMaxSize()) {
     Image
        Text(
            text = articleTitle,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = articleDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = articleContents,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

data class MenuItem(
    @DrawableRes val icon: Int,
    @StringRes val label: Int,
    val isComingSoon: Boolean
)


@Composable
fun ContactCenter(userName: String, userPhone: Int, userAmount: Double, isRegistered: Boolean){
    val selectOption = 4

    var counter = when(selectOption){
        1 -> {
            MenuItem(
                R.drawable.bg_compose_background,
                R.string.article_title,
                true
                )
        }
        2 -> {
            MenuItem(
                R.drawable.ic_launcher_foreground,
                R.string.app_name,
                false
            )
        }
        else -> {
            MenuItem(
                R.drawable.ic_launcher_foreground,
                R.string.article_title,
                false
            )
        }
    }

}


@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeArticleTheme {
        ArticleApp()
    }
}