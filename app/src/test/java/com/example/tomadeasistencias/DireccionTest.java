package com.example.tomadeasistencias;

import org.junit.Test;

public class DireccionTest {

    @Test

    public void SubMain() {

        Direccion direccion1 = new Direccion("Villa Cabello","Avenida Kolping", "2550","Oeste",1,"B7", new Localidad("Posadas","Pdas","3300"), new Provincia("Misiones"));


        System.out.println(direccion1);

    }

}
