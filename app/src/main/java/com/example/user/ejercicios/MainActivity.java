package com.example.user.ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText Valor1;
    private  EditText Valor2;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Valor1 = (EditText) findViewById(R.id.txtValor1);
        Valor2 = (EditText) findViewById(R.id.txtValor2);
        Resultado = (TextView)findViewById(R.id.tvResultado);



    }

    public void mtdSumar(View View){
        String valor1= Valor1.getText().toString();
        String valor2= Valor2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int suma = num1+num2;

        String resultado = String.valueOf(suma);
        Resultado.setText(resultado);

    }



}
