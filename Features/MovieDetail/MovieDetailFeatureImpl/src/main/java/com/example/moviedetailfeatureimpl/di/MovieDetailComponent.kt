package com.example.moviedetailfeatureimpl.di

import com.example.core.di.general.PerFeature
import com.example.moviedetailfeatureapi.di.MovieDetailApi
import com.example.moviedetailfeatureimpl.presentation.MovieDetailActivity
import dagger.Component

@Component(dependencies = [MovieDetailDependencies::class], modules = [MovieDetailModule::class])
@PerFeature
abstract class MovieDetailComponent : MovieDetailApi {
    internal abstract fun inject(activity: MovieDetailActivity)

    companion object {
        fun initAndGet(purchaseFeatureDependencies: MovieDetailDependencies): MovieDetailComponent {
            return DaggerMovieDetailComponent.builder()
                .movieDetailDependencies(purchaseFeatureDependencies)
                .build()
        }
    }
}