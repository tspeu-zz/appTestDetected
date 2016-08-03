package com.b_pachango.jm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    String muestraResultado;
    TextView txtRes ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txtRes = (TextView)  findViewById(R.id.txtResultado);

        Bundle bundle = getIntent().getExtras();
        //String nombreReserva = bundle.getString("nombre").toString();
        int getResultado = bundle.getInt("resultado");

        if(getResultado == 1){

            muestraResultado = "TODO OK MACHO!";
            txtRes.setText(muestraResultado);

        }
        else{
            muestraResultado ="NADA BIEN MACHO!";
            txtRes.setText(muestraResultado);
        }

    }


}
