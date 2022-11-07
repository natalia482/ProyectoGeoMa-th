package com.example.proyectogeomah.PreguntasMatematicas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.CorrectoIncorrecto.Correcto.CorrectoMatematicasP1Activity;
import com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto.IncorrectoMatematicasP1Activity;
import com.example.proyectogeomah.R;

public class PreguntaUnoMatematicas extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_uno_matematicas);
    }
    public void Correcta(View view){
        Intent btn1P1 = new Intent(PreguntaUnoMatematicas.this, CorrectoMatematicasP1Activity.class);
        startActivity(btn1P1);
    }
    public void Incorrecta1(View view){
        Intent btn2P1 = new Intent(PreguntaUnoMatematicas.this, IncorrectoMatematicasP1Activity.class);
        startActivity(btn2P1);
    }
    public void Incorrecta2(View view){
        Intent btn3P1 = new Intent(PreguntaUnoMatematicas.this, IncorrectoMatematicasP1Activity.class);
        startActivity(btn3P1);
    }
}