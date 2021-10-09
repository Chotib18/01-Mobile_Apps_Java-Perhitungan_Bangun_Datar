package com.chotib.perhitunganchotib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjang extends AppCompatActivity {
    private EditText edtPanjang;
    private EditText edtLebar;
    private Button btnHitung;
    private TextView tvLuas;
    private TextView tvKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        // Inisialisasi
        edtPanjang = findViewById(R.id.edit_panjang);
        edtLebar = findViewById(R.id.edit_lebar);
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

    // method tanpa parameter
    private void hitungLuas() {
        String panjang = edtPanjang.getText().toString();
        String lebar = edtLebar.getText().toString();

        //int luas = Integer.valueOf(panjang) * Integer.valueOf(lebar); // ini juga bisa
        int luas = Integer.parseInt(panjang) * Integer.parseInt(lebar);
        tvLuas.setText("Luas = " + luas);
    }

    // method tanpa parameter
    private void hitungKeliling() {
        String panjang = edtPanjang.getText().toString();
        String lebar = edtLebar.getText().toString();
        int keliling = 2 * (Integer.valueOf(panjang) + Integer.valueOf(lebar) );
        // int keliling = Integer.parseInt(panjang) * Integer.parseInt(lebar); // ini juga bisa
        tvKeliling.setText("Keliling = "+keliling);
    }
}