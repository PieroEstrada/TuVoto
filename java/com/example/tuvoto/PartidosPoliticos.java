package com.example.tuvoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PartidosPoliticos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partidos_politicos);
    }

    public void partSomos(View view){
        Intent somos_intent=new Intent(this,SomosPeru.class);
        startActivity(somos_intent);
    }
    public void partMorado(View view){
        Intent morado_intent=new Intent(this,PartidoMorado.class);
        startActivity(morado_intent);
    }

    public void partApp(View view){
        Intent app_intent=new Intent(this,AccionPopular.class);
        startActivity(app_intent);
    }

    public void partAvanza(View view){
        Intent avanza_intent=new Intent(this,AvanzaPais.class);
        startActivity(avanza_intent);
    }

    public void partJP(View view){
        Intent jp_intent=new Intent(this,JuntosPeru.class);
        startActivity(jp_intent);
    }

    public void partFuerzaPop(View view){
        Intent fuerzapop_intent=new Intent(this,FuerzaPopular.class);
        startActivity(fuerzapop_intent);
    }

    public void partRenovacion(View view){
        Intent renova_intent=new Intent(this,RenovacionPopular.class);
        startActivity(renova_intent);
    }

    public void partAccionPop(View view){
        Intent accionpop_intent=new Intent(this,AccionPopular.class);
        startActivity(accionpop_intent);
    }
}