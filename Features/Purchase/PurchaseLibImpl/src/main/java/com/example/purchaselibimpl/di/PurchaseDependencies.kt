package com.example.purchaselibimpl.di

import com.example.core_network.core_network_api.data.NetworkWrapper
import com.example.module_injector.BaseDependencies

interface PurchaseDependencies : BaseDependencies {
    fun networkWrapper(): NetworkWrapper
}