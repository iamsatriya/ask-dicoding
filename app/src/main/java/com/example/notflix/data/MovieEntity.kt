package com.example.notflix.data

class MovieEntity (
    var movieId: Long,
    var title: String,
    var overview: String,
    var poster: String,
    var vote: Double,
    var voteCount: Long,
    var adult: Boolean,
    var language: String,
    var releaseDate: String,
)