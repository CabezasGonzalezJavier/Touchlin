package com.thedeveloperworldisyours.touchlin.touch

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import com.thedeveloperworldisyours.touchlin.R

/**
 * Created by javiergonzalezcabezas on 14/5/18.
 */
class TouchFragment : Fragment() {
    companion object {
        fun newInstance() =TouchFragment().apply {}
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.touch_fragment, container, false)
        ButterKnife.bind(this, view)
        //setupView()
        return view
    }
}