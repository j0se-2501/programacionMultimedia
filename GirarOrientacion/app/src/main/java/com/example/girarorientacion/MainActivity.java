package com.example.girarorientacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText texto;
    Button boton;

    TextView textoMostrado;

    String textoString;

    private static final String TEXTO_MOSTRADO = "texto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.editTextText);
        boton = findViewById(R.id.button);
        textoMostrado = findViewById(R.id.textView);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textoString = texto.getText().toString();
                textoMostrado.setText(textoString);

            }
        });

    }

    protected void onSaveInstanceState(Bundle outState){

        super.onSaveInstanceState(outState);
        outState.putString(TEXTO_MOSTRADO, textoMostrado.getText().toString());
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restaurar el estado guardado al cambiar la orientación
        textoMostrado.setText(savedInstanceState.getString(TEXTO_MOSTRADO));
    }

}