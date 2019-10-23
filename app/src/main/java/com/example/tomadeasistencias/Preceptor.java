package com.example.tomadeasistencias;

import java.util.ArrayList;
import java.util.Date;


public class Preceptor extends PersonaBase {

    private String Legajo;
    private ArrayList <AccesoSistema> accesoSistemas;

    public Preceptor(String apellido, String nombre, String dni, Date fechaNacimiento, String correoElectronico, Direccion direccion, Nacionalidad nacionalidad, String legajo) {
        super(apellido, nombre, dni, fechaNacimiento, correoElectronico, direccion, nacionalidad);
        this.Legajo = legajo;
        accesoSistemas = new ArrayList<AccesoSistema>();
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

    public ArrayList <AccesoSistema> getAllAccesoSistema (){

        return accesoSistemas;
    }

    @Override
    public String toString() {
        return "Preceptor{" +
                "Legajo='" + Legajo + '\'' +
                ", accesoSistemas=" + accesoSistemas +
                '}';
    }
}

