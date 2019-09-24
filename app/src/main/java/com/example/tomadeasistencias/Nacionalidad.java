package com.example.tomadeasistencias;

public class Nacionalidad {

    private String Nombre;
    private String NombreResumido;

    public Nacionalidad(String nombre, String nombreResumido) {
        this.Nombre = nombre;
        this.NombreResumido = nombreResumido;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNombreResumido() {
        return NombreResumido;
    }

    public void setNombreResumido(String nombreResumido) {
        NombreResumido = nombreResumido;
    }

    @Override
    public String toString() {
        return "Nacionalidad{" +
                "Nombre='" + Nombre + '\'' +
                ", NombreResumido='" + NombreResumido + '\'' +
                '}';
    }


}
