package com.example.hotelmng;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.widget.TextView;

public class GuestManagementActivity extends AppCompatActivity {
    private ArrayList<Guest> guests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_management); // Set the layout

        // Initialize the guests list (you can load data from the database here)
        guests = new ArrayList<>();

        // Example: Add a new guest
        Guest newGuest = new Guest();
        newGuest.setName("John Doe");
        newGuest.setEmail("john.doe@example.com");
        // Set other guest details
        guests.add(newGuest);

        // Assuming you have a TextView with ID 'textView' in your activity's layout
        TextView textView = findViewById(R.id.textView);

        // Example: Display guest information
        for (Guest guest : guests) {
            String guestInfo = "Guest Name: " + guest.getName() + "\nEmail: " + guest.getEmail();
            textView.append(guestInfo + "\n\n");
        }
    }
}
