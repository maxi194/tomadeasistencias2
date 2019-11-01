package com.example.tomadeasistencias;

public class Direccion {


    private String Barrio;
    private String Calle;
    private String Numero;
    private String Zona;
    private Integer Piso;
    private String Departamento;
    private Localidad localidad;
    private Provincia provincia;

    public Direccion(String barrio, String calle, String numero, String zona, Integer piso, String departamento, Localidad localidad, Provincia provincia) {
        this.Barrio = barrio;
        this.Calle = calle;
        this.Numero = numero;
        this.Zona = zona;
        this.Piso = piso;
        this.Departamento = departamento;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String barrio) {
        Barrio = barrio;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getZona() {
        return Zona;
    }

    public void setZona(String zona) {
        Zona = zona;
    }

    public Integer getPiso() {
        return Piso;
    }

    public void setPiso(Integer piso) {
        Piso = piso;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "{" +
                "Barrio='" + Barrio + '\'' +
                ", Calle='" + Calle + '\'' +
                ", Numero='" + Numero + '\'' +
                ", Zona='" + Zona + '\'' +
                ", Piso=" + Piso +
                ", Departamento='" + Departamento + '\'' +
                ", localidad=" + localidad +
                ", provincia=" + provincia +
                '}';
    }
}
