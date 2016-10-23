package com.ppk.app.projectexcent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuEdificios_3 extends AppCompatActivity {
    private Button b1, b2, b3, b4, b5, b6, b7, b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_edificios_3);
        b1 = (Button) findViewById(R.id.bt1);
        b2 = (Button) findViewById(R.id.bt2);
        b3 = (Button) findViewById(R.id.bt3);
        b4 = (Button) findViewById(R.id.bt4);
        b5 = (Button) findViewById(R.id.bt5);
        b6 = (Button) findViewById(R.id.bt6);
        b7 = (Button) findViewById(R.id.bt7);
        b8 = (Button) findViewById(R.id.bt8);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aparece();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aparece2();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aparece3();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aparece4();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aparece5();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aparece6();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aparece7();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aparece8();
            }
        });
    }

    public void aparece() {
        Intent i = new Intent(this, carpaPrincipal_3.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void aparece2() {
        Intent i = new Intent(this, edificio5PB_3.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void aparece3() {
        Intent i = new Intent(this, edificioDireccionG_3.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void aparece4() {
        Intent i = new Intent(this, edificio1PB_3.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void aparece5() {
        Intent i = new Intent(this, estacionamiento1_3.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void aparece6() {
        Intent i = new Intent(this, edificioBiblio_3.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void aparece7() {
        Intent i = new Intent(this, edificio2Frente_3.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void aparece8() {
        Intent i = new Intent(this, estacionamiento2_3.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
