package com.example.baliapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListTour extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listtour);
        findViewById(R.id.tour1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent si = new Intent(Intent.ACTION_SEND);
                si.setType("message/rfc822");
                si.putExtra(Intent.EXTRA_EMAIL, new String[]{"difarifaldi0906@gmail.com"});
                si.putExtra(Intent.EXTRA_SUBJECT, "I want this tour guide");
                si.putExtra(Intent.EXTRA_TEXT, " ");
                startActivity(Intent.createChooser(si,"Choose Mail App"));
            }
        });

    }
}
