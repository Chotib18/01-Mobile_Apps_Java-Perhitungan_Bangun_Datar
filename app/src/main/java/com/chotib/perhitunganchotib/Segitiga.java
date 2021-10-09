package com.chotib.perhitunganchotib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {
    private EditText edtAlas;
    private EditText edtTinggi;
    private Button btnHitung;
    private TextView tvLuas;
    private TextView tvKeliling;
    private Double alas,tinggi,luas,keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        // Inisialisasi
        edtAlas = findViewById(R.id.edit_alas);
        edtTinggi = findViewById(R.id.edit_tinggii);
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
        String strAlas = edtAlas.getText().toString();
        String strTinggi = edtTinggi.getText().toString();

        if (!edtAlas.equals("") && !edtTinggi.equals("")) {
            alas=Double.parseDouble(strAlas);
            tinggi=Double.parseDouble(strTinggi);

            luas = 0.5*alas*tinggi;
            tvLuas.setText("Luas = " + luas);
        }
    }

    private void hitungKeliling() {
        String strAlas = edtAlas.getText().toString();
        String strTinggi = edtTinggi.getText().toString();

        if (!edtAlas.equals("") && !edtTinggi.equals("")) {
            alas=Double.parseDouble(strAlas);
            tinggi=Double.parseDouble(strTinggi);

            keliling = alas+alas+alas;
            tvKeliling.setText("Keliling = " + keliling);
        }
    }
}