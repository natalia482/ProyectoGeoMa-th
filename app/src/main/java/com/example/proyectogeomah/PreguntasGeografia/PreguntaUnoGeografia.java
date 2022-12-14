package com.example.proyectogeomah.PreguntasGeografia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.CorrectoIncorrecto.Correcto.CorrectoGeografiaP1Activity;
import com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto.IncorrectoGeografiaP1Activity;
import com.example.proyectogeomah.R;

public class PreguntaUnoGeografia extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_uno_geografia);
    }
    public void Correcta(View view){
        Intent btn1P1 = new Intent(PreguntaUnoGeografia.this, CorrectoGeografiaP1Activity.class);
        startActivity(btn1P1);
    }
    public void Incorrecta1(View view){
        Intent btn2P1 = new Intent(PreguntaUnoGeografia.this, IncorrectoGeografiaP1Activity.class);
        startActivity(btn2P1);
    }
    public void Incorrecta2(View view){
        Intent btn3P1 = new Intent(PreguntaUnoGeografia.this, IncorrectoGeografiaP1Activity.class);
        startActivity(btn3P1);
    }
}