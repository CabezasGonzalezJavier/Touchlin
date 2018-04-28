package com.thedeveloperworldisyours.touchlin.touch;

import android.graphics.PointF;

import com.thedeveloperworldisyours.touchlin.BaseView;

/**
 * Created by javiergonzalezcabezas on 28/4/18.
 */

public interface RePositionContract {

    interface Presenter {

        void load();

        void showProducts(int position);

        void addPosition(int x, int y);

        PointF calculatePosition(int x, int y);

        void send();

        void finishActivity();
    }

    interface View extends BaseView<Presenter> {

        void setupView();

        void setProductTitle(String title);

        void showFinalButton();

    }
}
