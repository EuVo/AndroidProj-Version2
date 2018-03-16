package schedulebeta.perseus.com.fix_1.Menu_Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import schedulebeta.perseus.com.fix_1.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentInfo extends Fragment {


    public FragmentInfo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false);
    }

}