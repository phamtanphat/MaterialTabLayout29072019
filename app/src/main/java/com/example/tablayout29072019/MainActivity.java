package com.example.tablayout29072019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    MaterialToolbar materialToolbar;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialToolbar = findViewById(R.id.materialToolbar);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tablayout);

        setSupportActionBar(materialToolbar);
        materialToolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        getSupportActionBar().setTitle("Main Activity");
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setIcon(android.R.drawable.ic_menu_sort_by_size);
        viewPagerAdapter = new ViewPagerAdapter(fragmentManager);
        viewPagerAdapter.addArrayTitleFragment(new AndroidFragment(),"Android");
        viewPagerAdapter.addArrayTitleFragment(new PhpFragment(),"Php");


        tabLayout.setupWithViewPager(viewPager);
    }
}
