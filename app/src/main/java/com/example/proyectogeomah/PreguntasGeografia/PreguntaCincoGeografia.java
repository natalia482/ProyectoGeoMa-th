package com.example.proyectogeomah.PreguntasGeografia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.CorrectoIncorrecto.Correcto.CorrectiGeografiaP5Activity;
import com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto.IncorrectoGeografiaP5;
import com.example.proyectogeomah.R;

public class PreguntaCincoGeografia extends AppCompatActivity {
    Button Btn1P5;
    Button Btn2P5;
    Button Btn3P5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_cinco_geografia);
        Btn1P5 = (Button) (findViewById(R.id.btnIncorrecto1P5));
        Btn2P5 = (Button) (findViewById(R.id.btnIncorrecto2P5));
        Btn3P5  =(Button) (findViewById(R.id.btncorrectoP5));

        Btn1P5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn1P1 = new Intent(PreguntaCincoGeografia.this, IncorrectoGeografiaP5.class);
                startActivity(btn1P1);
            }
        });

        Btn2P5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn2P1 = new Intent(PreguntaCincoGeografia.this, CorrectiGeografiaP5Activity.class);
                startActivity(btn2P1);
            }
        });

        Btn3P5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn3P1 = new Intent(PreguntaCincoGeografia.this, IncorrectoGeografiaP5.class);
                startActivity(btn3P1);
            }
        });
    }
}