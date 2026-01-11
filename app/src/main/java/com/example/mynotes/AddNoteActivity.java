package com.example.mynotes;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddNoteActivity extends AppCompatActivity {

    private EditText etTitle, etContent;
    private ImageView btnBack;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        etTitle = findViewById(R.id.et_title);
        etContent = findViewById(R.id.et_content);
        btnBack = findViewById(R.id.btn_back);
        btnSave = findViewById(R.id.btn_save);

        btnBack.setOnClickListener(v -> finish());

        btnSave.setOnClickListener(v -> {
            String title = etTitle.getText().toString().trim();
            String content = etContent.getText().toString().trim();

            if (title.isEmpty() || content.isEmpty()) {
                Toast.makeText(
                        AddNoteActivity.this,
                        "Title and note cannot be empty",
                        Toast.LENGTH_SHORT
                ).show();
            } else {
                Toast.makeText(
                        AddNoteActivity.this,
                        "Note saved (dummy)",
                        Toast.LENGTH_SHORT
                ).show();
                finish();
            }
        });
    }
}
