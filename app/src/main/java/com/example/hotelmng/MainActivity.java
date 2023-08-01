package com.example.hotelmng;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roomManagementButton = findViewById(R.id.roomManagementButton);
        Button guestManagementButton = findViewById(R.id.guestManagementButton);
        Button enterGuestDetails = findViewById(R.id.enterGuestDetails);

        roomManagementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RoomManagementActivity.class);
                startActivity(intent);
            }
        });

        guestManagementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GuestManagementActivity.class);
                startActivity(intent);
            }
        });
        enterGuestDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EnterGuestDetailsActivity.class);
                startActivity(intent);
            }
        });


    }
}
