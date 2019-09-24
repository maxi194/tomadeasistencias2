package com.example.tomadeasistencias;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;
import java.util.Iterator;
import java.util.List;


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
    private List <Rol> roles;

    public AccesoSistema(String usuario, String contraseña, Date fecha_Hora, List<Rol> roles) {
        this.Usuario = usuario;
        this.Contraseña = contraseña;
        this.Fecha_Hora = fecha_Hora;
        this.roles = roles;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public Date getFecha_Hora() {
        return Fecha_Hora;
    }

    public void setFecha_Hora(Date fecha_Hora) {
        Fecha_Hora = fecha_Hora;
    }

    public void addRol (Rol rol){

        roles.add(rol);
    }


    //Aca tengo el error. Como puedo hacer el metodo getRol? Necesito iterar en la lista?
    
    /*public Rol getRol (Rol rol){

 Rol roll;

        for (Rol rol1 : getAllRoles(this.roles))
              {
if(roll

              }

    }*/

    public List<Rol> getAllRoles (List <Rol> roles){

        return roles;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acceso_sistema);


    }



    @Override
    public String toString() {
        return "AccesoSistema{" +
                "Usuario='" + Usuario + '\'' +
                ", Contraseña='" + Contraseña + '\'' +
                ", Fecha_Hora=" + Fecha_Hora +
                '}';
    }
}
