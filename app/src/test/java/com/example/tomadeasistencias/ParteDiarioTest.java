package com.example.tomadeasistencias;

import org.junit.Test;

import java.time.Instant;
import java.util.Date;

public class ParteDiarioTest {

    @Test

    public void SubMain(){


      ParteDiario partediario1 = new ParteDiario(Date.from(Instant.now()),"Parte diario del dia de hoy","Atencion",
              new Curso("Segundo",'B',"Los lunes entran despues de hora",2019));


      System.out.println(partediario1);



    }




}
