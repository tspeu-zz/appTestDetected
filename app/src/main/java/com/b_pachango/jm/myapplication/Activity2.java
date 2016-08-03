package com.b_pachango.jm.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    String muestraResultado;
    TextView txtRes ;
    ImageView iViewRs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txtRes = (TextView)  findViewById(R.id.txtResultado);
        iViewRs = (ImageView) findViewById(R.id.iViewRes);

        Bundle bundle = getIntent().getExtras();
        //String nombreReserva = bundle.getString("nombre").toString();
        int getResultado = bundle.getInt("resultado");

        if(getResultado == 1){

            muestraResultado = "TODO OK MACHO!";
            txtRes.setText(muestraResultado);
            //int id = getResources().getDrawable(R.drawable.ic_thumb_up_black_24dp2,null,null);
           // int res = getResources().getIdentifier("@drawable/ic_thumb_up_black_24dp2", "drawable", this.getPackageName());
          // iViewRs.setImageDrawable(getResources().getDrawable(R.drawable.ic_thumb_up_black_24dp2));
            iViewRs.setImageResource(R.drawable.ic_thumb_up_black_24dp2);
            iViewRs.setBackgroundColor(Color.WHITE);
            iViewRs.setColorFilter(Color.GREEN);
        }
        else{
            muestraResultado ="MACHO, MUY MAL!";
            txtRes.setText(muestraResultado);
            //iViewRs.setImageResource(R.drawable.ic_thumb_down_black_24dp);
            iViewRs.setImageDrawable(getResources().getDrawable(R.drawable.ic_thumb_down_black_24dp));
            iViewRs.setBackgroundColor(Color.WHITE);
            iViewRs.setColorFilter(Color.RED);

        }

    }


}
