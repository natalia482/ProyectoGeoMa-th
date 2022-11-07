package com.example.proyectogeomah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.PreguntasMatematicas.PreguntaUnoMatematicas;

public class MatematicasBienvenidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_bienvenida);
    }
    public void BienvenidaM(View view){
        Intent BienvenidaM = new Intent(this, PreguntaUnoMatematicas.class);
        startActivity(BienvenidaM);
    }
}