package com.example.moviedetailfeatureimpl.di

import com.example.core_network.core_network_api.data.NetworkWrapper
import com.example.module_injector.BaseDependencies

interface MovieDetailDependencies : BaseDependencies {
    fun getRetrofit(): NetworkWrapper
}