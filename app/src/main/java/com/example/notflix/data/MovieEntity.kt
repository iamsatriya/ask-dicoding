package com.example.notflix.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
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
) : Parcelable