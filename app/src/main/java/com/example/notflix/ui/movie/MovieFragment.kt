package com.example.notflix.ui.movie

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notflix.R
import com.example.notflix.databinding.MovieFragmentBinding

class MovieFragment : Fragment() {

    private lateinit var viewModel: MovieViewModel
    private lateinit var fragmentMovieBinding: MovieFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentMovieBinding = MovieFragmentBinding.inflate(inflater, container, false)
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MovieViewModel::class.java]
        val movies = viewModel.getMovies()
        val movieAdapter = MovieAdapter()
        movieAdapter.setMovies(movies)
        with(fragmentMovieBinding.rvMovieList) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = movieAdapter
        }
    }

}