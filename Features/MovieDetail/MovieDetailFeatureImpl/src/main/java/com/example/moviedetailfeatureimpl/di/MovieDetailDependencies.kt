package com.example.moviedetailfeatureimpl.di

import com.example.core_network.core_network_api.data.NetworkWrapper
import com.example.module_injector.BaseDependencies
import com.example.purchaselibapi.di.PurchaseApi
import com.example.purchaselibapi.launcher.PurchaseLauncher

interface MovieDetailDependencies : BaseDependencies {
    fun networkWrapper(): NetworkWrapper
    fun purchaseApi(): PurchaseApi
}