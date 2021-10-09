package com.chotib.perhitunganchotib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JajarGenjang extends AppCompatActivity {
    private EditText edtSisiAlas;
    private EditText edtSisiMiring;
    private EditText edtTinggi;
    private Button btnHitung;
    private TextView tvLuas;
    private  TextView tvKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);

        // Inisialisasi
        edtSisiAlas = findViewById(R.id.edit_sisiAlas);
        edtSisiMiring = findViewById(R.id.edit_sisiMiring);
        edtTinggi = findViewById(R.id.edit_tinggi);
        btnHitung = findViewById(R.id.btn_hitung);
        tvLuas = findViewById(R.id.tv_luas);
        tvKeliling = findViewById(R.id.tv_keliling);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
                hitungKeliling();
            }
        });
    }

    private void hitungLuas() {
        String Sisialas = edtSisiAlas.getText().toString();
        String tinggi = edtTinggi.getText().toString();

        int luas = Integer.valueOf(Sisialas) * Integer.valueOf(tinggi);
        tvLuas.setText("Luas = "+luas);
    }

    private void hitungKeliling() {
        String Sisialas = edtSisiAlas.getText().toString();
        String Sisimiring = edtSisiMiring.getText().toString();

        int keliling = 2 * (Integer.valueOf(Sisialas) + Integer.valueOf(Sisimiring));
        tvKeliling.setText("Keliling = "+keliling);
    }
}