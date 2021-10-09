package com.chotib.perhitunganchotib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {
    private EditText edtJari;
    private Button btnHitung;
    private TextView tvLuas;
    private TextView tvKeliling;
    double jari, phi = 3.14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        // Inisialisasi
        edtJari = findViewById(R.id.edit_jarijari);
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

    // inputan tanpa parameter
    private void hitungLuas() {
        double jari = Double.parseDouble(edtJari.getText().toString());
        //int luas = Integer.valueOf(panjang) * Integer.valueOf(lebar); // ini juga bisa
        double luas = 3.14 * jari * jari;
        tvLuas.setText("Luas = " + luas);
    }

    private void hitungKeliling() {
        double jari = Double.parseDouble(edtJari.getText().toString());
        //int luas = Integer.valueOf(panjang) * Integer.valueOf(lebar); // ini juga bisa
        double keliling = 2 * 3.14 * jari;
        tvKeliling.setText("Keliling = " + keliling);
    }
}