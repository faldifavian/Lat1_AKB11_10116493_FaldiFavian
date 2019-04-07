package com.example.faldifavian.lat1_akb11_10116493_faldifavian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {
    EditText edtNama, edtUmur;
    Button btnNext;

    private String KEY_NAME = "kamu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        edtNama = findViewById(R.id.edtNama);
        edtUmur =  findViewById(R.id.edtUmur);
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = edtNama.getText().toString();
                String umur = edtUmur.getText().toString();

                boolean isEmptyFields = false;

                if (TextUtils.isEmpty(nama)) {
                    isEmptyFields = true;
                    edtNama.setError("Harap isi dengan nama kamu!");
                } else {
                    Intent moveIntentWithData = new Intent(FormActivity.this, HomeActivity.class);
                    moveIntentWithData.putExtra(KEY_NAME, nama);
                    startActivity(moveIntentWithData);
                }
                if (TextUtils.isEmpty(umur)) {
                    isEmptyFields = true;
                    edtNama.setError("Harap isi dengan umur kamu!");
                }
            }
        });
    }
}
