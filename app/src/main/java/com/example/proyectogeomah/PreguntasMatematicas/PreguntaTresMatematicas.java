package com.example.proyectogeomah.PreguntasMatematicas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto.IncorrectoMatematicasP3;
import com.example.proyectogeomah.R;

public class PreguntaTresMatematicas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_tres_matematicas);
    }
    public void Incorrecta1(View view){
        Intent btn1P3 = new Intent(PreguntaTresMatematicas.this, IncorrectoMatematicasP3.class);
        startActivity(btn1P3);
    }
    public void Incorrecta2(View view){
        Intent btn2P3 = new Intent(PreguntaTresMatematicas.this, IncorrectoMatematicasP3.class);
        startActivity(btn2P3);
    }
    public void Correcta(View view){
        Intent btn3P3 = new Intent(PreguntaTresMatematicas.this, CorrectoMatematicasP3Activity.class);
        startActivity(btn3P3);
    }
}