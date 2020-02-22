package com.test.usuario.controladores;

import com.test.usuario.enums.TipoUsuario;
import com.test.usuario.servicios.UsuarioService;
import com.test.usuario.encapsulacion.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @RequestMapping(value = "usuario/validar", method = RequestMethod.POST)
    public ResponseEntity<Usuario> validar(@RequestBody Usuario usuario) {
        Usuario mecanico = usuarioService.validarUsuario(usuario.getUser(), usuario.getPass());
        HttpStatus status = mecanico != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(mecanico, status);
    }

    @RequestMapping(value = "mecanico/validar")
    public ResponseEntity<Usuario> validarMecanico(@RequestBody Usuario usuario) {
        Usuario mecanico = usuarioService.validarUsuario(usuario.getUser(), usuario.getPass());
        HttpStatus status = mecanico != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(mecanico, status);

    }

    @RequestMapping(value = "calidad/validar")
    public ResponseEntity<Usuario> validarCalidad(@RequestBody Usuario usuario) {
        Usuario mecanico = usuarioService.validarUsuario(usuario.getUser(), usuario.getPass());
        HttpStatus status = mecanico != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(mecanico, status);

    }

    @RequestMapping(value = "floorHelper/validar")
    public ResponseEntity<Usuario> validarFloorHelper(@RequestBody Usuario usuario) {
        Usuario mecanico = usuarioService.validarUsuario(usuario.getUser(), usuario.getPass());
        HttpStatus status = mecanico != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(mecanico, status);

    }


    @GetMapping("usuarios")
    public ResponseEntity<List<Usuario>> todos() {
        return new ResponseEntity<>(usuarioService.buscarTodos(), HttpStatus.OK);
    }
}
