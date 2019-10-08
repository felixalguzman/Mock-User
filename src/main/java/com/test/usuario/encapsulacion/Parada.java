package com.test.usuario.encapsulacion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Parada {

    @Id
    @GeneratedValue
    private Long id;

    private int idMaquina;

    private int codigoParada;

    public Parada() {
    }

    public Parada(int idMaquina, int codigoParada) {
        this.idMaquina = idMaquina;
        this.codigoParada = codigoParada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public int getCodigoParada() {
        return codigoParada;
    }

    public void setCodigoParada(int codigoParada) {
        this.codigoParada = codigoParada;
    }
}
