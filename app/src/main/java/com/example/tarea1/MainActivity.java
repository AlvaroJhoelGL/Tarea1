package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton_calculadora, boton_cuestionario, boton_tabhostg, boton_salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_calculadora = (Button) findViewById(R.id.btn_calculator);
        boton_cuestionario = (Button) findViewById(R.id.btn_questionnaire);
        boton_tabhostg = (Button) findViewById(R.id.btn_tab);
        boton_salir = (Button) findViewById(R.id.btn_exit);

        boton_calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CalculatorActivity.class);
                startActivity(intent);
            }
        });

        boton_cuestionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FormularioActivity.class);
                startActivity(intent);
            }
        });

        boton_tabhostg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MiFragmentTabhostActivity.class);
                startActivity(intent);
            }
        });
        boton_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}