package com.example.core_network.core_network_impl.di

import com.example.core_network.core_network_api.data.NetworkWrapper
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Inject

class NetworkWrapperImpl @Inject constructor(
    private val okHttpClient: OkHttpClient,
    private val retrofit: Retrofit
) : NetworkWrapper {
    override fun getHttpClient(): OkHttpClient {
        return okHttpClient
    }

    override fun getRetrofit(): Retrofit {
        return retrofit
    }
}