package com.example.moviedetailfeatureimpl.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.moviedetailfeatureimpl.R
import com.example.moviedetailfeatureimpl.di.MovieDetailComponentHolder
import com.example.purchaselibapi.di.PurchaseApi
import javax.inject.Inject

class MovieDetailActivity : AppCompatActivity() {
    @Inject
    lateinit var purchaseApi: PurchaseApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_detail)
        MovieDetailComponentHolder.get().inject(this)

        findViewById<TextView>(R.id.helloClick).setOnClickListener {
            purchaseApi
                .launcher()
                .launch(this)
        }
    }

    companion object {
        fun newInstance(context: Context) =
            Intent(context, MovieDetailActivity::class.java)
    }
}