package schedulebeta.perseus.com.fix_1.Menu_Fragments;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Switch;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.HashMap;

import schedulebeta.perseus.com.fix_1.R;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentNotifications extends Fragment{


    public FragmentNotifications() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Switch elswitch = (Switch) getView().findViewById(R.id.switcherComp);
        ListView listView = (ListView) getView().findViewById(R.id.list_view);
        ListView listView1 = (ListView) getView().findViewById(R.id.list_view1);
        View horizontalLine = (View) getView().findViewById(R.id.horizontal_line);

        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        ArrayList<HashMap<String, String>> arrayList1 = new ArrayList<>();
        HashMap<String, String> map;
        HashMap<String, String> map1;

        map1 = new HashMap<>();
        map1.put("Main", "Уведомления");
        arrayList1.add(map1);

        // Досье на первого кота
        map = new HashMap<>();
        map.put("Name", "Тип уведомления");
        map.put("Kurs", "Сигнал и вибрация");
        arrayList.add(map);

        // Досье на второго кота
        map = new HashMap<>();
        map.put("Name", "Выбрать сигнал");
        map.put("Kurs", "По умолчанию");
        arrayList.add(map);

        // Досье на третьего кота
        map = new HashMap<>();
        map.put("Name", "Старт до начала события");
        map.put("Kurs", "10 мин");
        arrayList.add(map);

        map = new HashMap<>();
        map.put("Name", "Повтор");
        map.put("Kurs", "1 мин");
        arrayList.add(map);

        SimpleAdapter adapter = new SimpleAdapter(this.getActivity(), arrayList1, R.layout.list_item,
                new String[]{"Main"},
                new int[]{R.id.nameView});
        listView.setAdapter(adapter);
        SimpleAdapter adapter1 = new SimpleAdapter(this.getActivity(), arrayList, android.R.layout.simple_list_item_2,
                new String[]{"Name", "Kurs"},
                new int[]{android.R.id.text1, android.R.id.text2});
        listView1.setAdapter(adapter1);

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notifications, container, false);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
    }

}