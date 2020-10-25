package com.example.naman.bodyfitetcardiocura;

        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentStatePagerAdapter;

public class HIPA extends FragmentStatePagerAdapter{
    int mNumOfTabs;

    public HIPA(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                HIF1 tab1 = new HIF1();
                return tab1;
            case 1:
                HIF2 tab2 = new HIF2();
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

