package com.example.proyectogeomah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BienvenidoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);
    }
    //Metodo para el botorn de la pag registro
    public void RegistroIni(View view){
        Intent RegistroIni = new Intent(this,RegistroActivity.class);
        startActivity(RegistroIni);
    }
}