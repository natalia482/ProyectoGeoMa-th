package com.example.proyectogeomah.CorrectoIncorrecto.Correcto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.PreguntasGeografia.PreguntaCuatroGeografia;
import com.example.proyectogeomah.R;

public class CorrectoGeografiaP3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correcto_geografia_p3);
    }
    //Metodo para el boton Pregunta siguiente
    public void Pregunta4(View view){
        Intent Pre4 = new Intent(this, PreguntaCuatroGeografia.class);
        startActivity(Pre4);
    }
}