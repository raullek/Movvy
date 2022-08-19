package com.example.purchaselibimpl

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PurchaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchase)
    }

    companion object {
        fun newInstance(context: Context) =
            Intent(context, PurchaseActivity::class.java)
    }
}