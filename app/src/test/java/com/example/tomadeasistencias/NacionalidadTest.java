package com.example.tomadeasistencias;

import org.junit.Test;

//probando tests

public class NacionalidadTest {

        @Test

    public void SubMain(){

            Nacionalidad nacionalidad1 = new Nacionalidad("Argentino", "Arg");
            Nacionalidad nacionalidad2 = new Nacionalidad("Brasileño", "Bra");

            System.out.println(nacionalidad1);
            System.out.println(nacionalidad2);
        }


}
