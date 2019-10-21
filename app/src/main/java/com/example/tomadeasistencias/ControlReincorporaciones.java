package com.example.tomadeasistencias;

import java.util.ArrayList;


public class ControlReincorporaciones {

   private Integer Ciclo;
   private ArrayList<Reincorporacion> reincorporaciones;

    public ControlReincorporaciones(Integer ciclo) {
        this.Ciclo = ciclo;
        reincorporaciones = new ArrayList<Reincorporacion>();
    }

    public Integer getCiclo() {
        return Ciclo;
    }

    public void setCiclo(Integer ciclo) {
        Ciclo = ciclo;
    }

    public void addReincorporacion (Reincorporacion reincorporacion){

        reincorporaciones.add(reincorporacion);
    }


    public ArrayList <Reincorporacion> getAllReincorporaciones (){

        return reincorporaciones;
    }

    @Override
    public String toString() {
        return "ControlReincorporaciones{" +
                "Ciclo=" + Ciclo +
                '}';
    }
}
