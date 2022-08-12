package com.example.movvy.di.module

import com.example.moviedetailfeatureapi.di.MovieDetailApi
import com.example.moviedetailfeatureimpl.di.MovieDetailComponentHolder
import com.example.moviedetailfeatureimpl.di.MovieDetailDependencies
import dagger.Module
import dagger.Provides

@Module
class FeatureModules {

    @Provides
    fun provideMovieDetailFeature(dependencies: MovieDetailDependencies): MovieDetailApi {
        MovieDetailComponentHolder.init(dependencies)
        return MovieDetailComponentHolder.get()
    }
}