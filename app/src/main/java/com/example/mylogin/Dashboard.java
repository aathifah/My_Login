package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button button3 = findViewById(R.id.button3);

        button3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, PersonalInformation.class);
                startActivity(intent);

                Toast.makeText(Dashboard.this, "Memasuki Profile Pengguna", Toast.LENGTH_SHORT).show();
            }
        });
    }

}


