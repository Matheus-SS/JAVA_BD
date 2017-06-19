package com.guinho.segundoprojeto;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.View;
public class MainActivity extends Activity {

    private EditText editNome;
    private Button btnOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = (EditText)findViewById(R.id.editNome);
        btnOK = (Button)findViewById(R.id.btnOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setMessage(editNome.getText().toString());
                dlg.setNeutralButton("OK",null);
                dlg.show();

            }
        });

    }
}
