package com.example.tomadeasistencias;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity  {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void ejecinises (View view) {

    Intent i= new Intent(this, AccesoSistema.class);
    startActivity (i);
}

    public void sal (View view){
        finish();
    }
}
