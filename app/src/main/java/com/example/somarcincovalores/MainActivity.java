package com.example.somarcincovalores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText num1;
    public EditText num2;
    public EditText num3;
    public EditText num4;
    public EditText num5;
    public Button somar;
    public TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        num3 = (EditText) findViewById(R.id.num3);
        num4 = (EditText) findViewById(R.id.num4);
        num5 = (EditText) findViewById(R.id.num5);
        somar = (Button) findViewById(R.id.somar);
        resultado = (TextView) findViewById(R.id.resultado);

        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1String = num1.getText().toString();
                int numero1 = Integer.parseInt(numero1String);
                String numero2String = num2.getText().toString();
                int numero2 = Integer.parseInt(numero2String);
                String numero3String = num3.getText().toString();
                int numero3 = Integer.parseInt(numero3String);
                String numero4String = num4.getText().toString();
                int numero4 = Integer.parseInt(numero4String);
                String numero5String = num5.getText().toString();
                int numero5 = Integer.parseInt(numero5String);
                int soma = numero1 + numero2 + numero3 + numero4
                        + numero5;
                resultado.setText(soma);
            }
        });
    }
}