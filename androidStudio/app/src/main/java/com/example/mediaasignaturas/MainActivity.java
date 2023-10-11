package com.example.mediaasignaturas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button evaluarBoton;
    protected double asig1, asig2, asig3, media;
    private TextView text1, text2, text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        evaluarBoton = findViewById(R.id.button);
        text1 = findViewById(R.id.editTextText);
        text2 = findViewById(R.id.editTextText2);
        text3 = findViewById(R.id.editTextText3);

        evaluarBoton.setOnClickListener(new View.OnClickListener (){
            public void onClick(View view){

                asig1 = Double.parseDouble(text1.getText().toString());
                asig2 = Double.parseDouble(text2.getText().toString());
                asig3 = Double.parseDouble(text3.getText().toString());

                media = calcularMedia(asig1, asig2, asig3);

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("media", media);
                startActivity(intent);

            }
        });
    }

    protected double calcularMedia(double asig1, double asig2, double asig3){
        double media = (asig1+asig2+asig3)/3;
        return media;
    }
}