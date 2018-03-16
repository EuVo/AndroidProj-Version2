package schedulebeta.perseus.com.fix_1.Main_Fragment_TabLayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import schedulebeta.perseus.com.fix_1.Main_Fragment_TabLayout.MondayFragment;

//import schedulebeta.perseus.com.basicnavigationdrawer.Fragments.tabadapter.TabFragments.MondayFragment;
//import schedulebeta.perseus.com.basicnavigationdrawer.Fragments.tabadapter.TabFragments.TuesdayFragment;

public class TabPagerAdapter extends FragmentPagerAdapter{

    private String[] tabs;

    public TabPagerAdapter(FragmentManager fm){
        super(fm);
        tabs = new String[] {
                "ПН",
                "ВТ",
                "СР",
                "ЧТ",
                "ПТ",
                "СБ"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return MondayFragment.getInstance();
            case 1:
                return MondayFragment.getInstance();
            case 2:
                return MondayFragment.getInstance();
            case 3:
                return MondayFragment.getInstance();
            case 4:
                return MondayFragment.getInstance();
            case 5:
                return MondayFragment.getInstance();
        }

        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}