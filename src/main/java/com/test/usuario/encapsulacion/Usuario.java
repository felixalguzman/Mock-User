package com.test.usuario.encapsulacion;

import com.test.usuario.enums.TipoUsuario;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    private int user;
    private int pass;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

    private String nombre;

    public Usuario() {
    }

    public Usuario(int user, int pass, TipoUsuario tipoUsuario, String nombre) {
        this.user = user;
        this.pass = pass;
        this.tipoUsuario = tipoUsuario;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
