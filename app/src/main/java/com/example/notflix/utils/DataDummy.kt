package com.example.notflix.utils

import com.example.notflix.data.MovieEntity

object DataDummy {
    fun generateDummyMovies(): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        movieList.add(
            MovieEntity(
                1,
                "Warkop DIY",
                "Film Legend",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                7.5,
                1220,
                true,
                "id",
                "2021-12-18"
            )
        )
        movieList.add(
            MovieEntity(
                2,
                "Sapiderman",
                "Film tentang sapiderman",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                8.5,
                6720,
                true,
                "en",
                "2021-12-18"
            )
        )
        movieList.add(
            MovieEntity(
                3,
                "KKN kelurahan penari",
                "Film kelurahan penari",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                7.8,
                4220,
                true,
                "id",
                "2021-12-18"
            )
        )
        movieList.add(
            MovieEntity(
                4,
                "Titanus",
                "Film tentang kapal yang karam",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                8.4,
                9920,
                true,
                "en",
                "2021-12-18"
            )
        )
        movieList.add(
            MovieEntity(
                5,
                "Money Heisehh",
                "Film tentang maling uang",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                8.4,
                9920,
                true,
                "pt",
                "2021-12-18"
            )
        )
        return movieList
    }
}