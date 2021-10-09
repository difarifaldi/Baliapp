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

public class Food2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food2);

        ImageSlider imageSlider = findViewById(R.id.foodo1);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://truffle-assets.imgix.net/n0tuaih9ywav_501p3ifG6s4qACKCYUgkqs_sate-lilit_landscapeThumbnail_id.png","Image 1"));
        slideModels.add(new SlideModel("https://cdn.idntimes.com/content-images/community/2020/02/img-20200206-050527-ea17fb8f4c62ab4920bc24961964e684_600x400.jpg","Image 2"));
        slideModels.add(new SlideModel("https://i.pinimg.com/originals/ec/e5/8f/ece58f8bb713458feecdbd2babf77ee4.jpg","Image 3"));
        slideModels.add(new SlideModel("https://cdn.idntimes.com/content-images/post/20190828/susan-gracia-7ad96addf8db8f432e4c4bd3b32726dd_600x400.jpg","Image 4"));
        imageSlider.setImageList(slideModels,true);

        findViewById(R.id.pencet2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),food22.class));
            }
        });
    }
}
