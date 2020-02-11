package com.test.usuario;

import com.test.usuario.encapsulacion.Inspeccion;
import com.test.usuario.encapsulacion.Parada;
import com.test.usuario.encapsulacion.Usuario;
import com.test.usuario.enums.TipoUsuario;
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
        // SpringApplication.run(UsuarioApplication.class, args);
        ApplicationContext context = SpringApplication.run(UsuarioApplication.class, args);

        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        ParadaService paradaService = (ParadaService) context.getBean("paradaService");
        InspeccionService inspeccionService = (InspeccionService) context.getBean("inspeccionService");

        Usuario usuario = new Usuario(1234, 1234, TipoUsuario.OPERARIO, "Merlin");
        Usuario usuario1 = new Usuario(1111, 1111, TipoUsuario.CALIDAD, "Felix Alejandro Guzman Garcia");
        Usuario usuario2 = new Usuario(2222, 2222, TipoUsuario.MECANICO, "Alma Ramona Rosa Perez ");
        Usuario usuario3 = new Usuario(321, 321, TipoUsuario.FLOORHELPER, "Jose");
        Usuario usuario4 = new Usuario(123, 123, TipoUsuario.CALIDAD, "Perez");

        usuarioService.crear(usuario);
        usuarioService.crear(usuario1);
        usuarioService.crear(usuario2);
        usuarioService.crear(usuario3);
        usuarioService.crear(usuario4);

        Parada parada = new Parada("1", 5, "Parada 5");
        Parada parada1 = new Parada("33", 6, "Parada por codigo numero 6");
        Parada parada2 = new Parada("33", 7, "Parada por codigo numero 7");
        Parada parada3 = new Parada("2", 1, "Parada por codigo numero 1");
        Parada parada4 = new Parada("2", 0, "Parada por codigo numero 0");

        paradaService.crear(parada);
        paradaService.crear(parada1);
        paradaService.crear(parada2);
        paradaService.crear(parada3);
        paradaService.crear(parada4);

        // Turno 1
        Inspeccion inspeccion = new Inspeccion("Limpieza Lona", LocalTime.of(6, 30));
        Inspeccion inspeccion2 = new Inspeccion("Limpieza Lona", LocalTime.of(7, 30));
        Inspeccion inspeccion3 = new Inspeccion("Limpieza Lona", LocalTime.of(8, 45));
        Inspeccion inspeccion4 = new Inspeccion("Limpieza Lona", LocalTime.of(9, 45));
        Inspeccion inspeccion5 = new Inspeccion("Limpieza Lona", LocalTime.of(10, 45));
        Inspeccion inspeccion6 = new Inspeccion("Limpieza Lona", LocalTime.of(11, 45));
        Inspeccion inspeccion7 = new Inspeccion("Limpieza Lona", LocalTime.of(12, 45));
        Inspeccion inspeccion8 = new Inspeccion("Limpieza Lona", LocalTime.of(14, 30));
        Inspeccion inspeccion9 = new Inspeccion("Limpieza Lona", LocalTime.of(15, 30));

        Inspeccion inspeccion10 = new Inspeccion("Limpieza filtro", LocalTime.of(6, 30));
        Inspeccion inspeccion11 = new Inspeccion("Limpieza filtro", LocalTime.of(8, 45));
        Inspeccion inspeccion12 = new Inspeccion("Limpieza filtro", LocalTime.of(10, 45));
        Inspeccion inspeccion13 = new Inspeccion("Limpieza filtro", LocalTime.of(12, 45));

        Inspeccion inspeccion14 = new Inspeccion("Limpieza lubricacion de maquina", LocalTime.of(6, 30));
        Inspeccion inspeccion15 = new Inspeccion("Verificacion de calibracion de paste loop", LocalTime.of(6, 30));
        Inspeccion inspeccion16 = new Inspeccion("Verificacion de los sprints del top carier", LocalTime.of(6, 30));

        // Turno 2
        Inspeccion inspeccion17 = new Inspeccion("Limpieza Lona", LocalTime.of(16, 30));
        Inspeccion inspeccion18 = new Inspeccion("Limpieza Lona", LocalTime.of(17, 30));
        Inspeccion inspeccion19 = new Inspeccion("Limpieza Lona", LocalTime.of(18, 30));
        Inspeccion inspeccion20 = new Inspeccion("Limpieza Lona", LocalTime.of(19, 30));
        Inspeccion inspeccion21 = new Inspeccion("Limpieza Lona", LocalTime.of(20, 30));
        Inspeccion inspeccion22 = new Inspeccion("Limpieza Lona", LocalTime.of(21, 30));
        Inspeccion inspeccion23 = new Inspeccion("Limpieza Lona", LocalTime.of(22, 30));
        Inspeccion inspeccion24 = new Inspeccion("Limpieza Lona", LocalTime.of(23, 30));
        Inspeccion inspeccion25 = new Inspeccion("Limpieza Lona", LocalTime.of(0, 30));
        System.out.println("tiempo hora 0 o 12am " + inspeccion25);
        Inspeccion inspeccion26 = new Inspeccion("Limpieza Lona", LocalTime.of(1, 30));

        Inspeccion inspeccion27 = new Inspeccion("Limpieza lubricacion de maquina", LocalTime.of(16, 30));
        Inspeccion inspeccion28 = new Inspeccion("Verificacion de calibracion de paste loop", LocalTime.of(16, 30));
        Inspeccion inspeccion29 = new Inspeccion("Verificacion de los sprints del top carier", LocalTime.of(16, 30));

        inspeccionService.crear(inspeccion, inspeccion2, inspeccion3, inspeccion4, inspeccion5, inspeccion6,
                inspeccion7, inspeccion8, inspeccion9, inspeccion10, inspeccion11, inspeccion12, inspeccion13,
                inspeccion14, inspeccion15, inspeccion16);

        inspeccionService.crear(inspeccion17, inspeccion18, inspeccion19, inspeccion20, inspeccion21, inspeccion22,
                inspeccion23, inspeccion24, inspeccion25, inspeccion26, inspeccion27, inspeccion28, inspeccion29);

    }

}
