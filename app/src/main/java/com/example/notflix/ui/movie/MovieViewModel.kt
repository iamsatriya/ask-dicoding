package com.example.notflix.ui.movie

import androidx.lifecycle.ViewModel
import com.example.notflix.data.MovieEntity
import com.example.notflix.utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMovies()
}