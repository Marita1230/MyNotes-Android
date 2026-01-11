package com.example.mynotes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fabAdd;
    private LinearLayout cardNote1, cardNote2;
    private ImageView btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ===== INIT VIEW =====
        btnMenu = findViewById(R.id.btn_menu);
        fabAdd = findViewById(R.id.fab_add);
        cardNote1 = findViewById(R.id.card_note_1);
        cardNote2 = findViewById(R.id.card_note_2);

        // ===== MENU (☰) → SETTINGS =====
        if (btnMenu != null) {
            btnMenu.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            });
        }

        // ===== FAB → ADD NOTE =====
        fabAdd.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddNoteActivity.class);
            startActivity(intent);
        });

        // ===== CARD NOTE 1 → NOTE DETAIL =====
        cardNote1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NoteDetailActivity.class);
            startActivity(intent);
        });

        // ===== CARD NOTE 2 → NOTE DETAIL =====
        cardNote2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NoteDetailActivity.class);
            startActivity(intent);
        });
    }
}
