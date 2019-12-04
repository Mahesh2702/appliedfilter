package com.example.appliedfilterfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPagerAdapter viewPagerAdapter;
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout1);
        viewPager = findViewById(R.id.viewPager1);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

//        viewPagerAdapter.addFragment(new FragmentOne(),"One");
        viewPagerAdapter.addFragment(new FragmentTwo(),"Preventive Care");
        viewPagerAdapter.addFragment(new FragmentThree(),"Standard");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}
