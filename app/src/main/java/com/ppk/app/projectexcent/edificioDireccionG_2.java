package com.ppk.app.projectexcent;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class edificioDireccionG_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edificio_direccion_g_2);
        TextView texto1=(TextView) findViewById(R.id.id1);
        TextView texto2=(TextView) findViewById(R.id.id2);
        TextView texto3=(TextView) findViewById(R.id.id3);
        TextView texto4=(TextView) findViewById(R.id.id4);
        TextView texto5=(TextView) findViewById(R.id.id5);


        Calendar calendario = new GregorianCalendar();
        int agno=calendario.get(Calendar.YEAR);
        int mes=calendario.get(Calendar.MONTH)+1;
        int dia= calendario.get(Calendar.DAY_OF_MONTH);
        int hora= calendario.get(Calendar.HOUR_OF_DAY);
        int minuto=calendario.get(Calendar.MINUTE);
        String horaa= Integer.toString(hora);


        if (agno==2016 && mes==10 && dia==26) {

            if (hora >= 8 && minuto >= 0 && hora < 10 ) {
                texto1.setTextColor(Color.GREEN);
            } else if (hora >= 10) {
                texto1.setTextColor(Color.RED);
            }

            if (hora >= 10 && minuto >= 0 && hora < 11) {
                texto2.setTextColor(Color.GREEN);
            } else if (hora >= 11 ) {
                texto2.setTextColor(Color.RED);
            }

            if (hora >= 12 && minuto >= 0 && hora < 14) {
                texto3.setTextColor(Color.GREEN);
            } else if (hora >= 14) {
                texto3.setTextColor(Color.RED);
            }

            if (hora >= 14 && minuto >= 0 && hora < 16) {
                texto4.setTextColor(Color.GREEN);
            } else if (hora >= 16) {
                texto4.setTextColor(Color.RED);
            }

            if (hora >= 16 && minuto >= 0 && hora < 17) {
                texto5.setTextColor(Color.GREEN);
            } else if (hora >= 17) {
                texto5.setTextColor(Color.RED);
            }

        }
        Button bot = (Button) findViewById(R.id.button);

        bot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aparece();
            }
        });
    }

    public void aparece() {
        Intent i = new Intent(this, menuEdificios_2.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}