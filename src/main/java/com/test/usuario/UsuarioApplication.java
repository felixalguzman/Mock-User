package com.test.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UsuarioApplication {

    public static void main(String[] args) {
//		SpringApplication.run(UsuarioApplication.class, args);
        ApplicationContext context = SpringApplication.run(UsuarioApplication.class, args);

        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");

        Usuario usuario = new Usuario(1234, 123456);
        Usuario usuario1 = new Usuario(4321, 1234);
        Usuario usuario2 = new Usuario(9876, 123478);
        Usuario usuario3 = new Usuario(4567, 123490);
        Usuario usuario4 = new Usuario(3210, 1234321);

        usuarioService.crear(usuario);
        usuarioService.crear(usuario1);
        usuarioService.crear(usuario2);
        usuarioService.crear(usuario3);
        usuarioService.crear(usuario4);
    }


}
