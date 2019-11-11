package com.example.tablayout29072019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    MaterialToolbar materialToolbar;
    ViewPager viewPager;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        materialToolbar = findViewById(R.id.materialToolbar);
        viewPager = findViewById(R.id.viewpager);

        setSupportActionBar(materialToolbar);
        materialToolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        getSupportActionBar().setTitle("Main Activity");

    }
}
