package com.example.tablayout29072019;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

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

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.mipmap.ic_launcher);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_them :
                Toast.makeText(this, "Item them", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_facebook :
                Toast.makeText(this, "Facebook", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_github :
                Toast.makeText(this, "Github", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
