package com.example.moviedetailfeatureimpl.di

import com.example.moviedetailfeatureapi.di.MovieDetailApi
import dagger.Component

@Component(dependencies = [MovieDetailDependencies::class], modules = [MovieDetailModule::class])
abstract class MovieDetailComponent : MovieDetailApi {

    companion object {
        fun initAndGet(purchaseFeatureDependencies: MovieDetailDependencies): MovieDetailComponent {
            return DaggerMovieDetailComponent.builder()
                .movieDetailDependencies(purchaseFeatureDependencies)
                .build()
        }
    }
}