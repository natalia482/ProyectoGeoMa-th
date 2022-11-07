package com.example.proyectogeomah.CorrectoIncorrecto.Correcto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.PreguntasMatematicas.PreguntaCuatroMatematicas;
import com.example.proyectogeomah.R;

public class CorrectoMatematicasP3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correcto_matematicas_p3);
    }
    public void Pregunta4(View view){
        Intent Pre4M = new Intent(this, PreguntaCuatroMatematicas.class);
        startActivity(Pre4M);
    }
}
