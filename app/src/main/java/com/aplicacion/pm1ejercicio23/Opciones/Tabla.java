package com.aplicacion.pm1ejercicio23.Opciones;

public class Tabla {
    public static final String tablaImagenes = "imagenes";
    public static final String idImagen = "idImagen";
    public static final String blobImagen = "blobImagen";
    public static final String descripcion = "descripcion";

    public static final String CreateTableImagenes =
            "CREATE TABLE imagenes(idImagen INTEGER PRIMARY KEY AUTOINCREMENT, blobImagen BLOB, descripcion TEXT)";
    public static final String DropeTableImagenes =
            "DROPE TABLE IF EXISTS imagenes";

    /* Base de Datos */
    public static final String NameDataBase = "DBCurso";
}
