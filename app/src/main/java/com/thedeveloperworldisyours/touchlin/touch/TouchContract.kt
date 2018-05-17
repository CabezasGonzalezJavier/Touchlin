package com.thedeveloperworldisyours.touchlin.touch

import com.thedeveloperworldisyours.touchlin.BaseView

/**
 * Created by javiergonzalezcabezas on 17/5/18.
 */
interface TouchContract {

    interface Presenter {

        fun load()

        fun addPosition(x: Int, y: Int)

        fun send()

        fun finishActivity()

        fun getScreen()
    }

    interface View : BaseView<Presenter> {

        fun setupView()

        fun showAnnotation(centerX: Int, screenWidth: Int, centerY: Int, screenHeight: Int)

        fun showFinalButton()

    }

}