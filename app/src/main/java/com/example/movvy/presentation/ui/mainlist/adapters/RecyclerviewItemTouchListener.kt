package com.example.movvy.presentation.ui.mainlist.adapters

import android.view.MotionEvent
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewItemTouchListener(onTouchedItem: () -> Unit) : RecyclerView.OnItemTouchListener {

    override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
        TODO("Not yet implemented")
    }

    override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {
        TODO("Not yet implemented")
    }

    override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {
        TODO("Not yet implemented")
    }
}