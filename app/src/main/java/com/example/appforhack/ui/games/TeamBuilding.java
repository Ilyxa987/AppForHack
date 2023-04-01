package com.example.appforhack.ui.games;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.appforhack.Constants;
import com.example.appforhack.MainActivity;
import com.example.appforhack.R;
import com.example.appforhack.ui.notifications.NotificationsFragment;

public class TeamBuilding extends AppCompatActivity {

    Button eventButton;
    EditText eventText;

    private static final String CHANNEL_ID = "channel";

    private static final int NOTIFY_ID = 101;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.teambuild);

        eventText = findViewById(R.id.event_text);

        eventButton = findViewById(R.id.event_button);
        eventButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                String event = eventText.getText().toString();
                Constants constants = new Constants();
                constants.event = event;
                NotificationManager notificationManager =
                        (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "Music",
                        NotificationManager.IMPORTANCE_DEFAULT);
                notificationManager.createNotificationChannel(channel);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID)
                        .setChannelId(CHANNEL_ID)
                        .setSmallIcon(R.drawable.score)
                        .setContentTitle("sdfsdf")
                        .setContentText("dsfdsf")
                        .setPriority(NotificationCompat.PRIORITY_HIGH);
                Notification notification = builder.build();
                notificationManager.notify(NOTIFY_ID, notification);
            }
        });
    }
}
