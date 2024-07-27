package com.timzowen.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
                    ArticleImage(
                        articleTitle = stringResource(R.string.article_title),
                        articleDescription = stringResource(R.string.article_description),
                        articleContents = stringResource(R.string.article_contents))
                }
            }
        }
    }
}

@Composable
fun ComposeArticle(articleTitle: String, articleDescription: String,
                    articleContents: String) {
    Text(
        text = articleTitle,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp))
    Text(
        text = articleDescription,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
    Text(
        text = articleContents,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(16.dp))

}

@Composable
fun ArticleImage(articleTitle: String, articleDescription: String,
                 articleContents: String){
    val articleImageResource = painterResource(id = R.drawable.bg_compose_background)
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter =articleImageResource,
            contentDescription = null,
            modifier=Modifier.fillMaxWidth())

        ComposeArticle(
            articleTitle = articleTitle,
            articleDescription = articleDescription,
            articleContents = articleContents )
    }

}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeArticleTheme {
        ArticleImage(
            "Jetpack Compose tutorial",
            "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
        )
    }
}