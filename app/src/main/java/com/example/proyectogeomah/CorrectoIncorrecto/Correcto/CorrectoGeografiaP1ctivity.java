package com.example.proyectogeomah.CorrectoIncorrecto.Correcto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.PreguntasGeografia.PreguntaDosGeografia;
import com.example.proyectogeomah.R;

public class CorrectoGeografiaP1ctivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correcto_geografia_p1);
    }
    //Metodo para el boton Pregunta siguiente
    public void Pregunta2(View view){
        Intent Pre2 = new Intent(this, PreguntaDosGeografia.class);
        startActivity(Pre2);
    }
}