package com.self.anmi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class LootieAnima extends AppCompatActivity {

   //LootieAnima lootieAnima;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lottie_animation);
        lottieAnimationView = (LottieAnimationView) findViewById(R.id.mylottie);


    }
}
