package com.example.componentesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class ExemploToggle extends AppCompatActivity {
    SeekBar skbVolume;
    TextView tvVolume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_toggle);
        setTitle("Exemplo SeekBar");

        skbVolume = (SeekBar) findViewById(R.id.seekBarVolume);
        tvVolume = (TextView) findViewById(R.id.lblVolume);

        skbVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tvVolume.setText("Volume : " + i); // Onde o i é valor do volume...
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "seekBar touch iniciado", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "seekBar touch finalizado", Toast.LENGTH_SHORT).show();
            }
        });

    }
}