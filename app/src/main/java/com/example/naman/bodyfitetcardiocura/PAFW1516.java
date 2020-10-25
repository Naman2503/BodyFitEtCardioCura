package com.example.naman.bodyfitetcardiocura;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PAFW1516 extends FragmentStatePagerAdapter{
    int mNumOfTabs;

    public PAFW1516(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                F1FW1516 tab1 = new F1FW1516();
                return tab1;
            case 1:
                F2FW1516 tab2 = new F2FW1516();
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