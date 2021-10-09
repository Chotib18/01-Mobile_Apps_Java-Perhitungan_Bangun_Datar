package com.chotib.perhitunganchotib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import android.widget.ProgressBar;


public class splashscreen extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView presentase;
    private int Value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        progressBar = findViewById(R.id.progress);
        presentase = findViewById(R.id.presentase);
        progressBar.setProgress(0);

        final Handler handler = new Handler(){
            @Override
            public  void handleMessage(Message msg) {
                super.handleMessage(msg);
                presentase.setText(String.valueOf(Value)+"%");
                if (Value==progressBar.getMax()) {
                    startActivity(new Intent(splashscreen.this, MainActivity.class));
                    finish();
                }
                Value++;
            }
        };

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int w=0; w<=progressBar.getMax(); w++){
                        progressBar.setProgress(w);
                        handler.sendMessage(handler.obtainMessage());
                        Thread.sleep(15);
                    }
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        });
        thread.start();
    }
}








