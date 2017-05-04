package com.example.naveen.testnaveen.fragments;


import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.naveen.testnaveen.R;
import com.example.naveen.testnaveen.adapter.TabsViewPagerAdapter;
import com.example.naveen.testnaveen.adapter.ViewPagerAdapter;

import me.relex.circleindicator.CircleIndicator;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    ViewPager viewPager,tabs_viewpager;
    private TabLayout tabLayout;
    PagerAdapter adapter;
    String[] description,subdescription;
    int[] flag;
    private int[] tabIcons = {
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher
    };

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = null;
        if (view==null ) {
            // Inflate the layout for this fragment
            view = inflater.inflate(R.layout.fragment_main, container, false);

            //data to be popullated
            description = new String[]{"Chain smoker new album 2016", "Chain smoker new album 2016", "3", "4", "5", "6" };
            subdescription = new String[]{"ft.rihana and user", "Chain smoker new album 2016", "3", "4", "5", "6" };
            flag = new int[]{R.drawable.background, R.drawable.navback,
                    R.drawable.background, R.drawable.background,
                    R.drawable.background,
                    R.drawable.background};

            //locate viewpager in tabs_layout
            tabs_viewpager = (ViewPager) view.findViewById(R.id.tabs_viewpager);
            setupViewPager(viewPager);


            tabLayout = (TabLayout) view.findViewById(R.id.tabs);
            tabLayout.setupWithViewPager(tabs_viewpager);
            //setting custom tabs
            setupTabIcons();


            // Locate the ViewPager in viewpager_main.xml
            viewPager = (ViewPager) view.findViewById(R.id.pager);
            CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);
            // Pass results to ViewPagerAdapter Class
            adapter = new ViewPagerAdapter(getActivity(), description, flag,subdescription);
            // Binds the Adapter to the ViewPager
            viewPager.setAdapter(adapter);
            indicator.setViewPager(viewPager);
        }
        return view;
    }
    private void setupViewPager(ViewPager viewPager) {
        TabsViewPagerAdapter adapter = new TabsViewPagerAdapter(getFragmentManager());
        adapter.addFragment(new OneFragment(), "ONE");
        adapter.addFragment(new TwoFragment(), "TWO");
        adapter.addFragment(new ThreeFragment(), "THREE");
        tabs_viewpager.setAdapter(adapter);
    }

    private void setupTabIcons() {


        TextView tabOne = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.custom_tab, null);
        tabOne.setText("ONE");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.select_video, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.custom_tab, null);
        tabTwo.setText("TWO");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.select_image, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.custom_tab, null);
        tabThree.setText("THREE");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.select_milestone, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);


        /*tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // tab.setIcon(R.drawable.milestone);
                Log.w("tab position",""+tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {


            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
*/
    }

}
