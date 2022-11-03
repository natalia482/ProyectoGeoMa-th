package com.example.proyectogeomah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
    //Metodo para el botorn de la pag registro
    public void BtnRegistro(View view){
        Intent Registro = new Intent(this,SeleccionActivity.class);
        startActivity(Registro);
    }
}