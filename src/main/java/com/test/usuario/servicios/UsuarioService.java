package com.test.usuario.servicios;

import com.test.usuario.enums.TipoUsuario;
import com.test.usuario.repositorios.UsuarioRepository;
import com.test.usuario.encapsulacion.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService {

    final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public void crear(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public Usuario validarUsuario(int user, int pass) {
        return usuarioRepository.findByUserAndPass(user, pass).orElse(null);
    }

    public Usuario validarUsuario(int user, int pass, TipoUsuario tipoUsuario) {
        return usuarioRepository.findByUserAndPassAndTipoUsuario(user, pass, tipoUsuario)
                .orElse(null);
    }

    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }
}
