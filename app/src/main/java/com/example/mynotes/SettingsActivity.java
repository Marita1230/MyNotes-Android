package com.example.mynotes;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ⚠️ INI WAJIB, kalau nggak → APK KELUAR
        setContentView(R.layout.activity_settings);

        ImageView btnBack = findViewById(R.id.btn_back);

        LinearLayout itemLanguage = findViewById(R.id.item_language);
        LinearLayout itemDark = findViewById(R.id.item_dark);
        LinearLayout itemNotification = findViewById(R.id.item_notification);
        LinearLayout itemLogout = findViewById(R.id.item_logout);

        // ⬅ BACK
        btnBack.setOnClickListener(v -> finish());

        itemLanguage.setOnClickListener(v ->
                Toast.makeText(this, "Language clicked", Toast.LENGTH_SHORT).show()
        );

        itemDark.setOnClickListener(v ->
                Toast.makeText(this, "Dark Mode clicked", Toast.LENGTH_SHORT).show()
        );

        itemNotification.setOnClickListener(v ->
                Toast.makeText(this, "Notification clicked", Toast.LENGTH_SHORT).show()
        );

        itemLogout.setOnClickListener(v ->
                Toast.makeText(this, "Logout clicked", Toast.LENGTH_SHORT).show()
        );
    }
}
