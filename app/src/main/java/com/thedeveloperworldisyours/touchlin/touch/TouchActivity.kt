package com.thedeveloperworldisyours.touchlin.touch

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.thedeveloperworldisyours.touchlin.R
import com.thedeveloperworldisyours.touchlin.Utils.addFragmentToActivity

/**
 * Created by javiergonzalezcabezas on 13/5/18.
 */
class TouchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.touch_activity)
        initFragment()
    }

    private fun initFragment() {

        var rePositionFragment: RePositionFragment = supportFragmentManager
                .findFragmentById(R.id.touch_activity_container) as RePositionFragment
        if (rePositionFragment == null) {
            rePositionFragment = rePositionFragment
            addFragmentToActivity(supportFragmentManager, rePositionFragment, R.id.touch_activity_container)
        }
        RePositionPresenter(rePositionFragment, this)
    }
}