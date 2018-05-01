package com.thedeveloperworldisyours.touchlin.touch;

import android.graphics.PointF;

import com.thedeveloperworldisyours.touchlin.BaseView;

/**
 * Created by javiergonzalezcabezas on 28/4/18.
 */

public interface RePositionContract {

    interface Presenter {

        void load();

        void addPosition(int x, int y);

        void send();

        void finishActivity();

        void getScreen();
    }

    interface View extends BaseView<Presenter> {

        void setupView();

        void showAnnotation(int centerX, int screenWidth, int centerY, int screenHeight);

        void showFinalButton();

    }
}
