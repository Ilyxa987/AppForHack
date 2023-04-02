package com.example.appforhack.ui.tourTable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.appforhack.Constants;
import com.example.appforhack.Intern;
import com.example.appforhack.R;
import com.example.appforhack.databinding.FragmentTableBinding;

import java.util.HashMap;
import java.util.LinkedList;

public class TourTable extends Fragment {

    ListView tourTable;

    private FragmentTableBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentTableBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        tourTable = root.findViewById(R.id.tournament);

        LinkedList<Intern> internList = new LinkedList<>();

        internList.add(new Intern("Аргандейкина Софья", "67", R.drawable.ava_sofia));
        internList.add(new Intern("Волгарев Платон", "67", R.drawable.ava_platon));
        internList.add(new Intern("Павлов Илья", Integer.toString(Constants.scores), R.drawable.ava_ilya));

        String[] keyArray = {"name", "scores", "ava"};
        int [] idArray = {R.id.tour_name, R.id.tour_scores, R.id.ava};

        LinkedList<HashMap<String, Object>> listForAdapter = new LinkedList<>();
        for (int i = 0; i < internList.size(); i++) {
            HashMap<String, Object> bookMap = new HashMap<>();
            bookMap.put(keyArray[0],internList.get(i).getTitle());
            bookMap.put(keyArray[1], internList.get(i).getDescription());
            bookMap.put(keyArray[2], internList.get(i).getCoverId());
            listForAdapter.add(bookMap);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(root.getContext(),
                listForAdapter, R.layout.tour_item, keyArray, idArray);

        tourTable.setAdapter(simpleAdapter);
        simpleAdapter.notifyDataSetChanged();

        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}
