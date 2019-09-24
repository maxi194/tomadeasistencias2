package com.example.tomadeasistencias;

import java.util.Date;
import java.util.List;

public class PersonaBase {


    private String  Apellido;
    private String Nombre;
    private String Dni;
    private Date FechaNacimiento;
    private String CorreoElectronico;
    private Direccion direccion;
    private Nacionalidad nacionalidad;
    private List<Telefono> telefonos;

    public PersonaBase(String apellido, String nombre, String dni, Date fechaNacimiento, String correoElectronico, Direccion direccion, Nacionalidad nacionalidad, List<Telefono> telefonos) {
        this.Apellido = apellido;
        this.Nombre = nombre;
        this.Dni = dni;
        this.FechaNacimiento = fechaNacimiento;
        this.CorreoElectronico = correoElectronico;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.telefonos = telefonos;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
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

    public List <Telefono> getAllTelefonos (List <Telefono> telefonos){
        return  telefonos;
    }

    public void removeTelefono (Telefono telefono){

        telefonos.remove(telefono);
    }

    @Override
    public String toString() {
        return "PersonaBase{" +
                "Apellido='" + Apellido + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Dni='" + Dni + '\'' +
                ", FechaNacimiento=" + FechaNacimiento +
                ", CorreoElectronico='" + CorreoElectronico + '\'' +
                ", direccion=" + direccion +
                ", nacionalidad=" + nacionalidad +
                ", telefonos=" + telefonos +
                '}';
    }
}
