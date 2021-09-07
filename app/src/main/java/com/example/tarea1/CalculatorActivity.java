package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    EditText campo_dato1, campo_dato2, campo_resultado;
    Button boton_suma, boton_resta, boton_multiplicacion, boton_division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        campo_dato1 = (EditText) findViewById(R.id.edt_primer_dato);
        campo_dato2 = (EditText) findViewById(R.id.edt_segundo_dato);
        campo_resultado = (EditText) findViewById(R.id.edt_resultado);

        boton_suma = (Button) findViewById(R.id.btn_suma);
        boton_resta = (Button) findViewById(R.id.btn_resta);
        boton_multiplicacion = (Button) findViewById(R.id.btn_multiplicacion);
        boton_division = (Button) findViewById(R.id.btn_division);

        boton_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "RESTA", Toast.LENGTH_SHORT).show();
                if (campo_dato1.getText().toString().equals("") || campo_dato2.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(), "Llene los campos", Toast.LENGTH_SHORT).show();
                }
                else {
                    double dato1 = Double.parseDouble(campo_dato1.getText().toString());
                    double dato2 = Double.parseDouble(campo_dato2.getText().toString());
                    double resultado = dato1 + dato2;
                    campo_resultado.setText("" + resultado);
                }
            }
        });

        boton_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "RESTA", Toast.LENGTH_SHORT).show();

                if (campo_dato1.getText().toString().equals("") || campo_dato2.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(), "Llene los campos", Toast.LENGTH_SHORT).show();
                }
                else {
                    double dato1 = Double.parseDouble(campo_dato1.getText().toString());
                    double dato2 = Double.parseDouble(campo_dato2.getText().toString());
                    double resultado = dato1 - dato2;
                    campo_resultado.setText("" + resultado);
                }
            }
        });

        boton_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "MULTIPLICACION", Toast.LENGTH_SHORT).show();

                if (campo_dato1.getText().toString().equals("") || campo_dato2.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(), "Llene los campos", Toast.LENGTH_SHORT).show();
                }
                else {
                    double dato1 = Double.parseDouble(campo_dato1.getText().toString());
                    double dato2 = Double.parseDouble(campo_dato2.getText().toString());
                    double resultado = dato1 * dato2;
                    campo_resultado.setText("" + resultado);
                }
            }
        });

        boton_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "DIVISION", Toast.LENGTH_SHORT).show();

                if (campo_dato1.getText().toString().equals("") || campo_dato2.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(), "Llene los campos", Toast.LENGTH_SHORT).show();
                }
                else {
                    double dato1 = Double.parseDouble(campo_dato1.getText().toString());
                    double dato2 = Double.parseDouble(campo_dato2.getText().toString());
                    double resultado = dato1 / dato2;
                    campo_resultado.setText("" + resultado);
                }
            }
        });
    }
}