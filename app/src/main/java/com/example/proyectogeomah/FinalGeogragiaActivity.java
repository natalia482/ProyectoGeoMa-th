package com.example.proyectogeomah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FinalGeogragiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_geogragia);
    }
    public void Inicio(View view){
        Intent Inicio = new Intent(FinalGeogragiaActivity.this, SeleccionActivity.class);
        startActivity(Inicio);
    }
    public void NuevoJuego(View view){
        Intent Denuevo = new Intent(FinalGeogragiaActivity.this, RegistroIniActivity.class);
        startActivity(Denuevo);
    }
    public void Fin(View view){
        Intent Fin = new Intent(FinalGeogragiaActivity.this, MainActivity.class);
        startActivity(Fin);
    }
}