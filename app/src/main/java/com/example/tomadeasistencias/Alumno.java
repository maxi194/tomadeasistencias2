package com.example.tomadeasistencias;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Alumno extends PersonaBase {

    private String Genero;
    private ArrayList<Reincorporacion> reincorporaciones;
    private ArrayList <Inasistencia> inasistencias;

    public Alumno(String apellido, String nombre, String dni, Date fechaNacimiento, String correoElectronico, Direccion direccion, Nacionalidad nacionalidad, String genero) {
        super(apellido, nombre, dni, fechaNacimiento, correoElectronico, direccion, nacionalidad);
        Genero = genero;
        reincorporaciones = new ArrayList<Reincorporacion>();
        inasistencias = new ArrayList<Inasistencia>();

    }



    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public void addReincorporacion (Reincorporacion reincorporacion){

        reincorporaciones.add(reincorporacion);
    }

    public void removeReincorporacion (Reincorporacion reincorporacion){

        reincorporaciones.remove(reincorporacion);
    }

    public List <Reincorporacion> getAllReincorporaciones (List <Reincorporacion> reincorporacion){

        return reincorporaciones;
    }

    public void addInasistencia (Inasistencia inasistencia){

        inasistencias.add(inasistencia);
    }

    public void removeInasistencia (Inasistencia inasistencia) {

        inasistencias.remove(inasistencia);

    }

    public List <Inasistencia> getAllInasistencias (List <Inasistencia> inasistencia){

        return inasistencias;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "Genero='" + Genero + '\'' +
                '}';
    }
}
