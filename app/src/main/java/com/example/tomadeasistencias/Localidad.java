package com.example.tomadeasistencias;

public class Localidad {


    private String Nombre;
    private String NombreResumido;
    private String CodigoPostal;

    public Localidad(String nombre, String nombreResumido, String codigoPostal) {
        this.Nombre = nombre;
        this.NombreResumido = nombreResumido;
        this.CodigoPostal = codigoPostal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        CodigoPostal = codigoPostal;
    }

    public String getNombreResumido() {
        return NombreResumido;
    }

    public void setNombreResumido(String nombreResumido) {
        NombreResumido = nombreResumido;
    }


    @Override
    public String toString() {
        return "Localidad{" +
                "El nombre de la localidad es = '" + Nombre + '\'' +
                ", Su nombre resumido es = '" + NombreResumido + '\'' +
                ", El codigo postal es = '" + CodigoPostal + '\'' +
                '}';
    }
}
