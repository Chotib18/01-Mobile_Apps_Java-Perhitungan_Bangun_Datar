package com.chotib.perhitunganchotib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Deklarasi Variabel Untuk Contoh Layout Chain dan Layout Login
    private Button mViewButtonPersegiPanjang;
    private Button mViewButtonBalok;
    private Button mViewButtonSegitiga;
    private Button mViewButtonLingkaran;
    private Button mViewButtonJajarGenjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buat Inisialisasi Seluruh Button Yang Sudah Di Buat
        mViewButtonPersegiPanjang = (Button)findViewById(R.id.buttonPersegiPanjang);
        mViewButtonBalok = (Button)findViewById(R.id.buttonBalok);
        mViewButtonSegitiga = (Button)findViewById(R.id.buttonSegitiga);
        mViewButtonLingkaran = (Button)findViewById(R.id.buttonLingkaran);
        mViewButtonJajarGenjang = (Button)findViewById(R.id.buttonJajarGenjang);

        // Aksi Listener Button Persegi Panjang
        mViewButtonPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class PersegiPanjang
                startActivity(new Intent(getApplicationContext(),PersegiPanjang.class));
            }
        });

        // Aksi Listener Button Balok
        mViewButtonBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class Balok
                startActivity(new Intent(getApplicationContext(),Balok.class));
            }
        });

        // Aksi Listener Button Segitiga
        mViewButtonSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class Segitiga
                startActivity(new Intent(getApplicationContext(),Segitiga.class));
            }
        });

        // Aksi Listener Button Lingkaran
        mViewButtonLingkaran.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class Lingkaran
                startActivity(new Intent(getApplicationContext(),Lingkaran.class));
            }
        }));

        // Aksi Listener Button Jajar Genjang
        mViewButtonJajarGenjang.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class Jajar Genjang
                startActivity(new Intent(getApplicationContext(),JajarGenjang.class));
            }
        }));

    }
}