package com.example.moviedetailfeatureimpl.launcher

import android.content.Context
import com.example.core.di.general.PerFeature
import com.example.moviedetailfeatureapi.launcher.MovieDetailLauncher
import com.example.moviedetailfeatureimpl.presentation.MovieDetailActivity
import javax.inject.Inject

@PerFeature
class MovieDetailLauncherImpl @Inject constructor() : MovieDetailLauncher {
    override fun launch(context: Context) {
        context.startActivity(
            MovieDetailActivity.newInstance(context)
        )
    }
}