package com.example.proyectogeomah.CorrectoIncorrecto.Correcto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.PreguntasGeografia.PreguntaTresGeografia;
import com.example.proyectogeomah.R;

public class CorrectoGeografiaP2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correcto_geografia_p2);
    }
    //Metodo para el boton Pregunta siguiente
    public void Pregunta3(View view){
        Intent Pre3 = new Intent(this, PreguntaTresGeografia.class);
        startActivity(Pre3);
    }
}