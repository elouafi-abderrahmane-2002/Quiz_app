package com.example.quiz_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class ScoreActivity extends AppCompatActivity {
    private TextView scoreTextView;
    private TextView timeTextView;
    private ProgressBar scoreProgressBar;
    private Button replayButton;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        scoreTextView = findViewById(R.id.scoreTextView);
        timeTextView = findViewById(R.id.timeTextView);
        scoreProgressBar = findViewById(R.id.scoreProgressBar);
        replayButton = findViewById(R.id.replayButton);
        logoutButton = findViewById(R.id.logoutButton);

        int score = getIntent().getIntExtra("SCORE", 0);
        int totalQuestions = getIntent().getIntExtra("TOTAL_QUESTIONS", 5);
        long timeElapsed = getIntent().getLongExtra("TIME_ELAPSED", 0);

        int percentage = (score * 100) / totalQuestions;

        scoreTextView.setText(String.format("Score: %d/%d", score, totalQuestions));
        timeTextView.setText(String.format("Time: %02d:%02d", timeElapsed / 1000 / 60, timeElapsed / 1000 % 60));
        scoreProgressBar.setMax(100);
        scoreProgressBar.setProgress(percentage);

        replayButton.setOnClickListener(v -> {
            Intent intent = new Intent(ScoreActivity.this, QuizActivity.class);
            startActivity(intent);
            finish();
        });

        logoutButton.setOnClickListener(v -> {
            Intent intent = new Intent(ScoreActivity.this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        });
    }
}