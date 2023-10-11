package com.example.mediaasignaturas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

    private TextView text;
    private double media;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        media = intent.getExtras().getDouble("media");
        text = findViewById(R.id.textView2);

        text.setText("Media: \n"+String.valueOf(df.format(media)));
        if (media>=5.0) Toast.makeText (this, "Aprobado", Toast.LENGTH_LONG).show();
        else Toast.makeText (this, "Suspenso", Toast.LENGTH_LONG).show();
    }
}