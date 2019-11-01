package com.example.tomadeasistencias;


import org.junit.Test;

import java.time.Instant;
import java.util.Date;


public class AccesoSistemaTest {

    @Test

    public void SubMain(){

        AccesoSistema accesosistema1 = new AccesoSistema("maxi94","maxi2019", Date.from(Instant.now()),new Rol("Preceptor"));

        System.out.println(accesosistema1);

        try {

            AccesoSistema accesosistema2 = new AccesoSistema("","pp22",Date.from(Instant.now()),new Rol("Preceptor"));

             System.out.println(accesosistema2);
        } catch (IllegalArgumentException e){

            System.out.println("Error: " + e.getMessage());
        }


    }



}
