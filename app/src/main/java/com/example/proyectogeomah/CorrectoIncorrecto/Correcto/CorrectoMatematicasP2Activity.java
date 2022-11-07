package com.example.proyectogeomah.CorrectoIncorrecto.Correcto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.PreguntasMatematicas.PreguntaTresMatematicas;
import com.example.proyectogeomah.R;

public class CorrectoMatematicasP2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correcto_matematicas_p2);
    }
    public void Pregunta3(View view){
        Intent Pre3M = new Intent(this, PreguntaTresMatematicas.class);
        startActivity(Pre3M);
    }
}
