package com.example.movvy.di.module

import com.example.core_network.core_network_api.data.NetworkWrapper
import com.example.core_network.core_network_api.di.CoreNetworkApi
import com.example.core_network.core_network_impl.di.CoreNetworkComponent
import com.example.moviedetailfeatureimpl.di.MovieDetailDependencies
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FeatureModuleDependencies {
    @Singleton
    @Provides
    fun provideMovieDetailDependencies(): MovieDetailDependencies {
        return object : MovieDetailDependencies {
            override fun getRetrofit(): NetworkWrapper {
                return CoreNetworkComponent.get().networkWrapper()
            }

        }
    }

}