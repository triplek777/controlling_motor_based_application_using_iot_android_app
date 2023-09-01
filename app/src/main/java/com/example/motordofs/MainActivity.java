package com.example.motordofs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    Button ONbuttonC, ONbuttonAC, OFFbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ONbuttonC = findViewById(R.id.ONbuttonC);
        ONbuttonAC = findViewById(R.id.ONbuttonAC);
        OFFbutton = findViewById(R.id.Offbutton);

        // Write a message to the database
       final FirebaseDatabase database = FirebaseDatabase.getInstance();




        ONbuttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference MOTOR = database.getReference("MOTOR_STATUS");
                MOTOR.setValue(0);

            }
        });

        ONbuttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference MOTOR = database.getReference("MOTOR_STATUS");
                MOTOR.setValue(1);

            }
        });
        OFFbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference MOTOR = database.getReference("MOTOR_STATUS");
                MOTOR.setValue(2);

            }
        });


    }
}