package com.example.proyectogeomah.PreguntasGeografia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectogeomah.CorrectoIncorrecto.Correcto.CorrectoGeografiaP2Activity;
import com.example.proyectogeomah.CorrectoIncorrecto.Incorrecto.IncorrectoGeografiaP2Activity;
import com.example.proyectogeomah.R;

public class PreguntaDosGeografia extends AppCompatActivity {

    Button Btn1P2;
    Button Btn2P2;
    Button Btn3P2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_dos_geografia);
        Btn1P2 = (Button) (findViewById(R.id.btnIncorrecto1P2));
        Btn2P2 = (Button) (findViewById(R.id.btnIncorrecto2P2));
        Btn3P2  =(Button) (findViewById(R.id.btnCorrectoP2));

        Btn1P2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn1P2 = new Intent(PreguntaDosGeografia.this, CorrectoGeografiaP2Activity.class);
                startActivity(btn1P2);
            }
        });

        Btn2P2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn2P2 = new Intent(PreguntaDosGeografia.this, IncorrectoGeografiaP2Activity.class);
                startActivity(btn2P2);
            }
        });

        Btn3P2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn3P2 = new Intent(PreguntaDosGeografia.this, IncorrectoGeografiaP2Activity.class);
                startActivity(btn3P2);
            }
        });

    }
}