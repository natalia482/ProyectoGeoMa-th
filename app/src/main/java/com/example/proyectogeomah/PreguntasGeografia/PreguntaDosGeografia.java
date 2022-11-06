package com.example.proyectogeomah.PreguntasGeografia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.CorrectoIncorrecto.Correcto.CorrectoGeografiaP2Activity;
import com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto.IncorrectoGeografiaP2Activity;
import com.example.proyectogeomah.R;

public class PreguntaDosGeografia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_dos_geografia);
    }
    public void Correcta(View view){
        Intent btn1P2 = new Intent(PreguntaDosGeografia.this, CorrectoGeografiaP2Activity.class);
        startActivity(btn1P2);
    }
    public void Incorrecta1(View view){
        Intent btn2P2 = new Intent(PreguntaDosGeografia.this, IncorrectoGeografiaP2Activity.class);
        startActivity(btn2P2);
    }
    public void Incorrecta2(View view){
        Intent btn3P2 = new Intent(PreguntaDosGeografia.this, IncorrectoGeografiaP2Activity.class);
        startActivity(btn3P2);
    }
}