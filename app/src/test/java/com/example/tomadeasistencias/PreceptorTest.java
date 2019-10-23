package com.example.tomadeasistencias;


import org.junit.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class PreceptorTest {

    @Test

    public void SubMain(){









        Preceptor preceptor1 =
                new Preceptor("Perez","Oscar","29008422",new Date("09/02/2004"),"oscarperez@gmail.com",
                new Direccion("Barrio A3-2","Los Lirios","1522","Miguel Lanús",0,"S/N",
                new Localidad("Posadas", "Pdas","3300"),
                new Provincia("Misiones")),
                new Nacionalidad("Argentina", "Arg"),"0P9921");

        AccesoSistema accesoSistema1= new AccesoSistema("oscarperez50","op2992", Date.from(Instant.now()),new Rol("Preceptor"));


        preceptor1.addAccesoSistemas(accesoSistema1);

        System.out.println(preceptor1);

        for (AccesoSistema accsis : preceptor1.getAllAccesoSistema()){

            System.out.println(accsis);

        }


    }

}

