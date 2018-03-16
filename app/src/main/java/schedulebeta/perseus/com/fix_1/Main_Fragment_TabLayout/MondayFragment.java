package schedulebeta.perseus.com.fix_1.Main_Fragment_TabLayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import schedulebeta.perseus.com.fix_1.R;

public class MondayFragment extends Fragment{
    private static final int LAYOUT = R.layout.monday_fragment_tab;

    private View view;

    public static MondayFragment getInstance(){
        Bundle args = new Bundle();
        MondayFragment mondayFragment= new MondayFragment();
        mondayFragment.setArguments(args);

        return mondayFragment;
    }


    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

}
