package com.example.proyectogeomah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SeleccionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);
    }
    //Metodo para el boton de Matematicas
    public void BtnMatematicas(View view){
        Intent BtnMatematicas = new Intent(this,MatematicasBienvenidaActivity.class);
        startActivity(BtnMatematicas);
    }
    //Metodo para el boton de Geografía
    public void BtnGeografia(View view){
        Intent BtnGeografia = new Intent(this,GeografiaBienvenidaActivity.class);
        startActivity(BtnGeografia);
    }
}