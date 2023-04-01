package com.example.appforhack.ui.home;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.appforhack.Achievement;
import com.example.appforhack.R;
import com.example.appforhack.databinding.FragmentHomeBinding;

import java.util.HashMap;
import java.util.LinkedList;

public class HomeFragment extends Fragment  {

    private FragmentHomeBinding binding;
    Button clicker;
    TextView scores;
    ListView achList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        achList = (ListView) root.findViewById(R.id.list);

        scores = (TextView) root.findViewById(R.id.col_scores);

        LinkedList<Achievement> achLinkedList = new LinkedList<>();

        achLinkedList.add(new Achievement("Achievement 1", "Asd", R.drawable.a1));
        achLinkedList.add(new Achievement("Ach 2", "Ghf", R.drawable.a2));
        achLinkedList.add(new Achievement("Achievement 1", "Asd", R.drawable.a1));
        achLinkedList.add(new Achievement("Achievement 1", "Asd", R.drawable.a1));
        achLinkedList.add(new Achievement("Achievement 1", "Asd", R.drawable.a1));
        achLinkedList.add(new Achievement("Achievement 1", "Asd", R.drawable.a1));
        achLinkedList.add(new Achievement("Achievement 1", "Asd", R.drawable.a1));
        achLinkedList.add(new Achievement("Achievement 1", "Asd", R.drawable.a1));

        String[] keyArray = {"title", "description", "cover"};
        int [] idArray = {R.id.title, R.id.desk, R.id.cover};

        LinkedList<HashMap<String, Object>> listForAdapter = new LinkedList<>();
        for (int i = 0; i < achLinkedList.size(); i++) {
            HashMap<String, Object> bookMap = new HashMap<>();
            bookMap.put(keyArray[0], achLinkedList.get(i).getTitle());
            bookMap.put(keyArray[1], achLinkedList.get(i).getDescription());
            bookMap.put(keyArray[2], achLinkedList.get(i).getCoverId());
            listForAdapter.add(bookMap);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(root.getContext(),
                listForAdapter, R.layout.list_item, keyArray, idArray);

        achList.setAdapter(simpleAdapter);
        simpleAdapter.notifyDataSetChanged();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}