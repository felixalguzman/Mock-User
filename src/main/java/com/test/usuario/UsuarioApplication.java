package com.test.usuario;

import com.test.usuario.encapsulacion.Inspeccion;
import com.test.usuario.encapsulacion.Parada;
import com.test.usuario.encapsulacion.Usuario;
import com.test.usuario.servicios.InspeccionService;
import com.test.usuario.servicios.ParadaService;
import com.test.usuario.servicios.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalTime;

@SpringBootApplication
public class UsuarioApplication {

    public static void main(String[] args) {
//		SpringApplication.run(UsuarioApplication.class, args);
        ApplicationContext context = SpringApplication.run(UsuarioApplication.class, args);

        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        ParadaService paradaService = (ParadaService) context.getBean("paradaService");
        InspeccionService inspeccionService = (InspeccionService)context.getBean("inspeccionService");

        Usuario usuario = new Usuario(1234, 1234, "Merlin");
        Usuario usuario1 = new Usuario(4321, 4321, "Felix Alejandro Guzman Garcia");
        Usuario usuario2 = new Usuario(1111, 2222, "Alma Ramona Rosa Perez ");
        Usuario usuario3 = new Usuario(321, 123, "Jose");
        Usuario usuario4 = new Usuario(3210, 1234321, "Perez");

        usuarioService.crear(usuario);
        usuarioService.crear(usuario1);
        usuarioService.crear(usuario2);
        usuarioService.crear(usuario3);
        usuarioService.crear(usuario4);

        Parada parada = new Parada(1,5);
        Parada parada1 = new Parada(33,6);
        Parada parada2 = new Parada(33,7);
        Parada parada3 = new Parada(2,1);

        paradaService.crear(parada);
        paradaService.crear(parada1);
        paradaService.crear(parada2);
        paradaService.crear(parada3);


        Inspeccion inspeccion = new Inspeccion("Limpieza Lona", LocalTime.of(8,0));
        Inspeccion inspeccion1 = new Inspeccion("Limpieza filtro", LocalTime.of(9,0));
        Inspeccion inspeccion2 = new Inspeccion("Limpieza lubricacion de maquina", LocalTime.of(10,30));
        Inspeccion inspeccion3 = new Inspeccion("Verificacion de calibracion de paste loop", LocalTime.of(11,0));
        Inspeccion inspeccion4 = new Inspeccion("Verificacion de los sprints del top carier", LocalTime.of(12,0));
        Inspeccion inspeccion5 = new Inspeccion("Alma Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas semper.", LocalTime.of(11,0));

        inspeccionService.crear(inspeccion);
        inspeccionService.crear(inspeccion1);
        inspeccionService.crear(inspeccion2);
        inspeccionService.crear(inspeccion3);
        inspeccionService.crear(inspeccion4);
        inspeccionService.crear(inspeccion5);
    }


}
