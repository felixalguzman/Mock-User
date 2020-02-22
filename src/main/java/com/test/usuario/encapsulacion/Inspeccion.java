package com.test.usuario.encapsulacion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalTime;

@Entity
public class Inspeccion {

    @Id
    @GeneratedValue
    private Long id;

    private String texto;

    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Inspeccion() {
    }

    public Inspeccion(String texto, LocalTime horaInicio) {
        this.texto = texto;
        this.horaInicio = horaInicio;
    }

    public Inspeccion(String texto, LocalTime horaInicio, LocalTime horaFin) {
        this.texto = texto;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime hora) {
        this.horaInicio = hora;
    }

    @Override
    public String toString() {
        return "Inspeccion [hora=" + horaInicio + ", id=" + id + ", texto=" + texto + "]";
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

}
