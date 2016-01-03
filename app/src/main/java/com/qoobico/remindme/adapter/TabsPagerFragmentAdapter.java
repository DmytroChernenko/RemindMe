package com.qoobico.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.qoobico.remindme.fragment.ExampleFragment;

/**
 * Created by Dmytro on 03.01.16.
 */
public class TabsPagerFragmentAdapter  extends FragmentPagerAdapter{

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);

        tabs = new String[] {
            "tab 1",
            "Напоминания",
            "tab 3"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                return ExampleFragment.getInstance();
            case 2:
                return ExampleFragment.getInstance();
            default:
                return ExampleFragment.getInstance();
        }
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
