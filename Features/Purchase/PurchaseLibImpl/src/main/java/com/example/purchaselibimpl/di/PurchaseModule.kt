package com.example.purchaselibimpl.di

import com.example.core.di.general.PerFeature
import com.example.purchaselibapi.launcher.PurchaseLauncher
import com.example.purchaselibimpl.launcher.PurchaseLauncherImpl
import dagger.Module
import dagger.Provides

@Module
class PurchaseModule {
    @Provides
    fun getMovieDetailLauncher(): PurchaseLauncher = PurchaseLauncherImpl()
}