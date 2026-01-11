package com.example.mynotes;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class NoteDetailActivity extends AppCompatActivity {

    ImageView btnBack;
    TextView btnEdit, btnDelete;
    EditText etContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);

        btnBack = findViewById(R.id.btn_back);
        btnEdit = findViewById(R.id.btn_edit);
        btnDelete = findViewById(R.id.btn_delete);
        etContent = findViewById(R.id.et_note_content);

        btnBack.setOnClickListener(v -> finish());

        // SIMPAN HASIL EDIT
        btnEdit.setOnClickListener(v -> {
            String updatedNote = etContent.getText().toString();

            if (updatedNote.isEmpty()) {
                Toast.makeText(this, "Note tidak boleh kosong", Toast.LENGTH_SHORT).show();
            } else {
                // DUMMY UPDATE (NANTI KE DATABASE)
                Toast.makeText(this, "Note updated (dummy)", Toast.LENGTH_SHORT).show();
                finish(); // balik ke home
            }
        });

        // DELETE
        btnDelete.setOnClickListener(v -> {
            Toast.makeText(this, "Note deleted (dummy)", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
