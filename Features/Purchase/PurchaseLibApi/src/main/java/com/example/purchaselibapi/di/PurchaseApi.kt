package com.example.purchaselibapi.di

import com.example.module_injector.BaseAPI
import com.example.purchaselibapi.launcher.PurchaseLauncher

interface PurchaseApi : BaseAPI {
    fun launcher(): PurchaseLauncher
}