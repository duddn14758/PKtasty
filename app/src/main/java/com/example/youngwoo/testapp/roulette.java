package com.example.youngwoo.testapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class roulette extends AppCompatActivity {

    private ImageView wheel;

    private Bitmap mBitMap;
    private float init_angle = 0.0f;
    private final int IMG_DP = 300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roulette);

        wheel = (ImageView) findViewById(R.id.wheel);
        mBitMap = BitmapFactory.decodeResource(getResources(), R.drawable.rou);
        wheel.setImageBitmap(onResizeImage(mBitMap));

        ImageButton btn = (ImageButton) findViewById(R.id.rotate_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onWheelImage();
            }
        });
    }


    public static float convertDpToPixel(float dp, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float px = dp * (metrics.densityDpi / 160f);
        return px;
    }

    private Bitmap onResizeImage(Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();

        Float size = convertDpToPixel(IMG_DP, getApplicationContext());

        Bitmap resized = null;
        while (height > size.intValue()) {
            resized = Bitmap.createScaledBitmap(bitmap, (width * size.intValue()) / height, size.intValue(), true);
            height = resized.getHeight();
            width = resized.getWidth();
        }
        return resized;
    }

    private int getRandom(int maxNumber) {
        return (int) (Math.random() * maxNumber);
    }

    private void onWheelImage() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                float fromAngle = getRandom(360) + 2160 + init_angle;
                RotateAnimation rAnim = new RotateAnimation(init_angle, fromAngle, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                init_angle = fromAngle;
                rAnim.setDuration(3000);
                rAnim.setFillEnabled(true);
                rAnim.setFillAfter(true);
                wheel.startAnimation(rAnim);
            }
        });
    }
}
