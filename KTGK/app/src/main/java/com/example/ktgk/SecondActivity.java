package com.example.ktgk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstances) {
        super.onCreate(savedInstances);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        TextView tvmessage = findViewById(R.id.tvMessage);
        Button btnback = findViewById(R.id.btnBack);

        String name = getIntent().getStringExtra("username");
        tvmessage.setText("Xin chào "+name+" !");

        btnback.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
