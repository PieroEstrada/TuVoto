package com.example.tuvoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

//    final DenunciasBD denunciasBD = new DenunciasBD(getApplicationContext());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void partidos(View view){
        Intent partidos_intent = new Intent(this, PartidosPoliticos.class);
        startActivity(partidos_intent);
    }

    public void categorias(View view){
        Intent categorias_intent = new Intent(this, Categorias_.class);
        startActivity(categorias_intent);
    }

    public void info(View view){
        Intent info_intent = new Intent(this, Info.class);
        startActivity(info_intent);
    }
}