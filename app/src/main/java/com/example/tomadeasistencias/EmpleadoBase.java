package com.example.tomadeasistencias;

import java.util.Date;
import java.util.List;

public class EmpleadoBase extends PersonaBase {

private String Legajo;
private List <AccesoSistema> accesoSistemas;

    public EmpleadoBase(String apellido, String nombre, String dni, Date fechaNacimiento, String correoElectronico, Direccion direccion, Nacionalidad nacionalidad, List<Telefono> telefonos, String legajo, List<AccesoSistema> accesoSistemas) {
        super(apellido, nombre, dni, fechaNacimiento, correoElectronico, direccion, nacionalidad, telefonos);
        this.Legajo = legajo;
        this.accesoSistemas = accesoSistemas;
    }

    public String getLegajo() {
        return Legajo;
    }

    public void setLegajo(String legajo) {
        Legajo = legajo;
    }

    public void addAccesoSistemas (AccesoSistema accesoSistema){

        accesoSistemas.add(accesoSistema);
    }

    public List <AccesoSistema> getAllAccesoSistema (AccesoSistema accesoSistema){

        return  accesoSistemas;
    }



    @Override
    public String toString() {
        return "EmpleadoBase{" +
                "Legajo='" + Legajo + '\'' +
                '}';
    }
}
