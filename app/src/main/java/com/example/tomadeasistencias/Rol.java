package com.example.tomadeasistencias;


public class Rol {

  private String Nombre;

    public Rol(String nombre) {
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
        return "Rol{" +
                "Nombre='" + Nombre + '\'' +
                '}';
    }


}


