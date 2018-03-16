package schedulebeta.perseus.com.fix_1.Menu_Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import schedulebeta.perseus.com.fix_1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListGroupFragment extends Fragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView listView = (ListView)getView().findViewById(R.id.list_group);

        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        HashMap<String, String> map;

        // Досье на первого кота
        map = new HashMap<>();
        map.put("Name", "М17ИСТ4");
        map.put("Kurs", "магистратура, 1 курс");
        arrayList.add(map);

        // Досье на второго кота
        map = new HashMap<>();
        map.put("Name", "М16ИСТ4");
        map.put("Kurs", "магистратура, 2 курс");
        arrayList.add(map);

        // Досье на третьего кота
        map = new HashMap<>();
        map.put("Name", "14ИСТ4");
        map.put("Kurs", "бакалавриат, 4 курс");
        arrayList.add(map);

        map = new HashMap<>();
        map.put("Name", "15ИСТ4");
        map.put("Kurs", "магистратура, 3 курс");
        arrayList.add(map);

        // Досье на второго кота
        map = new HashMap<>();
        map.put("Name", "16ИСТ4");
        map.put("Kurs", "магистратура, 2 курс");
        arrayList.add(map);

        // Досье на третьего кота
        map = new HashMap<>();
        map.put("Name", "17ИСТ4");
        map.put("Kurs", "бакалавриат, 1 курс");
        arrayList.add(map);

        SimpleAdapter adapter = new SimpleAdapter(this.getActivity(), arrayList, android.R.layout.simple_list_item_2,
                new String[]{"Name", "Kurs"},
                new int[]{android.R.id.text1, android.R.id.text2});
        listView.setAdapter(adapter);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
//                android.R.layout.simple_list_item_1, data);
//        listView.setAdapter(adapter);

    }

    public ListGroupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listgroup, container, false);
    }

}

