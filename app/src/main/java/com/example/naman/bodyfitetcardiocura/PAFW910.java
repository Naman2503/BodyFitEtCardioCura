package com.example.naman.bodyfitetcardiocura;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PAFW910 extends FragmentStatePagerAdapter{
    int mNumOfTabs;

    public PAFW910(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                F1FW910 tab1 = new F1FW910();
                return tab1;
            case 1:
                F2FW910 tab2 = new F2FW910();
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
