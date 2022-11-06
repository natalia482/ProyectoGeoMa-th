package com.example.proyectogeomah.PreguntasGeografia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.CorrectoIncorrecto.Correcto.CorrectiGeografiaP5Activity;
import com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto.IncorrectoGeografiaP4;
import com.example.proyectogeomah.R;

public class PreguntaCuatroGeografia extends AppCompatActivity {

    Button Btn1P4;
    Button Btn2P4;
    Button Btn3P4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_cuatro_geografia);
        Btn1P4 = (Button) (findViewById(R.id.btnIncorrecto1P4));
        Btn2P4 = (Button) (findViewById(R.id.btnIncorrecto2P4));
        Btn3P4  =(Button) (findViewById(R.id.btnCorrectoP4));

        Btn1P4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn1P1 = new Intent(PreguntaCuatroGeografia.this, CorrectiGeografiaP5Activity.class);
                startActivity(btn1P1);
            }
        });

        Btn2P4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn2P1 = new Intent(PreguntaCuatroGeografia.this, IncorrectoGeografiaP4.class);
                startActivity(btn2P1);
            }
        });

        Btn3P4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn3P1 = new Intent(PreguntaCuatroGeografia.this, IncorrectoGeografiaP4.class);
                startActivity(btn3P1);
            }
        });

    }
}