package com.example.proyectogeomah.PreguntasMatematicas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto.IncorrectoMatematicasP5;
import com.example.proyectogeomah.R;

public class PreguntaCincoMatematicas extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_cuatro_matematicas);
    }
    public void Correcta(View view){
        Intent btn1P4 = new Intent(PreguntaCincoMatematicas.this, CorrectoMatematicasP5Activity.class);
        startActivity(btn1P4);
    }
    public void Incorrecta1(View view){
        Intent btn2P4 = new Intent(PreguntaCincoMatematicas.this, IncorrectoMatematicasP5.class);
        startActivity(btn2P4);
    }
    public void Incorrecta2(View view){
        Intent btn3P4 = new Intent(PreguntaCincoMatematicas.this, IncorrectoMatematicasP5.class);
        startActivity(btn3P4);
    }
}