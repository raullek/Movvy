package com.example.purchaselibimpl.di

import com.example.core.di.general.PerFeature
import com.example.purchaselibapi.di.PurchaseApi
import dagger.Component

@Component(dependencies = [PurchaseDependencies::class], modules = [PurchaseModule::class])
@PerFeature
abstract class PurchaseComponent : PurchaseApi {

    companion object {
        fun initAndGet(purchaseFeatureDependencies: PurchaseDependencies): PurchaseComponent {
            return DaggerPurchaseComponent.builder()
                .purchaseDependencies(purchaseFeatureDependencies)
                .build()
        }
    }
}