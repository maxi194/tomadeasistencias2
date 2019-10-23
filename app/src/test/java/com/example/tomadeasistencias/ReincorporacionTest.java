package com.example.tomadeasistencias;

import org.junit.Test;

import java.time.Instant;
import java.util.Date;

public class ReincorporacionTest {

    @Test

    public void SubMain(){

        Reincorporacion reincorp1 = new Reincorporacion(Date.from(Instant.now()),2019,
                new Alumno("Tres Santos","Fabio","50235441",new Date("2005/15/03"),"fabio3st@gmail.com",
                new Direccion("Los Alamos","Ruta 213","s/n","Sur",0,"S/N",
                new Localidad("Posadas","Pdas","3300"),
                new Provincia("Misiones")),new Nacionalidad("Argentino","Arg"),"Masculino"));

        System.out.println(reincorp1);


    }
}
