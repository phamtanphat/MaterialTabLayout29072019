package com.example.tablayout29072019;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private FragmentManager fragmentManager = null;
    private ArrayList<String> arrayListTitle = new ArrayList<>();
    private ArrayList<Fragment> fragments = new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragmentManager = fm;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentManager.getFragments().get(position);
    }

    @Override
    public int getCount() {
        return fragmentManager.getFragments().size();
    }

    public void addArrayTitleFragment(Fragment fragment,String titleFragment){
        fragments.add(fragment);
        arrayListTitle.add(titleFragment);

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return arrayListTitle.get(position);
    }
}
