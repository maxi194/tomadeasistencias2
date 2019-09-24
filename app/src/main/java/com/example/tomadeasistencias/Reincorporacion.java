package com.example.tomadeasistencias;

import java.util.Date;

public class Reincorporacion {

    private Date Fecha;
    private Integer Ciclo;
    private Alumno alumno;

    public Reincorporacion(Date fecha, Integer ciclo, Alumno alumno) {
        this.Fecha = fecha;
        this.Ciclo = ciclo;
        this.alumno = alumno;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Integer getCiclo() {
        return Ciclo;
    }

    public void setCiclo(Integer ciclo) {
        Ciclo = ciclo;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }



    @Override
    public String toString() {
        return "Reincorporacion{" +
                "Fecha=" + Fecha +
                ", Ciclo=" + Ciclo +
                '}';
    }
}
