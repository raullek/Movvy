package com.example.moviedetailfeatureimpl.di

import android.util.Log
import com.example.module_injector.ComponentHolder
import com.example.moviedetailfeatureapi.di.MovieDetailApi

object MovieDetailComponentHolder : ComponentHolder<MovieDetailApi, MovieDetailDependencies> {
    private var movieDetailFeatureComponent: MovieDetailComponent? = null

    override fun init(dependencies: MovieDetailDependencies) {
        if (movieDetailFeatureComponent == null) {
            synchronized(MovieDetailComponentHolder::class.java) {
                if (movieDetailFeatureComponent == null) {
                    movieDetailFeatureComponent = MovieDetailComponent.initAndGet(dependencies)
                }
            }
        }

    }

    override fun get(): MovieDetailApi {
        return movieDetailFeatureComponent!!
    }

    override fun reset() {
        movieDetailFeatureComponent = null
    }
}