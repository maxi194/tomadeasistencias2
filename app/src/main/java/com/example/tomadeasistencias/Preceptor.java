package com.example.tomadeasistencias;

import java.util.Date;
import java.util.List;

public class Preceptor extends EmpleadoBase {

    public Preceptor(String apellido, String nombre, String dni, Date fechaNacimiento, String correoElectronico, Direccion direccion, Nacionalidad nacionalidad, List<Telefono> telefonos, String legajo, List<AccesoSistema> accesoSistemas) {
        super(apellido, nombre, dni, fechaNacimiento, correoElectronico, direccion, nacionalidad, telefonos, legajo, accesoSistemas);
    }


}

