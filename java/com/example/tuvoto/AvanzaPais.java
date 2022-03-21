package com.example.tuvoto;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class AvanzaPais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avanza_pais);
    }

    final DenunciasBD denunciasbd = new DenunciasBD(getApplicationContext());

    SQLiteDatabase db = denunciasbd.getReadableDatabase();

    String selection = DenunciasBD.DatosTabla.COLUMNA_DENUNCIADO + " = ?";
    String[] selectionArgs = {"DANIEL URRESTI"};

    String sortOrder = DenunciasBD.DatosTabla.COLUMNA_CONCEPTO + "DESC";
    String[] projection = {
            DenunciasBD.DatosTabla._ID,
            DenunciasBD.DatosTabla.COLUMNA_CONCEPTO,
            DenunciasBD.DatosTabla.COLUMNA_DESCRIPCION,
    };

    Cursor cursor = db.query(
            DenunciasBD.DatosTabla.NOMBRE_TABLA,
            projection,
            DenunciasBD.DatosTabla.COLUMNA_DENUNCIADO,
            selectionArgs,
            null,
            null,
            sortOrder);

    List itemIds = new ArrayList<>();
/*while(cursor.moveToNext()) {
        long itemId = cursor.getLong(
                cursor.getColumnIndexOrThrow(DenunciasBD.DatosTabla._ID));
        itemIds.add(itemId);
    }
cursor.close();*/

}