package com.example.moviedetailfeatureimpl.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviedetailfeatureimpl.R

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_detail)
    }

    companion object {
        fun newInstance(context: Context) =
            Intent(context, MovieDetailActivity::class.java)
    }
}