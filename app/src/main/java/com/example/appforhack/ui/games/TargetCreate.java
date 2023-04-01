package com.example.appforhack.ui.games;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appforhack.MainActivity;
import com.example.appforhack.R;
import com.example.appforhack.ui.dashboard.DashboardFragment;

public class TargetCreate extends AppCompatActivity {

    Button answer1, answer2, answer3;

    int scores = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.icran_three);

        answer1 = findViewById(R.id.button_icran_threeanswer1);
        answer2 = findViewById(R.id.button_icran_threeanswer2);
        answer3 = findViewById(R.id.button_icran_threeanswer3);

        scores = (int) getIntent().getExtras().get("Scores");
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                scores+=2;
                intent.putExtra("Scores", scores);
                startActivity(intent);
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("Scores", scores);
                startActivity(intent);
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("Scores", scores);
                startActivity(intent);
            }
        });
    }
}
