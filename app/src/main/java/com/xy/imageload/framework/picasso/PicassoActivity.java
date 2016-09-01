package com.xy.imageload.framework.picasso;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xy.imageload.framework.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by xingyun on 2016/9/1.
 */
public class PicassoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picasso_activity);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.picasso_test_btn) public void onPicassoOnClick() {
        Intent intent = new Intent(PicassoActivity.this, SampleGridViewActivity.class);
        PicassoActivity.this.startActivity(intent);
    }
}
