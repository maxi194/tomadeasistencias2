package com.example.tomadeasistencias;

import java.util.List;

public class ControlInasistencias {

   private Integer Ciclo;
   private List<ParteDiario> partesDiarios;


    public ControlInasistencias(Integer ciclo, List<ParteDiario> partesDiariosrio) {
        this.Ciclo = ciclo;
        this.partesDiarios = partesDiarios;
    }

    public Integer getCiclo() {
        return Ciclo;
    }

    public void setCiclo(Integer ciclo) {
        Ciclo = ciclo;
    }

    public void addParteDiario (ParteDiario partesDiarios){

        this.partesDiarios.add(partesDiarios);
    }

    public void removeParteDiario (ParteDiario partesDiarios){

        this.partesDiarios.remove(partesDiarios);
    }

    public List <ParteDiario> getAllPartesDiarios (ParteDiario partesDiarios){

        return this.partesDiarios;
    }


    @Override
    public String toString() {
        return "ControlInasistencias{" +
                "Ciclo=" + Ciclo +
                '}';
    }
}
