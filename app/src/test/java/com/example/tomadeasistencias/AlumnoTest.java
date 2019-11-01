package com.example.tomadeasistencias;

import org.junit.Test;

import java.time.Instant;
import java.util.Date;

public class AlumnoTest {

    @Test

    public void SubMain(){



        Alumno alumno1 = new Alumno("perez","juan","40115823", new Date("2004/08/16"),"jperez1@gmail.com", new Direccion("Villa Urquiza","Avenida Cabred","3200","Este",0,"S/N",new Localidad("Posadas","Pdas","3300"),new Provincia("Misiones")),new Nacionalidad("Argentina","Arg"),"Masculino");

        Reincorporacion reincorporacion1 = new Reincorporacion(Date.from(Instant.now()),2,alumno1);

        Inasistencia inasistencia = new Inasistencia(1.00,'S',"No hay observaciones pertinentes",alumno1,new ParteDiario(Date.from(Instant.now()),"Asistencia del Dia","No hay observaciones pertinentes", new Curso("Primer Año",'A',"Curso del dia",1)));


        alumno1.addInasistencia(inasistencia);
        alumno1.addReincorporacion(reincorporacion1);

        System.out.println(alumno1);
        System.out.println(alumno1.getNombre());
        System.out.println(alumno1.getFechaNacimiento());

        for (Reincorporacion reinc: alumno1.getAllReincorporaciones()){

            System.out.println("Reincorporaciones");
            System.out.println(reinc);

        }

        for (Inasistencia inasis: alumno1.getAllInasistencias()){

            System.out.println("Inasistencias");
            System.out.println(inasis);
        }

    }



}
