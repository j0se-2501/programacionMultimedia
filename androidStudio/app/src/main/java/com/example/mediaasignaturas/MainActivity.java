package com.example.mediaasignaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button evaluarBoton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        evaluarBoton = findViewById(R.id.button);

        evaluarBoton.setOnClickListener(new View.OnClickListener (){
            public void onClick(View view){

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

            }
        });
    }

    protected double calcularMedia(double asig1, double asig2, double asig3){
        double media = (asig1+asig2+asig3)/3;
        return media;
    }
}