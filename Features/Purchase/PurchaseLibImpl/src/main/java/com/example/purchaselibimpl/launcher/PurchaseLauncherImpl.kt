package com.example.purchaselibimpl.launcher

import android.content.Context
import com.example.core.di.general.PerFeature
import com.example.purchaselibapi.launcher.PurchaseLauncher
import com.example.purchaselibimpl.PurchaseActivity
import javax.inject.Inject

@PerFeature
class PurchaseLauncherImpl @Inject constructor() : PurchaseLauncher {
    override fun launch(context: Context) {
        context.startActivity(
            PurchaseActivity.newInstance(context)
        )
    }
}