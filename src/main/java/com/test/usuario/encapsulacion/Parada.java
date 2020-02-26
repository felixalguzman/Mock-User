package com.test.usuario.encapsulacion;

import com.test.usuario.enums.TipoParada;

import javax.persistence.*;

@Entity
public class Parada {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private int codigoParada;

    private String texto;

    @Enumerated(EnumType.STRING)
    private TipoParada tipoParada;

    public Parada() {
    }

    public Parada(int codigoParada, String texto) {
        this.codigoParada = codigoParada;
        this.texto = texto;
    }

    public Parada(int codigoParada, String texto, TipoParada tipoParada) {
        this.codigoParada = codigoParada;
        this.texto = texto;
        this.tipoParada = tipoParada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public TipoParada getTipoParada() {
        return tipoParada;
    }

    public void setTipoParada(TipoParada tipoParada) {
        this.tipoParada = tipoParada;
    }
}
