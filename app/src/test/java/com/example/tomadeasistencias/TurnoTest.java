package com.example.tomadeasistencias;

import org.junit.Test;

public class TurnoTest {

    @Test

    public void SubMain(){

        Turno turno1 = new Turno("Mañana");
        Turno turno2 = new Turno("Tarde");
        Turno turno3 = new Turno("Noche");

        System.out.println(turno1);
        System.out.println(turno2);
        System.out.println(turno3);
    }




}
