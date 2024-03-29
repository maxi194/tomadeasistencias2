package com.example.tomadeasistencias;

public class Turno {

    private String Nombre;

    //constructor
    public Turno(String nombre) {
        this.Nombre = nombre;
    }

    //getter y setter
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {

        if(this.Nombre == null){

            throw new NullPointerException("El nombree no puede quedar nulo");
        }

        Nombre = nombre;
    }

    //to string
    @Override
    public String toString() {
        return "Turno{" +
                "Nombre='" + Nombre + '\'' +
                '}';
    }
}
