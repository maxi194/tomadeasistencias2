package com.example.tomadeasistencias;

import java.util.ArrayList;
import java.util.Date;


public class PersonaBase {


    private String Apellido;
    private String Nombre;
    private String Dni;
    private Date FechaNacimiento;
    private String CorreoElectronico;
    private Direccion direccion;
    private Nacionalidad nacionalidad;
    private ArrayList<Telefono> telefonos;

    public PersonaBase(String apellido, String nombre, String dni, Date fechaNacimiento, String correoElectronico, Direccion direccion, Nacionalidad nacionalidad) {
        this.Apellido = apellido;
        this.Nombre = nombre;
        this.Dni = dni;
        this.FechaNacimiento = fechaNacimiento;
        this.CorreoElectronico = correoElectronico;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        telefonos = new ArrayList<Telefono>();
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) throws IllegalArgumentException {

        if (apellido == ""){

            throw new IllegalArgumentException("El apellido no puede quedar vacio");

        }

        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException {

        if (nombre == "") {

            throw new IllegalArgumentException("El nombre no puede quedar vacio");

        }

        Nombre = nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) throws IllegalArgumentException {
        if (dni == "") {

            throw new IllegalArgumentException("El DNI no puede quedar vacio");
        }
        Dni = dni;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void addTelefono (Telefono telefono){

        telefonos.add(telefono);
    }

    public Telefono getTelefono(int numero){

        return telefonos.get(numero);
    }

    public ArrayList <Telefono> getAllTelefonos (){
        return telefonos;
    }

    public void removeTelefono (Telefono telefono){

        telefonos.remove(telefono);
    }


    @Override
    public String toString() {
        return   "Apellido ='" + Apellido + '\'' +
                ", Nombre ='" + Nombre + '\'' +
                ", Dni ='" + Dni + '\'' +
                ", Fecha de Nacimiento =" + FechaNacimiento +
                ", su correo electronico es ='" + CorreoElectronico + '\'' +
                ", vive en =" + direccion +
                ", su nacionalidad es =" + nacionalidad +
                ", telefonos=" + telefonos
                ;
    }
}
