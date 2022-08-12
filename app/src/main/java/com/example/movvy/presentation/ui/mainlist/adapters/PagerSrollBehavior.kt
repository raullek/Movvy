package com.example.movvy.presentation.ui.mainlist.adapters

import android.annotation.SuppressLint
import android.os.Handler
import androidx.viewpager2.widget.ViewPager2
import java.util.*

class PagerSrollBehavior(private val viewPager: ViewPager2) {

    private val handler = Handler()
    private var isTouched = false
    private var currentPage = 0


    @SuppressLint("ClickableViewAccessibility")
    fun initAutoScrollBehavior() {
        val update = Runnable {
            currentPage = viewPager.currentItem
            if (currentPage == viewPager.adapter?.itemCount) {
                currentPage = 0
            }
            viewPager.setCurrentItem(currentPage + 1, true)
        }

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                handler.removeCallbacks(update)
                handler.postDelayed(update, 3000)
            }
        })
    }
}