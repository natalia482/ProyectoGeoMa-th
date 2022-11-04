package com.example.proyectogeomah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroIniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_ini);
    }
    //Metodo para el botorn de la pag registro inicio
    public void RegistroUsuario(View view){
        Intent RegistroUsuario = new Intent(this,SeleccionActivity.class);
        startActivity(RegistroUsuario);
    }
    //impemetacion gif del pato desde un servidor web

}