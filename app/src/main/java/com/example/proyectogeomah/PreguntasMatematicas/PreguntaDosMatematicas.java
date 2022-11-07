package com.example.proyectogeomah.PreguntasMatematicas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.CorrectoIncorrecto.Correcto.CorrectoMatematicasP2Activity;
import com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto.IncorrectoMatematicasP2Activity;
import com.example.proyectogeomah.R;

public class PreguntaDosMatematicas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_dos_matematicas);
    }
    public void Correcta(View view){
        Intent btn1P2 = new Intent(PreguntaDosMatematicas.this, CorrectoMatematicasP2Activity.class);
        startActivity(btn1P2);
    }
    public void Incorrecta1(View view){
        Intent btn2P2 = new Intent(PreguntaDosMatematicas.this, IncorrectoMatematicasP2Activity.class);
        startActivity(btn2P2);
    }
    public void Incorrecta2(View view){
        Intent btn3P2 = new Intent(PreguntaDosMatematicas.this, IncorrectoMatematicasP2Activity.class);
        startActivity(btn3P2);
    }
}