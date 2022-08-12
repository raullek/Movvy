package com.example.core_network.core_network_api.data

import okhttp3.OkHttpClient
import retrofit2.Retrofit

interface NetworkWrapper {
    fun getHttpClient(): OkHttpClient
    fun getRetrofit(): Retrofit
}