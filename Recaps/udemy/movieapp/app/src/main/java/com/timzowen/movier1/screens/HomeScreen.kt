package com.timzowen.movier1.screens

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.timzowen.movier1.model.getMovies
import com.timzowen.movier1.navigation.MovieScreens
import com.timzowen.movier1.widget.MovieCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieApp(navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text(text = "Movies") },
                colors = TopAppBarDefaults.topAppBarColors(Color.White)
            )
        }) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            LazyColumn {
                items(items = getMovies()) { movies ->
                    MovieCard(movie = movies) { movie ->
                        navController.navigate(route = MovieScreens.DetailsScreen.name)
                    }
                }
            }
        }
    }
}
