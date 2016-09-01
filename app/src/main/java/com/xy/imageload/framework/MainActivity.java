package com.xy.imageload.framework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.xy.imageload.framework.fresco.FrescoActivity;
import com.xy.imageload.framework.glide.GlideActivity;
import com.xy.imageload.framework.picasso.PicassoActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.glide_btn) public void onGlideClick() {
        Intent intent1 = new Intent(MainActivity.this, GlideActivity.class);
        startActivity(intent1);
    }

    @OnClick(R.id.picasso_btn) public void onPicassoClick() {
        Intent intent2 = new Intent(MainActivity.this, PicassoActivity.class);
        startActivity(intent2);
    }

    @OnClick(R.id.fresco_btn) public void onFrescoClick() {
        Intent intent3 = new Intent(MainActivity.this, FrescoActivity.class);
        startActivity(intent3);
    }
}
