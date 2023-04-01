package com.example.appforhack.ui.learningBase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.appforhack.R;
import com.example.appforhack.databinding.FragmentLearningbaseBinding;

public class LearningBase extends Fragment implements View.OnClickListener {

    Button securityButton, regButton;
    TextView security_text, regText;
    boolean flag;

    private FragmentLearningbaseBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentLearningbaseBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        securityButton = root.findViewById(R.id.security_button);
        securityButton.setOnClickListener(this);

        regButton = root.findViewById(R.id.reg_button);
        regButton.setOnClickListener(this);

        security_text = root.findViewById(R.id.security_text);
        regText = root.findViewById(R.id.reg_text);

        flag = false;
        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.security_button:
                if (!flag) {
                    security_text.setText("БлаБлаБлаБлаБлаБлаБлаБлаБлаБлаБлаБлаБлаБлаБлаБлаБлаБлаБлаБлаБлаБлаБла");
                    flag = !flag;
                }
                else {
                    security_text.setText("");
                    flag = !flag;
                }
            case R.id.reg_button:
        }
    }
}
