package com.example.testhw2

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    LazyColumn(modifier = Modifier
        .padding(horizontal = 20.dp)

    ) {
        item {
            SkillCinemaText()
        }

        // Отображаем секции с фильмами
        item {
            MovieSection(title = "Премьеры", movies = premieres)
            Spacer(modifier = Modifier.height(16.dp))
        }
        item {
            MovieSection(title = "Популярное", movies = popularity)
            Spacer(modifier = Modifier.height(16.dp))
        }
        item {
            MovieSection(title = "Боевики США", movies = usa)
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            MovieSection(title = "Топ-250", movies = top250)
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            MovieSection(title = "Драмы Франции", movies = dramaFrance)
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            MovieSection(title = "Сериалы", movies = serials)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}