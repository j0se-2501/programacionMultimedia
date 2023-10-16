package com.example.fragmentstuto;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InicioFragment fragmentInicio = new InicioFragment();
        RojoFragment fragmentRojo = new RojoFragment();
        AzulFragment fragmentAzul = new AzulFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragments, fragmentInicio).commit();

        Button botonRojo = findViewById(R.id.botonRojo);
        Button botonAzul = findViewById(R.id.botonAzul);

        View.OnClickListener onClickListener = new View.OnClickListener (){
            public void onClick(View view){
                FragmentTransaction transaction;
                transaction = getSupportFragmentManager().beginTransaction();
                if (view.getId() == R.id.botonRojo) {
                transaction.replace(R.id.contenedorFragments, fragmentRojo);
                transaction.addToBackStack(null);

                    }
                if (view.getId() == R.id.botonAzul) {
                transaction.replace(R.id.contenedorFragments, fragmentAzul);
                transaction.addToBackStack(null);

                    }

                transaction.commit();
                }
        };

        botonRojo.setOnClickListener(onClickListener);
        botonAzul.setOnClickListener(onClickListener);
    }
}