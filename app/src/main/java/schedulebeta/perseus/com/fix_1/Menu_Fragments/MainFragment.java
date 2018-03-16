package schedulebeta.perseus.com.fix_1.Menu_Fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import schedulebeta.perseus.com.fix_1.R;
import schedulebeta.perseus.com.fix_1.Main_Fragment_TabLayout.TabPagerAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment{

    private static final int LAYOUT = R.layout.fragment_main;
    private  ViewPager viewPager;

    public static MainFragment getInstance(){
        Bundle args = new Bundle();
        MainFragment mainFragment = new MainFragment();
        mainFragment.setArguments(args);
        return mainFragment;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        viewPager = (ViewPager) getActivity().findViewById(R.id.viewPager);
        TabPagerAdapter adapter = new TabPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) getActivity().findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(LAYOUT, container, false);

    }


}
