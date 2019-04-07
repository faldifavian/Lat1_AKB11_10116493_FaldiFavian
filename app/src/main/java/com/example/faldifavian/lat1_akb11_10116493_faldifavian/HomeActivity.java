package com.example.faldifavian.lat1_akb11_10116493_faldifavian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private String KEY_NAME = "kamu";
    private String nama;
    TextView txtHome;
    Button btnOke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtHome = findViewById(R.id.txtHome);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        txtHome.setText("Beres! Sekarang " + nama + " udah bisa ngecek penggunan HP mu tiap hari buat bantu kamu ngatur waktu :)");

        btnOke = findViewById(R.id.btnOke);
        btnOke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
            }
        });

    }
}
