package com.example.proyectogeomah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BienvenidoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);
    }
    //Metodo para el botorn de la pag registro inicio
    public void RegistroIni(View view){
        Intent RegistroIni = new Intent(this,RegistroIniActivity.class);
        startActivity(RegistroIni);
    }
}