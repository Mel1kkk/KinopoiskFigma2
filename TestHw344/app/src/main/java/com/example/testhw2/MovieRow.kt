package com.example.testhw2

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// отображение секции с заголовком и списком фильмов
@Composable
fun MovieRow(movies: List<Movie>) {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
    ) {
        items(movies) { movie ->
            MovieItem(movie = movie)
        }
        // кнопка "Показать все"
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                contentAlignment = Alignment.Center
            ) {
                ShowAllButton()
            }
        }
    }
}