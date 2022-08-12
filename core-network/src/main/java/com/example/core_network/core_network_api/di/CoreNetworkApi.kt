package com.example.core_network.core_network_api.di

import com.example.core_network.core_network_api.data.NetworkWrapper

interface CoreNetworkApi {
    fun networkWrapper(): NetworkWrapper
}