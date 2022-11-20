package com.example.proyectogeomah.CorrectoIncorrecto.Correcto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.PreguntasMatematicas.PreguntaCincoMatematicas;
import com.example.proyectogeomah.R;

public class CorrectoMatematicasP4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correcto_matematicas_p4);
    }
    public void Pregunta5(View view){
        Intent Pre5 = new Intent(this, PreguntaCincoMatematicas.class);
        startActivity(Pre5);
    }
}
