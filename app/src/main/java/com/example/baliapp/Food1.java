package com.example.baliapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Food1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food1);

        ImageSlider imageSlider = findViewById(R.id.foodo1);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://www.palmia.co.id/media/recipe/medium/8d482752e67d760bebf6a71b343913f5.jpg","Image 1"));
        slideModels.add(new SlideModel("https://craftlog.com/m/i/1938191=s1280=h960","Image 2"));
        slideModels.add(new SlideModel("https://asset.kompas.com/crops/De-XNZDDLts_CHluXt03RXOv2ck=/0x0:1000x667/750x500/data/photo/2020/04/20/5e9dab29d6d69.jpg","Image 3"));
        slideModels.add(new SlideModel("https://craftlog.com/m/i/5216287=s1280=h960","Image 4"));
        imageSlider.setImageList(slideModels,true);

        findViewById(R.id.pencet1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),food11.class));
            }
        });
    }
}
