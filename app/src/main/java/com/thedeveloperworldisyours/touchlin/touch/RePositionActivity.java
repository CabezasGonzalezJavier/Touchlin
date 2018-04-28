package com.thedeveloperworldisyours.touchlin.touch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.thedeveloperworldisyours.touchlin.R;

import butterknife.ButterKnife;

import static com.thedeveloperworldisyours.touchlin.Utils.addFragmentToActivity;

/**
 * Created by javiergonzalezcabezas on 28/4/18.
 */

public class RePositionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fc_re_position_activity);
        ButterKnife.bind(this);

        initFragment();
    }

    private void initFragment() {

        RePositionFragment rePositionFragment = (RePositionFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fc_re_position_activity_container);
        if (rePositionFragment == null) {
            rePositionFragment = rePositionFragment.newInstance();
            addFragmentToActivity(getSupportFragmentManager(), rePositionFragment, R.id.fc_re_position_activity_container);
        }
        new RePositionPresenter(rePositionFragment, this);
    }
}
