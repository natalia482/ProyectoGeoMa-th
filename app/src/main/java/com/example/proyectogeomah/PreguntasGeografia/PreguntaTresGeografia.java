package com.example.proyectogeomah.PreguntasGeografia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.CorrectoIncorrecto.Correcto.CorrectoGeografiaP4Activity;
import com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto.IncorrectoGeografiaP3;
import com.example.proyectogeomah.R;

public class PreguntaTresGeografia extends AppCompatActivity {

    Button Btn1P3;
    Button Btn2P3;
    Button Btn3P3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_tres_geografia);
        Btn1P3 = (Button) (findViewById(R.id.btnIncorrecto1P3));
        Btn2P3 = (Button) (findViewById(R.id.btnIncorrecto2P3));
        Btn3P3  =(Button) (findViewById(R.id.btnCorrectoP3));

        Btn1P3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn1P3 = new Intent(PreguntaTresGeografia.this, IncorrectoGeografiaP3.class);
                startActivity(btn1P3);
            }
        });

        Btn2P3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn2P1 = new Intent(PreguntaTresGeografia.this, IncorrectoGeografiaP3.class);
                startActivity(btn2P1);
            }
        });

        Btn3P3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn3P1 = new Intent(PreguntaTresGeografia.this, CorrectoGeografiaP4Activity.class);
                startActivity(btn3P1);
            }
        });
    }
}