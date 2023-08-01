package com.example.hotelmng;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.widget.TextView;
public class RoomManagementActivity extends AppCompatActivity {
    private ArrayList<Room> rooms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_management);

        // Initialize the rooms list (you can load data from the database here)
        rooms = new ArrayList<>();

        // Example: Add a new room
        Room newRoom = new Room();
        newRoom.setRoomNumber(101);
        newRoom.setRoomType("Standard");
        newRoom.setOccupied(false);
        rooms.add(newRoom);

        // Assuming you have a TextView with ID 'textView' in your activity's layout
        TextView textView = findViewById(R.id.textView);

// Example: Display room information
        for (Room room : rooms) {
            String roomStatus = room.isOccupied() ? "Occupied" : "Available";
            String roomInfo = "Room " + room.getRoomNumber() + ": " + room.getRoomType() + " (" + roomStatus + ")";
            textView.append(roomInfo + "\n");
        }

    }
    }
