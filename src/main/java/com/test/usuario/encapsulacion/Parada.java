package com.test.usuario.encapsulacion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Parada {

    @Id
    @GeneratedValue
    private Long id;

    private String idMachine;

    private int codigoParada;

    private String texto;

    public Parada() {
    }

    public Parada(String idMachine, int codigoParada, String texto) {
        this.idMachine = idMachine;
        this.codigoParada = codigoParada;
        this.texto = texto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdMachine() {
        return idMachine;
    }

    public void setIdMachine(String idMachine) {
        this.idMachine = idMachine;
    }

    public int getCodigoParada() {
        return codigoParada;
    }

    public void setCodigoParada(int codigoParada) {
        this.codigoParada = codigoParada;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
