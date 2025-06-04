package com.example.quiz_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    private TextInputEditText emailEditText, passwordEditText;
    private MaterialButton loginButton, registerButton;
    private FirebaseAuth mAuth;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        registerButton = findViewById(R.id.registerButton);

        // Check if we have an email from registration
        String registeredEmail = getIntent().getStringExtra("EMAIL");
        if (registeredEmail != null) {
            emailEditText.setText(registeredEmail);
        }

        loginButton.setOnClickListener(v -> {
            String inputEmail = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            if (inputEmail.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                return;
            }

            // Show loading state
            loginButton.setEnabled(false);
            loginButton.setText("Logging in...");

            // Sign in with Firebase
            mAuth.signInWithEmailAndPassword(inputEmail, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        // Sign in success
                        String username = inputEmail.split("@")[0];
                        Intent intent = new Intent(LoginActivity.this, TopicSelectionActivity.class);
            intent.putExtra("USERNAME", username);
            startActivity(intent);
            finish();

                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(LoginActivity.this, "Authentication failed: " + task.getException().getMessage(),
                                Toast.LENGTH_SHORT).show();
                        loginButton.setEnabled(true);
                        loginButton.setText("Login");
                    }
                });
        });

        registerButton.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        });
    }
}