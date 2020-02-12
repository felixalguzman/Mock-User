package com.test.usuario.repositorios;

import com.test.usuario.encapsulacion.Parada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParadaRepository extends JpaRepository<Parada, Long> {

//    Optional<Parada> findByCodigoParadaAndIdMachine(int codigoParada, int idMaquina);

    Optional<Parada> findByCodigoParada(int codigoParada);
}
