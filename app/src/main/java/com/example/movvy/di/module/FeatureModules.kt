package com.example.movvy.di.module

import com.example.moviedetailfeatureapi.di.MovieDetailApi
import com.example.moviedetailfeatureimpl.di.MovieDetailComponentHolder
import com.example.moviedetailfeatureimpl.di.MovieDetailDependencies
import com.example.purchaselibapi.di.PurchaseApi
import com.example.purchaselibimpl.di.PurchaseComponentHolder
import com.example.purchaselibimpl.di.PurchaseDependencies
import dagger.Module
import dagger.Provides

@Module
class FeatureModules {

    @Provides
    fun provideMovieDetailFeature(dependencies: MovieDetailDependencies): MovieDetailApi {
        MovieDetailComponentHolder.init(dependencies)
        return MovieDetailComponentHolder.get()
    }

    @Provides
    fun providePurchaseApi(dependencies: PurchaseDependencies): PurchaseApi {
        PurchaseComponentHolder.init(dependencies)
        return PurchaseComponentHolder.get()
    }
}