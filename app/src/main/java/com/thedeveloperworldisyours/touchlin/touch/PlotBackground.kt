package com.thedeveloperworldisyours.touchlin.touch

import android.content.Context
import android.graphics.Paint
import android.support.v4.content.ContextCompat
import com.thedeveloperworldisyours.touchlin.R

/**
 * Created by javiergonzalezcabezas on 12/5/18.
 */
internal class PlotBackground(context: Context) : Paint() {

    init {
        color = ContextCompat.getColor(context, R.color.colorAnnotation)
        alpha = ALPHA
        isAntiAlias = true
    }

    companion object {

        private val ALPHA = 216 // ~85%
    }
}