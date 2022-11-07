package com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.PreguntasMatematicas.PreguntaDosMatematicas;
import com.example.proyectogeomah.R;

public class IncorrectoMatematicasP2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrecto_matematicas_p2);
    }
    //Metodo para el boton atras
    public void Atras(View view){
        Intent atras = new Intent(this, PreguntaDosMatematicas.class);
        startActivity(atras);
    }
}