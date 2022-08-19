package com.example.moviedetailfeatureapi.di

import com.example.module_injector.BaseAPI
import com.example.moviedetailfeatureapi.launcher.MovieDetailLauncher

interface MovieDetailApi : BaseAPI {
    fun launcher(): MovieDetailLauncher
}