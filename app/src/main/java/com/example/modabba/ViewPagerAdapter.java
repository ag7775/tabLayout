package com.example.modabba;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private int tabCount;
    private Context context;
    private String[] tabTitles = new String[]{"Lunch", "Dinner", "Combo"};


    public ViewPagerAdapter(FragmentManager fm, Context context)
    {
        super(fm);
        this.context = context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new LunchFragment();
            case 1:
                return new LunchFragment();
            case 2: return new LunchFragment();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
