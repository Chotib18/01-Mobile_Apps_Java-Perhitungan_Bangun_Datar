package com.chotib.perhitunganchotib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Balok extends AppCompatActivity {
    private EditText edtPanjang;
    private EditText edtLebar;
    private EditText edtTinggi;
    private Button btnHitung;
    private TextView tvLuas;
    private  TextView tvKeliling;
    private TextView tvVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        // Inisialisasi
        edtPanjang = findViewById(R.id.edit_panjang);
        edtLebar = findViewById(R.id.edit_lebar);
        edtTinggi = findViewById(R.id.edit_tinggi);
        btnHitung = findViewById(R.id.btn_hitung);
        tvLuas = findViewById(R.id.tv_luas);
        tvKeliling = findViewById(R.id.tv_keliling);
        tvVolume = findViewById(R.id.tv_volume);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
                hitungKeliling();
                hitungVolume();
            }
        });
    }

    private void hitungLuas() {
        String panjang = edtPanjang.getText().toString();
        String lebar = edtLebar.getText().toString();
        String tinggi = edtTinggi.getText().toString();

        //int luas = Integer.valueOf(panjang) * Integer.valueOf(lebar); // ini juga bisa
        int luas = 2 * (Integer.parseInt(panjang) * Integer.parseInt(lebar) + Integer.parseInt(panjang) * Integer.parseInt(tinggi) + Integer.parseInt(lebar) * Integer.parseInt(tinggi));
        tvLuas.setText("Luas = " + luas);
    }

    private void hitungKeliling() {
        String panjang = edtPanjang.getText().toString();
        String lebar = edtLebar.getText().toString();
        String tinggi = edtTinggi.getText().toString();


        int keliling = 4 * (Integer.valueOf(panjang) + Integer.valueOf(lebar) + Integer.valueOf(tinggi));
        // int keliling = Integer.parseInt(panjang) * Integer.parseInt(lebar); // ini juga bisa
        tvKeliling.setText("Keliling = "+keliling);
    }

    private void hitungVolume() {
        String panjang = edtPanjang.getText().toString();
        String lebar = edtLebar.getText().toString();
        String tinggi = edtTinggi.getText().toString();


        int volume = Integer.valueOf(panjang) * Integer.valueOf(lebar) * Integer.valueOf(tinggi);
        tvVolume.setText("Volume = "+volume);
    }
}