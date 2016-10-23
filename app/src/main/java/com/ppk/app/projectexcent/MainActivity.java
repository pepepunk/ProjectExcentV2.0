package com.ppk.app.projectexcent;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progreso;
    int duracion = 3000;

    private ProgressDialog progreso2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        apagar();
    }

    public void apagar() {
        progreso2 = ProgressDialog.show(this, "Bienvenido al 2° CONAINTE de ITSOEH 2016", "Espera por favor...");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                aparece();
            };
        }, duracion);
    }

    public void aparece()
    {
        Intent i=new Intent(this,Main2Activity.class);
        finish();
        startActivity(i);
    }
}
