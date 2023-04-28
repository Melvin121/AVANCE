package com.example.labo06.ui.movies

import android.app.Application
import com.example.labo06.data.model.movies
import com.example.labo06.repositories.MovieRepository

class MovieReviewerApplication : Application(){
    val movieRepository: MovieRepository by lazy{
        MovieRepository(movies)
    }
}