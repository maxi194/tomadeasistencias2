package com.example.tomadeasistencias;

import java.util.Date;
import java.util.List;

public class ParteDiario {

    private Date Fecha;
    private String Detalle;
    private String Observaciones;
    private List<Inasistencia> inasistencias;
    private Curso curso;

    public ParteDiario(Date fecha, String detalle, String observaciones, List<Inasistencia> inasistencias, Curso curso) {
        this.Fecha = fecha;
        this.Detalle = detalle;
        this.Observaciones = observaciones;
        this.inasistencias = inasistencias;
        this.curso = curso;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void addInasistencia (Inasistencia inasistencia){

        inasistencias.add(inasistencia);
    }

    public List<Inasistencia> getAllInasistencias(List<Inasistencia> inasistencias){

        return inasistencias;
    }


    @Override
    public String toString() {
        return "ParteDiario{" +
                "Fecha=" + Fecha +
                ", Detalle='" + Detalle + '\'' +
                ", Observaciones='" + Observaciones + '\'' +
                '}';
    }
}
