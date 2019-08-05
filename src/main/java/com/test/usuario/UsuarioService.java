package com.test.usuario;

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

    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }
}
