package com.thedeveloperworldisyours.touchlin.touch;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import com.thedeveloperworldisyours.touchlin.R;
/**
 * Created by javiergonzalezcabezas on 28/4/18.
 */

public class RePositionFragment extends Fragment implements RePositionContract.View {

    @BindView(R.id.fc_re_position_constraintLayout)
    ConstraintLayout constraintLayout;

    @BindView(R.id.fc_re_position_imageView)
    ImageView fridgeImagePreview;

    @BindView(R.id.fc_re_position_textView)
    TextView textView;

    @BindView(R.id.fc_re_position_button)
    Button button;

    RePositionContract.Presenter presenter;

    public static RePositionFragment newInstance() {
        RePositionFragment rePositionFragment = new RePositionFragment();
        Bundle args = new Bundle();

        rePositionFragment.setArguments(args);
        return rePositionFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fc_re_position_fragment, container, false);
        ButterKnife.bind(this, view);
        setupView();
        return view;
    }

    @Override
    public void setPresenter(RePositionContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setupView() {
        presenter.load();
        fridgeImagePreview.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_UP:

                        presenter.addPosition((int) event.getX(), (int) event.getY());
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public void setProductTitle(String title) {
        textView.setText(title);
    }

    @Override
    public void showFinalButton() {
        button.setVisibility(View.VISIBLE);

    }

    @OnClick(R.id.fc_re_position_button)
    public void sendPositions() {
        presenter.send();
    }

}
