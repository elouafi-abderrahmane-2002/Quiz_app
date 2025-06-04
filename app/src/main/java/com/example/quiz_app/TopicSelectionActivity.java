package com.example.quiz_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TopicSelectionActivity extends AppCompatActivity {

    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_selection);

        username = getIntent().getStringExtra("USERNAME");

        Button btnMusic = findViewById(R.id.btnMusic);
        Button btnProgramming = findViewById(R.id.btnProgramming);
        Button btnGym = findViewById(R.id.btnGym);

        View.OnClickListener topicClickListener = view -> {
            String topic;

            if (view.getId() == R.id.btnMusic) {
                topic = "Music";
            } else if (view.getId() == R.id.btnProgramming) {
                topic = "Programming";
            } else if (view.getId() == R.id.btnGym) {
                topic = "Gym";
            } else {
                topic = "Unknown";
            }

            Intent intent = new Intent(TopicSelectionActivity.this, QuizActivity.class);
            intent.putExtra("USERNAME", username);
            intent.putExtra("TOPIC", topic);
            startActivity(intent);
            finish();
        };

        btnMusic.setOnClickListener(topicClickListener);
        btnProgramming.setOnClickListener(topicClickListener);
        btnGym.setOnClickListener(topicClickListener);
    }
}
