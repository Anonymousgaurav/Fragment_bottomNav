package com.example.fragment_bottom;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter
{
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();



    public PagerAdapter(FragmentManager fm)
    {

        super(fm);

    }

    @Override
    public Fragment getItem(int i)
    {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return titles.get(position);
    }

    public void addfragment(Fragment fragment, String title){
        fragments.add(fragment);
        titles.add(title);
    }


}
