package com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.PreguntasGeografia.PreguntaCuatroGeografia;
import com.example.proyectogeomah.PreguntasMatematicas.PreguntaCuatroMatematicas;
import com.example.proyectogeomah.R;

public class IncorrectoMatematicasP4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrecto_matematicas_p4);
    }
    //Metodo para el boton atras
    public void Atras(View view){
        Intent atras = new Intent(this, PreguntaCuatroMatematicas.class);
        startActivity(atras);
    }
}