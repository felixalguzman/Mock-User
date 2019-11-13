package com.test.usuario.repositorios;

import com.test.usuario.encapsulacion.Inspeccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspeccionRepository extends JpaRepository<Inspeccion, Long> {
}
