package com.example.appforhack.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.appforhack.MainActivity;
import com.example.appforhack.R;
import com.example.appforhack.databinding.FragmentDashboardBinding;
import com.example.appforhack.ui.games.HistoryOfCompany;

public class DashboardFragment extends Fragment implements View.OnClickListener {

    private FragmentDashboardBinding binding;

    ImageButton quest1, quest2, quest3;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;

        quest1 = root.findViewById(R.id.level1);
        quest1.setOnClickListener(this);

        quest2 = root.findViewById(R.id.level2);
        quest2.setOnClickListener(this);

        quest3 = root.findViewById(R.id.level3);
        quest3.setOnClickListener(this);
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.level1:
                Intent intent = new Intent(getActivity(), HistoryOfCompany.class);
                startActivity(intent);
        }
    }
}