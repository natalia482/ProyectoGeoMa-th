package com.example.proyectogeomah.CorrectoIncorrecto.Correcto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.PreguntasGeografia.PreguntaCincoGeografia;
import com.example.proyectogeomah.R;

public class CorrectoGeografiaP4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correcto_geografia_p4);
    }
    //Metodo para el boton Pregunta siguiente
    public void Pregunta5(View view){
        Intent Pre5 = new Intent(this, PreguntaCincoGeografia.class);
        startActivity(Pre5);
    }
}