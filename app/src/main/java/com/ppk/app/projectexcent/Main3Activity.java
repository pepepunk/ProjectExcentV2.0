package com.ppk.app.projectexcent;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.provider.CalendarContract;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.parsers.ParserConfigurationException;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main3);
        Calendar calendario = new GregorianCalendar();
        int agno=calendario.get(Calendar.YEAR);
        int mes=calendario.get(Calendar.MONTH)+1;
        int dia= calendario.get(Calendar.DAY_OF_MONTH);
        int hora= calendario.get(Calendar.HOUR);
        int minuto=calendario.get(Calendar.MINUTE);
        String agnoo= Integer.toString(agno);
        String mess= Integer.toString(mes);
        String diaa= Integer.toString(dia);
        String horaa= Integer.toString(hora);
        String minutoo= Integer.toString(minuto);


                Button bot = (Button) findViewById(R.id.button);

        TextView titulo1 = (TextView) findViewById(R.id.textView13);
        String texto=agno+" "+mess+" "+diaa+" "+horaa+" "+minutoo;
        titulo1.setText(texto);

            if (agno == 2016&&mes==10&&dia==22){
                if (hora==11&&minuto>45&&minuto<=50)
                {
                    titulo1.setBackgroundColor(Color.rgb(0, 188, 190));
                } else if (hora==11&&minuto>=50) {
                    titulo1.setBackgroundColor(Color.rgb(255, 34, 10));
                }
            }

        bot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aparece();
            }
        });





    }

    public void aparece()
    {
        Intent i=new Intent(this,Main2Activity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);

    }



}
