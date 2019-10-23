package com.example.tomadeasistencias;

import org.junit.Test;

import java.time.Instant;
import java.util.Date;

public class ControlInasistenciasTest {

    @Test

    public void SubMain(){

        ControlInasistencias contrinasis = new ControlInasistencias(2019);

        ParteDiario parteDiario = new ParteDiario(Date.from(Instant.now()),"Parte Diario del Dia","Alumnos",
                new Curso("Quinto",'B',"Los miercoles salen posthora",2019));



        contrinasis.addParteDiario(parteDiario);

        for (ParteDiario partdia : contrinasis.getAllPartesDiarios()){

            System.out.println(partdia);
        }

    }
}
