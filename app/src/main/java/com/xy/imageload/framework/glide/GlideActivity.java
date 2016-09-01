package com.xy.imageload.framework.glide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.xy.imageload.framework.MainActivity;
import com.xy.imageload.framework.R;
import com.xy.imageload.framework.utils.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * Created by xingyun on 2016/9/1.
 */
public class GlideActivity extends AppCompatActivity {
    @BindView(R.id.iv_glide_gift) ImageView glideGiftIv;
    @BindView(R.id.iv_glide_gif_gift) ImageView glideGifGiftIv;
    @BindView(R.id.iv_glide_transform_gift) ImageView glideTransformGiftIv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glide_activity);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.glide_gift_btn) public void onGlideGiftOnClick() {
        Glide.with(this)
                .load(Constants.IMAGE_URL)
                .placeholder(R.mipmap.loading)
                .error(R.mipmap.ic_launcher)
                .centerCrop()
                .skipMemoryCache(true)
                .into(glideGiftIv);
    }

    // 加载gif图片
    @OnClick(R.id.glide_gif_gift_btn) public void onGlideGifGiftOnClick() {
        Glide.with(this)
                .load(Constants.GIF_IMAGE_URL)
                .asGif()
                .placeholder(R.mipmap.loading)
//                .fitCenter()
                .into(glideGifGiftIv);
    }

    @OnClick(R.id.glide_transform_gift_btn) public void onGlideTransformGiftOnClick() {
        Glide.with(this)
                .load(Constants.IMAGE_URL)
                .placeholder(R.mipmap.loading)
                .error(R.mipmap.ic_launcher)
                .fitCenter()
                // 毛玻璃效果
//                .bitmapTransform(new BlurTransformation(GlideActivity.this))
//                .bitmapTransform(new BlurTransformation(GlideActivity.this, 20))
                // 复合转换器
                .bitmapTransform(new BlurTransformation(GlideActivity.this, 20), new CropCircleTransformation(GlideActivity.this))
                .into(glideTransformGiftIv);
    }
}
