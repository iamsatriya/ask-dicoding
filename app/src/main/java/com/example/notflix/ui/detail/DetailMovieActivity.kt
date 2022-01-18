package com.example.notflix.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.notflix.R
import com.example.notflix.data.MovieEntity
import com.example.notflix.databinding.ActivityDetailMovieBinding
import com.example.notflix.databinding.ContentDetailMovieBinding

class DetailMovieActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    private lateinit var detailMovieBinding: ContentDetailMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDetailMovieBinding = ActivityDetailMovieBinding.inflate(layoutInflater)
        detailMovieBinding = activityDetailMovieBinding.detailContent
        setContentView(activityDetailMovieBinding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val movie = intent.getParcelableExtra<MovieEntity>(EXTRA_MOVIE) as MovieEntity

        detailMovieBinding.tvItemTitle.text = movie.title
        detailMovieBinding.tvItemOverview.text = movie.overview
        detailMovieBinding.tvItemYear.text = TextUtils.substring(movie.releaseDate, 0, 4)
        detailMovieBinding.tvItemVote.text = movie.vote.toString()
        detailMovieBinding.tvItemLang.text = movie.language
        Glide.with(this)
            .load(movie.poster)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
            .error(R.drawable.ic_error)
            .into(detailMovieBinding.imgPoster)
    }
}