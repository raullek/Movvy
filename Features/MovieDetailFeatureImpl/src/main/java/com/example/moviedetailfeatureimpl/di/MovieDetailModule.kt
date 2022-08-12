package com.example.moviedetailfeatureimpl.di

import com.example.moviedetailfeatureapi.launcher.MovieDetailLauncher
import com.example.moviedetailfeatureimpl.launcher.MovieDetailLauncherImpl
import dagger.Module
import dagger.Provides

@Module
class MovieDetailModule {
    @Provides
    fun getMovieDetailLauncher(): MovieDetailLauncher = MovieDetailLauncherImpl()
}