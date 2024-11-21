package com.timzowen.movieapp.screens.home

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.timzowen.movieapp.model.Movie
import com.timzowen.movieapp.model.getMovies
import com.timzowen.movieapp.navigation.MovieScreens
import com.timzowen.movieapp.widgets.MovieCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.shadow(elevation = 5.dp),
                colors = topAppBarColors(
                    containerColor = Color.Magenta,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = { Text(text = "Movies") })
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            MainContent(navController = navController)
        }
    }
}


@Composable
fun MainContent(
    navController: NavController,
    moviesList: List<Movie> = getMovies()
) {
    Column(modifier = Modifier.padding(16.dp)) {
        LazyColumn {
            items(items = moviesList) {
                MovieCard(movie = it) { movie ->
                    navController.navigate(route = MovieScreens.DetailsScreen.name +"/$movie")
                }
            }
        }
    }
}


