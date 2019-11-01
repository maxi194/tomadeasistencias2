package com.example.tomadeasistencias;


public class Telefono {

private String Caracteristica;
private String Numero;
private String Tipo;

    public Telefono(String caracteristica, String numero, String tipo) {
        this.Caracteristica = caracteristica;
        this.Numero = numero;
        this.Tipo = tipo;
    }

    public String getCaracteristica() {
        return Caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        Caracteristica = caracteristica;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) throws IllegalArgumentException{

        if (numero == ""){

            throw new IllegalArgumentException("El numero no puede quedar vacio");
        }
        Numero = numero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "Caracteristica='" + Caracteristica + '\'' +
                ", Numero='" + Numero + '\'' +
                ", Tipo='" + Tipo + '\'' +
                '}';
    }
}
