//Nama  : Faldi Favian
//NIM   : 10116493
//Kelas : AKB-11
//Tgl   : Jumat, 5 April 2019 16.00 WIB
package com.example.faldifavian.lat1_akb11_10116493_faldifavian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMulai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getBooleanExtra("EXIT",false))
        {
            finish();
        }

        btnMulai = findViewById(R.id.btnMulai);
        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}
