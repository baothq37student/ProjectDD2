package com.example.doannhom.GiaoDien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.doannhom.R;

public class loadingactivity extends AppCompatActivity {

    Animation animation = null;
    ImageView load;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadingactivity);
        load = findViewById(R.id.loading);
        animation = AnimationUtils.loadAnimation(this,R.anim.animationquanlysanpham);
        load.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(loadingactivity.this,MainActivity.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
