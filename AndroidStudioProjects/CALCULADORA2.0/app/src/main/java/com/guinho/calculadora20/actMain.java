package com.guinho.calculadora20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class actMain extends AppCompatActivity implements View.OnClickListener {

    private EditText edtvalor1;
    private EditText edtvalor2;

    private Button btnsub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

         edtvalor1 = (EditText)findViewById(R.id.edtvalor1);
         edtvalor2 = (EditText)findViewById(R.id.edtvalor2);
         btnsub = (Button)findViewById(R.id.btnsub);

    public void onclick(View v){
        valor1 =

    }

    }
}
