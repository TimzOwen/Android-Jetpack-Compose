package com.timzowen.movier1.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.compose.rememberAsyncImagePainter
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.timzowen.movier1.model.Movie
import com.timzowen.movier1.model.getMovies

@Preview(showBackground = true)
@Composable
fun MovieCard(movie: Movie = getMovies()[0], onMovieClicked: (String) -> Unit = {}) {

    var isExpanded by remember { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp)
            .clickable { onMovieClicked(movie.id) }
            .padding(6.dp),
        elevation = CardDefaults.cardElevation(5.dp),
        colors = CardDefaults.cardColors(Color.White),
        shape = RoundedCornerShape(4.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                modifier = Modifier
                    .size(100.dp)
                    .padding(12.dp)
                    .clip(RoundedCornerShape(5.dp))
            ) {
//                Image(
//                    painter = rememberAsyncImagePainter(
//                        model = movie.poster,
//                        contentScale = ContentScale.Crop
//                    ), contentDescription = "null"
//                )
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(movie.poster)
                        .crossfade(true)
                        .build(),
                    contentDescription = "movie poster",
                    contentScale = ContentScale.Crop
                )
            }
            Column {
                Text(text = movie.title)
                Text(
                    text = "Director: ${movie.director}",
                    style = MaterialTheme.typography.bodySmall
                )
                Text(text = "Year: ${movie.year}", style = MaterialTheme.typography.bodySmall)
                Text(text = "plot: ${movie.plot}", style = MaterialTheme.typography.labelSmall)

                if (isExpanded) {
                    HorizontalDivider(modifier = Modifier.padding(6.dp))
                    Text(
                        text = "Genre: ${movie.genre}",
                        style = MaterialTheme.typography.labelSmall
                    )
                    Text(
                        text = "Actors: ${movie.actors}",
                        style = MaterialTheme.typography.labelSmall
                    )
                    Text(
                        text = "Rating: ${movie.rating}",
                        style = MaterialTheme.typography.labelSmall
                    )
                }

                Icon(imageVector = if (!isExpanded) Icons.Default.KeyboardArrowDown else
                    Icons.Default.KeyboardArrowUp, contentDescription = "arrow down",
                    modifier = Modifier
                        .size(25.dp)
                        .clickable {
                            isExpanded = !isExpanded
                        })
            }
        }
    }
}
