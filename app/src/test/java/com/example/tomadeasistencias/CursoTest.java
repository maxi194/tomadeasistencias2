package com.example.tomadeasistencias;

import org.junit.Test;

import java.util.Date;

public class CursoTest {

    @Test

    public void SubMain(){


        Alumno alumno1 = new Alumno("Mendez","Daniel","50228741",new Date("2004/07/18"),"danimen15@gmail.com",new Direccion("Itaembe Mini","Avenida Jauretche","5822","Noreste",0,"S/N",new Localidad("Posadas","Pdas","3300"),new Provincia("Misiones")),new Nacionalidad("Argentina","Arg"),"Masculino");




        Curso curso1 = new Curso("Primero",'A',"Curso del dia 22",2019);

        curso1.addAlumno(alumno1);

        System.out.println(curso1);

        System.out.println(alumno1.getNombre());

        for (Alumno alum: curso1.getAllAlumnos()){

            System.out.println(alum);
        }




    }


}
