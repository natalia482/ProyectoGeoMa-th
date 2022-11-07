package com.example.proyectogeomah.CorrectoIncorrecto.Correcto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.PreguntasMatematicas.PreguntaDosMatematicas;
import com.example.proyectogeomah.R;

public class CorrectoMatematicasP1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correcto_matematicas_p1);
    }
    public void Pregunta2(View view){
        Intent Pre2M = new Intent(this, PreguntaDosMatematicas.class);
        startActivity(Pre2M);
    }
}
