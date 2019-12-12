package com.test.usuario.repositorios;

import com.test.usuario.encapsulacion.Usuario;
import com.test.usuario.enums.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByUserAndPass(int user, int pass);

    Optional<Usuario> findByUserAndPassAndTipoUsuario(int user, int pass, TipoUsuario tipoUsuario);
}
