package com.example.naman.bodyfitetcardiocura;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PAMW1112 extends FragmentStatePagerAdapter{
    int mNumOfTabs;

    public PAMW1112(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                F1MW1112 tab1 = new F1MW1112();
                return tab1;
            case 1:
                F2MW1112 tab2 = new F2MW1112();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
