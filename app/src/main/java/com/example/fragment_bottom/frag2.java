package com.example.fragment_bottom;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class frag2 extends Fragment {

    View v;
    private TabLayout tlayout;
    private ViewPager pager;
    private PagerAdapter pagerAdapter;


    public frag2() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        v =  inflater.inflate(R.layout.fragment_frag2, container, false);

        tlayout = v.findViewById(R.id.tlayout);
        pager = v.findViewById(R.id.pager);


        pagerAdapter=new PagerAdapter(getActivity().getSupportFragmentManager());

        pagerAdapter.addfragment(new tab1(),"CHAT");
        pagerAdapter.addfragment(new tab2(),"CALL");
        pagerAdapter.addfragment(new tab3(),"VIDEO CALL");

        pager.setAdapter(pagerAdapter);
        tlayout.setupWithViewPager(pager);

        return v;
    }

}
