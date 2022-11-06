package com.example.proyectogeomah.PreguntasGeografia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto.IncorrectoGeografiaP5;
import com.example.proyectogeomah.FinalGeogragiaActivity;
import com.example.proyectogeomah.R;

public class PreguntaCincoGeografia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_cinco_geografia);

    }
    public void Correcta(View view){
        Intent btn1P5 = new Intent(PreguntaCincoGeografia.this, FinalGeogragiaActivity.class);
        startActivity(btn1P5);
    }
    public void Incorrecta1(View view){
        Intent btn2P5 = new Intent(PreguntaCincoGeografia.this, IncorrectoGeografiaP5.class);
        startActivity(btn2P5);
    }
    public void Incorrecta2(View view){
        Intent btn3P5 = new Intent(PreguntaCincoGeografia.this, IncorrectoGeografiaP5.class);
        startActivity(btn3P5);
    }
}