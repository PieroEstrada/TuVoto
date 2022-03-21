package com.example.tuvoto;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class DenunciasBD extends SQLiteOpenHelper {

    public static abstract class DatosTabla implements BaseColumns{
        public static final String NOMBRE_TABLA = "entry";
        public static final String COLUMNA_ID = "codigo";
        public static final String COLUMNA_CONCEPTO = "concepto";
        public static final String COLUMNA_DESCRIPCION = "descripcion";
        public static final String COLUMNA_DENUNCIADO = "denunciado";
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_1);
        db.execSQL("insert into DatosTabla values('001','ACOSO SEXUAL','','YONHY LESCANO')");
        db.execSQL("insert into DatosTabla values('002','LAVADO DE ACTIVOS','Habria recibido 400 mil USD de Odebrecht para su campaña','JULIO GUZMAN')");
        db.execSQL("insert into DatosTabla values('003','ABUSO POLICIAL','Abuso al realizar operaciones policiales como de desalojo en Cajamarca','DANIEL URRESTI')");
        db.execSQL("insert into DatosTabla values('004','TENTATIVA DE ASESINATO','Tentativa de asesinato a periodista en Ayacucho','DANIEL URRESTI')");
        db.execSQL("insert into DatosTabla values('005','ACTOS DE CORRUPCION','Habria liderado una organizacion criminal enquistada en su partido para captar dinero ilícito y así acceder al poder político','KEIKO FUJIMORI')");
        db.execSQL("insert into DatosTabla values('006','ACTOS DE ERROR','cometió un grave error que costó mucho en victimas y procesos, y de paso elimino la posibilidad de un reclamo justo en el caso del proyecto Los Quechuas ','VERONICA MENDOZA')");
        db.execSQL("insert into DatosTabla values('007','LAVADO DE ACTIVOS','Denuncia por delito de lavado de activos en el caso de Panamá Papers vinculadas a las empresas offshore Acres Investments LTD','RAFAEL BERNARDO LOPEZ ALIAGA CAZORLA')");
        db.execSQL("insert into DatosTabla values('008','PECULADO DOLOSO','Denuncias por los delitos de peculado doloso y falsedad ideologica por supuestamente haberse apropiado del presupuesto destinado a gastos de representacion en el año 2017 ','DANIEL ENRIQUE SALAVERRY VILLA')");
        db.execSQL("insert into DatosTabla values('009','PLAGIO','Denuncia por plagio de una tesis de Alberto Fujimori, leyó ante la OEA para justificar autogolpe de 1992 cuando era su asesor', 'HERNANDO DE SOTO')");
        db.execSQL("insert into DatosTabla values('010','FRAUDE PROCESAL', 'Denunciado por los presuntos delitos de fraude procesal y documentos falsos, debido a que habría usado un documento falso para probar un supuesto préstamo de la Universidad Cesar Vallejo a la Universidad Señor de Sipán',' CESAR ACUÑA')");
    }

    private static final String CREAR_TABLA_1 =
            "CREATE TABLE " + DatosTabla.NOMBRE_TABLA + " (" +
                    DatosTabla.COLUMNA_ID + " INTEGER PRIMARY KEY," +
                    DatosTabla.COLUMNA_CONCEPTO + " TEXT," +
                    DatosTabla.COLUMNA_DESCRIPCION + " TEXT,"+
                    DatosTabla.COLUMNA_DENUNCIADO + " TEXT)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + DatosTabla.NOMBRE_TABLA;

    private static final String NOMBRE_BD = "denuncias.bd";
    private static final int VERSION_BD = 1;


    public DenunciasBD(Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }


}
