package com.example.tuvoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Categorias_ extends AppCompatActivity {

    GridView gridView;

    String[] values = {
            "Salud",
            "Educacion",
            "Economia",
            "Seguridad Nacional",
            "Desarrollo Sostenible",
            "Cultura",
            "Bienestar Social",
            "Reforma del Estado",
            "Otros"
    };

    int[] images = {
            R.mipmap.ic_salud,
            R.mipmap.ic_educacion,
            R.mipmap.ic_economia,
            R.mipmap.ic_seguridad,
            R.mipmap.ic_desarrollo_sostenible,
            R.mipmap.ic_cultura_inca,
            R.mipmap.ic_bienestar,
            R.mipmap.ic_reformaestado,
            R.mipmap.ic_otros
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias_);

        gridView = (GridView) findViewById(R.id.gridview);

        GridAdapter gridAdapter = new GridAdapter(this, values, images);

        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent salud_intent = new Intent(Categorias_.this, Salud.class);
                        startActivity(salud_intent);
                        break;
                    case 1:
                        Intent educacion_intent = new Intent(Categorias_.this, Educacion.class);
                        startActivity(educacion_intent);
                        break;
                    case 2:
                        Intent economia_intent = new Intent(Categorias_.this, Economia.class);
                        startActivity(economia_intent);
                        break;
                    case 3:
                        Intent seguridad_intent = new Intent(Categorias_.this, SeguridadNacional.class);
                        startActivity(seguridad_intent);
                        break;
                    case 4:
                        Intent desarrollo_intent = new Intent(Categorias_.this, DesarrolloSostenible.class);
                        startActivity(desarrollo_intent);
                        break;
                    case 5:
                        Intent cultura_intent = new Intent(Categorias_.this, Cultura.class);
                        startActivity(cultura_intent);
                        break;
                    case 6:
                        Intent bienestar_intent = new Intent(Categorias_.this, BienestarSocial.class);
                        startActivity(bienestar_intent);
                        break;
                    case 7:
                        Intent reforma_intent = new Intent(Categorias_.this, ReformaEstado.class);
                        startActivity(reforma_intent);
                        break;
                    case 8:
                        Intent otros_intent = new Intent(Categorias_.this, Otros.class);
                        startActivity(otros_intent);
                        break;
                }
            }
        });
    }
}