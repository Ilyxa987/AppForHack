package com.example.appforhack.ui.notifications;

import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.appforhack.Constants;
import com.example.appforhack.R;
import com.example.appforhack.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    TextView textView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);


        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        textView = root.findViewById(R.id.text_notifications);

        Constants constants = new Constants();

        ImageView img = root.findViewById(R.id.anim);
        img.setImageResource(R.drawable.animation);

        AnimationDrawable anim = (AnimationDrawable) img.getDrawable();
        anim.start();

        if (constants.event != null) {
            anim.stop();
            img.setVisibility(View.INVISIBLE);
            textView.setText(constants.event);
        }

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}