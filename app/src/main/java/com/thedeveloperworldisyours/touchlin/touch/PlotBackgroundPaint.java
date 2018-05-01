package com.thedeveloperworldisyours.touchlin.touch;

import android.content.Context;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;

import com.thedeveloperworldisyours.touchlin.R;

/**
 * Created by javiergonzalezcabezas on 1/5/18.
 */

public class PlotBackgroundPaint extends Paint {

    private static final int ALPHA = 216; // ~85%

    PlotBackgroundPaint(Context context) {
        super();
        setColor(ContextCompat.getColor(context, R.color.colorAnnotation));
        setAlpha(ALPHA);
        setAntiAlias(true);
    }
}
