  package com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.PreguntasMatematicas.PreguntaUnoMatematicas;
import com.example.proyectogeomah.R;

  public class IncorrectoMatematicasP1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrecto_matematicas_p1);
    }
      //Metodo para el boton atras
      public void Atras(View view){
          Intent atras = new Intent(this, PreguntaUnoMatematicas.class);
          startActivity(atras);
      }
}