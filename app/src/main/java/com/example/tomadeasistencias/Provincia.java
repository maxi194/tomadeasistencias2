package com.example.tomadeasistencias;

public class Provincia {

    private String Nombre;

    public Provincia(String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "Nombre='" + Nombre + '\'' +
                '}';
    }
}
