package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(3500)
                .withBackgroundColor(Color.parseColor("#1a1b29"))
                .withBeforeLogoText("SplashScreen")
                .withLogo(R.mipmap.ic_launcher_possu);

        config.getBeforeLogoTextView().setTextColor(Color.WHITE);

        View easySplashScreen =config.create();
        setContentView(easySplashScreen);
    }
}
