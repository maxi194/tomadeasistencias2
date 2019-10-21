package com.example.tomadeasistencias;

import java.util.Date;


public class Preceptor extends EmpleadoBase {

    public Preceptor(String apellido, String nombre, String dni, Date fechaNacimiento, String correoElectronico, Direccion direccion, Nacionalidad nacionalidad, String legajo) {
        super(apellido, nombre, dni, fechaNacimiento, correoElectronico, direccion, nacionalidad, legajo);

    }
}

