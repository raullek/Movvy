package com.example.movvy.di.module

import com.example.core_network.core_network_api.data.NetworkWrapper
import com.example.core_network.core_network_impl.di.CoreNetworkComponent
import com.example.moviedetailfeatureimpl.di.MovieDetailDependencies
import com.example.purchaselibapi.di.PurchaseApi
import com.example.purchaselibimpl.di.PurchaseComponentHolder
import com.example.purchaselibimpl.di.PurchaseDependencies
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FeatureModuleDependencies {
    @Singleton
    @Provides
    fun provideMovieDetailDependencies(purchaseApi: PurchaseApi): MovieDetailDependencies {
        return object : MovieDetailDependencies {
            override fun networkWrapper() = CoreNetworkComponent.get().getNetworkWrapper()
            override fun purchaseApi() = purchaseApi

        }
    }

    @Singleton
    @Provides
    fun providePurchaseDependencies(): PurchaseDependencies {
        return object : PurchaseDependencies {
            override fun networkWrapper(): NetworkWrapper {
                return CoreNetworkComponent.get().getNetworkWrapper()
            }
        }
    }

}