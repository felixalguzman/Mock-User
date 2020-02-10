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

    private LocalTime hora;

    public Inspeccion() {
    }

    public Inspeccion(String texto, LocalTime hora) {
        this.texto = texto;
        this.hora = hora;
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

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Inspeccion [hora=" + hora + ", id=" + id + ", texto=" + texto + "]";
    }

    
}
