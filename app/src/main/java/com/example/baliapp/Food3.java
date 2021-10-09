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

public class Food3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food3);

        ImageSlider imageSlider = findViewById(R.id.foodo1);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://asset.kompas.com/crops/EvwaFDu9J4eah35eYwXNufki7A8=/5x3:780x520/750x500/data/photo/2019/11/08/5dc4717f0b77c.jpg","Image 1"));
        slideModels.add(new SlideModel("https://asset.kompas.com/crops/eGqwvo3gq3qSEBcFOiU_0S4bzks=/74x39:780x510/750x500/data/photo/2019/11/11/5dc9071945584.jpg","Image 2"));
        slideModels.add(new SlideModel("https://1.bp.blogspot.com/-ZoGtUwEiN5o/W-2g7qO1SrI/AAAAAAABJMI/1NezcF7aw5EmcLpkJG44KO9A_sjj_LYuwCLcBGAs/s1600/bebek.jpg","Image 3"));
        slideModels.add(new SlideModel("https://denpasarkota.go.id/uploads/berita/berita_191311081146_NikmatiKelezatanBebekTimbungandenganKhasBumbuBasaGenep,SajianTertuadiBali.jpg","Image 4"));
        imageSlider.setImageList(slideModels,true);

    findViewById(R.id.pencet3).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getBaseContext(),food33.class));
        }
    });
    }

}
