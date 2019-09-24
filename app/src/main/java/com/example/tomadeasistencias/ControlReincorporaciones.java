package com.example.tomadeasistencias;

import java.util.List;

public class ControlReincorporaciones {

   private Integer Ciclo;
   private List <Reincorporacion> reincorporaciones;

    public ControlReincorporaciones(Integer ciclo, List<Reincorporacion> reincorporaciones) {
        this.Ciclo = ciclo;
        this.reincorporaciones = reincorporaciones;
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




    public List <Reincorporacion> getAllReincorporaciones (List <Reincorporacion> reincorporacion){

        return reincorporacion;
    }

    @Override
    public String toString() {
        return "ControlReincorporaciones{" +
                "Ciclo=" + Ciclo +
                '}';
    }
}
