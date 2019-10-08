package com.test.usuario.controladores;

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

    @RequestMapping(value = "usuario/validar", method = RequestMethod.GET)
    public ResponseEntity<Usuario> validar(@RequestParam("user") int user, @RequestParam("pass") int pass) {
        Usuario usuario = usuarioService.validarUsuario(user, pass);
        HttpStatus status = usuario != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(usuario, status);
    }

    @PostMapping("usuario/crear")
    public ResponseEntity<Usuario> crear(@RequestParam("user") int user, @RequestParam("pass") int pass) {
        Usuario usuario = new Usuario(user, pass);
        usuarioService.crear(usuario);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @GetMapping("usuarios")
    public ResponseEntity<List<Usuario>> todos() {
        return new ResponseEntity<>(usuarioService.buscarTodos(), HttpStatus.OK);
    }
}
