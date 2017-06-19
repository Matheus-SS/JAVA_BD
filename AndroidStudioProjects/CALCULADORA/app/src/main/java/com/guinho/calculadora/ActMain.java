package com.guinho.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.ViewAsserts;
import android.widget.*;
import android.view.*;

public class ActMain extends AppCompatActivity implements View.OnClickListener{

    private EditText edtvalor1;
    private EditText edtvalor2;

    private Button btncalcular;
    private Button btnsub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        edtvalor1 = (EditText) findViewById(R.id.edtvalor1);
        edtvalor2 = (EditText) findViewById(R.id.edtvalor2);

        btncalcular = (Button) findViewById(R.id.btncalcular);
        btncalcular.setOnClickListener(this);

        btnsub = (Button) findViewById(R.id.btnsub);
        btnsub.setOnClickListener(this);
    }


    public void onClick (View v) {

        double valor1 = Double.parseDouble(edtvalor1.getText().toString());
        double valor2 = Double.parseDouble(edtvalor2.getText().toString());

        double resultado = valor1 + valor2;


        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("O resultado é: " + resultado);
        dlg.setNeutralButton("OK", null);

        dlg.show();

        double resultado2 = valor1 - valor2;

        AlertDialog.Builder dlg2 = new AlertDialog.Builder(this);
        dlg2.setMessage("O resultado é: " + resultado2);
        dlg2.setNeutralButton("OK", null);
        dlg2.show();
    }
}




