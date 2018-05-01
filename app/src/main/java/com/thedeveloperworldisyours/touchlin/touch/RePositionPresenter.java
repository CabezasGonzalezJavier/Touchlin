package com.thedeveloperworldisyours.touchlin.touch;
import android.graphics.Point;
import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javiergonzalezcabezas on 28/4/18.
 */

public class RePositionPresenter implements RePositionContract.Presenter {

    private final static String TAG = RePositionPresenter.class.getName();
    private RePositionContract.View view;
    private AppCompatActivity activity;
    private List<String> itemList;
    private int position = 0;
    private int screenWidth;
    private int screenHeight;

    public RePositionPresenter(RePositionContract.View view, AppCompatActivity activity) {

        this.view = view;
        this.activity = activity;
        itemList = new ArrayList<>();
        this.view.setPresenter(this);
        getScreen();
    }

    @Override
    public void load() {

    }

    @Override
    public void addPosition(int x, int y) {

        view.showAnnotation(x, screenWidth, y, screenHeight);

    }

    @Override
    public void send() {

        finishActivity();
    }

    @Override
    public void finishActivity() {
        activity.finish();
    }

    @Override
    public void getScreen() {
        Display display = activity.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        screenWidth = size.x;
        screenHeight = size.y;
    }
}
