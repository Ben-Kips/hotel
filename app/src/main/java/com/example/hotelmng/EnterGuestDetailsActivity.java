package com.example.hotelmng;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterGuestDetailsActivity extends AppCompatActivity {
    private EditText nameEditText, emailEditText; // Add more EditText fields for other guest details
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_guest_details);

        // Initialize views
        nameEditText = findViewById(R.id.editTextName);
        emailEditText = findViewById(R.id.editTextEmail);
        saveButton = findViewById(R.id.buttonSaveGuest);

        // Set onClickListener for the saveButton
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Save guest details here (you can implement saving to a database)
                String name = nameEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();

                // Add more code to handle other guest details and saving to the database
            }
        });
    }
}
