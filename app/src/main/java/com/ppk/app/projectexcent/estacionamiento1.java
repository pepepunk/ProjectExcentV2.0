package com.ppk.app.projectexcent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estacionamiento1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estacionamiento1);
        Button bot = (Button) findViewById(R.id.button);

        bot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aparece();
            }
        });
    }

    public void aparece() {
        Intent i = new Intent(this, menuEdificios.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}