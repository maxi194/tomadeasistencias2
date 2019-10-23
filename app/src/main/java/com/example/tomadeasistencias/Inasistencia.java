package com.example.tomadeasistencias;

import java.text.DecimalFormat;

public class Inasistencia {

    private Double Cantidad;
    private Character Justificado;
    private String Observaciones;
    private Alumno alumno;
    private ParteDiario parteDiario;


    public Inasistencia(Double cantidad, Character justificado, String observaciones, Alumno alumno, ParteDiario parteDiario) {
        this.Cantidad = cantidad;
        this.Justificado = justificado;
        this.Observaciones = observaciones;
        this.alumno = alumno;
        this.parteDiario = parteDiario;
    }

    public Double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Double cantidad) {
        Cantidad = cantidad;
    }

    public Character getJustificado() {
        return Justificado;
    }

    public void setJustificado(Character justificado) {
        Justificado = justificado;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    public ParteDiario getParteDiario() {
        return parteDiario;
    }

    public void setParteDiario(ParteDiario parteDiario) {
        parteDiario.addInasistencia(this);
        this.parteDiario = parteDiario;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Inasistencia{" +
                "Cantidad=" + Cantidad +
                ", Justificado=" + Justificado +
                ", Observaciones='" + Observaciones + '\'' +
                ", alumno=" + alumno +
                ", parteDiario=" + parteDiario +
                '}';
    }
}
