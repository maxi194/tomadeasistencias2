package com.example.tomadeasistencias;

import java.util.ArrayList;


public class ControlInasistencias {

   private Integer Ciclo;
   private ArrayList<ParteDiario> partesDiarios;


    public ControlInasistencias(Integer ciclo){
        this.Ciclo = ciclo;
        partesDiarios = new ArrayList<ParteDiario>();
    }

    public Integer getCiclo() {
        return Ciclo;
    }

    public void setCiclo(Integer ciclo) throws IllegalArgumentException {

        if (ciclo == 0) {

            throw new IllegalArgumentException("El ciclo no puede ser cero");
        }


        Ciclo = ciclo;
    }

    public void addParteDiario (ParteDiario partesDiarios){

        this.partesDiarios.add(partesDiarios);
    }

    public void removeParteDiario (ParteDiario partesDiarios){

        this.partesDiarios.remove(partesDiarios);
    }

    public ArrayList <ParteDiario> getAllPartesDiarios (){

        return partesDiarios;
    }


    @Override
    public String toString() {
        return "Control de Inasistencias " +
                "Ciclo=" + Ciclo
                ;
    }
}
