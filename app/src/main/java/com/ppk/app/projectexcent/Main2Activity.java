package com.ppk.app.projectexcent;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main2Activity extends AppCompatActivity {
    private Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        TextView texto1=(TextView) findViewById(R.id.id1);

        Calendar calendario = new GregorianCalendar();
        int agno=calendario.get(Calendar.YEAR);
        int mes=calendario.get(Calendar.MONTH)+1;
        int dia= calendario.get(Calendar.DAY_OF_MONTH);
        int hora= calendario.get(Calendar.HOUR_OF_DAY);
        int minuto=calendario.get(Calendar.MINUTE);
        String horaa= Integer.toString(hora);


        if (agno==2016 && mes>=10 && dia>27) {

            if (hora >= 0 && minuto >= 0) {
                texto1.setText("!Gracias por haber asistido al CONAINTE ITSOEH 2016!");
            }
        }

        b1=(Button) findViewById(R.id.bt1);
        b2=(Button) findViewById(R.id.bt2);
        b3=(Button) findViewById(R.id.bt3);
        b4=(Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                aparece();
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                aparece2();
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                aparece3();
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                aparece4();
            }
        });

    }
    public void aparece()
    {
        Intent i=new Intent(this,menuEdificios.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
    public void aparece2()
    {
        Intent i=new Intent(this,menuEdificios_2.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
    public void aparece3()
    {
        Intent i=new Intent(this,menuEdificios_3.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
    public void aparece4()
    {
        Intent i=new Intent(this,acercaDe.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
