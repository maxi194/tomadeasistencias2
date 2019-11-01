package com.example.tomadeasistencias;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String Nombre;
    private Character Division;
    private String Observaciones;
    private Integer Ciclo;
    private ArrayList <Alumno> alumno;

    public Curso(String nombre, Character division, String observaciones, Integer ciclo) {
        this.Nombre = nombre;
        this.Division = division;
        this.Observaciones = observaciones;
        this.Ciclo = ciclo;
        alumno = new ArrayList<Alumno>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {



        Nombre = nombre;
    }

    public Character getDivision() {
        return Division;
    }

    public void setDivision(Character division) {
        Division = division;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    public Integer getCiclo() {
        return Ciclo;
    }

    public void setCiclo(Integer ciclo) {
        Ciclo = ciclo;
    }

    public void addAlumno (Alumno alumno){

        this.alumno.add(alumno);

    }

    public void removeAlumno (Alumno alumno){

        this.alumno.remove(alumno);
    }

    public ArrayList <Alumno> getAllAlumnos (){

        return alumno;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Nombre='" + Nombre + '\'' +
                ", Division=" + Division +
                ", Observaciones='" + Observaciones + '\'' +
                ", Ciclo=" + Ciclo +
                '}';
    }
}
