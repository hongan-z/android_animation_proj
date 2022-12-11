package com.self.anmi;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class TestOnCreat extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;

    @SuppressLint({"ResourceType", "MissingInflatedId"})
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ///setContentView(R.id.other_animation);
        setContentView(R.id.other_animation);
        lottieAnimationView =(LottieAnimationView) findViewById(R.id.lottie2);
    }
}
