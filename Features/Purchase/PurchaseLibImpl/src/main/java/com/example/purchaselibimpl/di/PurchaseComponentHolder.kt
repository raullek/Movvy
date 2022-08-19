package com.example.purchaselibimpl.di

import com.example.module_injector.ComponentHolder
import com.example.purchaselibapi.di.PurchaseApi

object PurchaseComponentHolder : ComponentHolder<PurchaseApi, PurchaseDependencies> {
    private var movieDetailFeatureComponent: PurchaseComponent? = null

    override fun init(dependencies: PurchaseDependencies) {
        if (movieDetailFeatureComponent == null) {
            synchronized(PurchaseComponentHolder::class.java) {
                if (movieDetailFeatureComponent == null) {
                    movieDetailFeatureComponent = PurchaseComponent.initAndGet(dependencies)
                }
            }
        }

    }

    override fun get(): PurchaseApi {
        return movieDetailFeatureComponent!!
    }

    override fun reset() {
        movieDetailFeatureComponent = null
    }
}