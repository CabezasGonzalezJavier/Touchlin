package com.thedeveloperworldisyours.touchlin.touch;
import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by javiergonzalezcabezas on 28/4/18.
 */

public class RePositionPresenter implements RePositionContract.Presenter {

    private final static String TAG = RePositionPresenter.class.getName();
    private RePositionContract.View view;
    private AppCompatActivity activity;
    private ProductInfo currentProduct;
    private List<InventoryItem> inventoryItems;
    private List<ProductInfo> itemList;
    private int position = 0;

    public RePositionPresenter(RePositionContract.View view, AppCompatActivity activity) {

        this.view = view;
        this.activity = activity;
        itemList = new ArrayList<>();
        this.view.setPresenter(this);
    }

    @Override
    public void load() {

    }

    @Override
    public void showProducts(int position) {

        if (inventoryItems.size() > position) {

            currentProduct = new ProductInfo(fridgeId, inventoryItems.get(0).getBarcode(), inventoryItems.get(0).getImageUrl(), inventoryItems.get(0).getDisplayName(), inventoryItems.get(0).getGuid());
            view.setProductTitle(inventoryItems.get(0).getDisplayName());
        }
    }

    @Override
    public void addPosition(int x, int y) {

        currentProduct.setLastFoundPosition(calculatePosition(x, y));
        itemList.add(currentProduct);
        position = position + 1;
        showProducts(position);

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
    public PointF calculatePosition(int x, int y) {

        int leftPos = x - 50;
        int topPos = y - 50;
        int width = 100;
        int height = 100;
        return new PointF((float) (leftPos + (width / 2)) / screenWidth, (float) (topPos + (height / 2)) / screenHeight);
    }
}
