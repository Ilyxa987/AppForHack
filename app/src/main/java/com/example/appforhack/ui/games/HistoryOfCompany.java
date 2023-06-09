package com.example.appforhack.ui.games;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.appforhack.R;
import com.example.appforhack.databinding.ActivityMainBinding;
import com.example.appforhack.ui.dashboard.DashboardFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HistoryOfCompany extends AppCompatActivity {

    int scores = 0;
    Button answer1, answer2, answer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.history_activity);

        answer1 = findViewById(R.id.button_history_answer1);
        answer2 = findViewById(R.id.button_history_answer2);
        answer3 = findViewById(R.id.button_history_answer3);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), WhoCreator.class);
                    intent.putExtra("Scores", scores);
                    startActivity(intent);
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WhoCreator.class);
                scores+=2;
                intent.putExtra("Scores", scores);
                startActivity(intent);
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WhoCreator.class);
                intent.putExtra("Scores", scores);
                startActivity(intent);
            }
        });
    }
}
