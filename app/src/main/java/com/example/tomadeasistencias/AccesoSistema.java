package com.example.tomadeasistencias;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.Date;



public class AccesoSistema extends Activity {

    TextView nomusu;
    EditText usua;
    TextView  contra;
    EditText clave;
    Button aceptar;
    Button atras;

    private String Usuario;
    private String Contraseña;
    private Date Fecha_Hora;
    private Rol rol;

    public AccesoSistema(String usuario, String contraseña, Date fecha_Hora, Rol rol) {
        this.Usuario = usuario;
        this.Contraseña = contraseña;
        this.Fecha_Hora = fecha_Hora;
        this.rol = rol;
    }



    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) throws IllegalArgumentException {

        if (usuario == "") {

            throw new IllegalArgumentException("El usuario no puede ser vacio");

        }

        Usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) throws IllegalArgumentException{


        if(contraseña == "") {

            throw new IllegalArgumentException("La contraseña no puede ser vacio");
        }

        Contraseña = contraseña;
    }

    public Date getFecha_Hora() {

        return Fecha_Hora;
    }

    public void setFecha_Hora(Date fecha_Hora) {
        Fecha_Hora = fecha_Hora;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acceso_sistema);


    }

    @Override
    public String toString() {
        return "AccesoSistema{" +
                "Nombre de usuario='" + Usuario + '\'' +
                ", Su contraseña='" + Contraseña + '\'' +
                ", Fecha y hora de logueo=" + Fecha_Hora +
                ", El rol es=" + rol +
                '}';
    }
}
