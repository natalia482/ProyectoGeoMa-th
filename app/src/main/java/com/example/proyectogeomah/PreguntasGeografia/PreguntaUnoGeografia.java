package com.example.proyectogeomah.PreguntasGeografia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.CorrectoIncorrecto.Correcto.CorrectoGeografiaP1ctivity;
import com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto.IncorrectoGeografiaP1Activity;
import com.example.proyectogeomah.R;

public class PreguntaUnoGeografia extends AppCompatActivity {

    Button Btn1P1;
    Button Btn2P1;
    Button Btn3P1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_uno_geografia);

        Btn1P1 = (Button) (findViewById(R.id.BtnCorrectoP1));
        Btn2P1 = (Button) (findViewById(R.id.BtnIncorrecto1P1));
        Btn3P1  =(Button) (findViewById(R.id.BtnIncorrecto2P1));

        Btn1P1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn1P1 = new Intent(PreguntaUnoGeografia.this, CorrectoGeografiaP1ctivity.class);
                startActivity(btn1P1);
            }
        });

        Btn2P1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn2P1 = new Intent(PreguntaUnoGeografia.this, IncorrectoGeografiaP1Activity.class);
                startActivity(btn2P1);
            }
        });

        Btn3P1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn3P1 = new Intent(PreguntaUnoGeografia.this, IncorrectoGeografiaP1Activity.class);
                startActivity(btn3P1);
            }
        });


    }
}