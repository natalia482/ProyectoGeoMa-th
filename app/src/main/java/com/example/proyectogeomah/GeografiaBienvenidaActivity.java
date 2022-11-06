package com.example.proyectogeomah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.PreguntasGeografia.PreguntaUnoGeografia;

public class GeografiaBienvenidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geografia_bienvenida);
    }

    //Metodo para el boton Iniciar
    public void BienvenidaG(View view){
        Intent BienvenidaG = new Intent(this, PreguntaUnoGeografia.class);
        startActivity(BienvenidaG);
    }
}