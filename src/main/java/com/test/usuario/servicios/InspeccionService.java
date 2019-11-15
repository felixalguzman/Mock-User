package com.test.usuario.servicios;

import com.test.usuario.encapsulacion.Inspeccion;
import com.test.usuario.repositorios.InspeccionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InspeccionService {

    final InspeccionRepository inspeccionRepository;

    public InspeccionService(InspeccionRepository inspeccionRepository) {
        this.inspeccionRepository = inspeccionRepository;
    }

    public void crear(Inspeccion inspeccion) {
        inspeccionRepository.save(inspeccion);
    }

    public void crear(Inspeccion... inspeccions) {

        for (Inspeccion inspeccion : inspeccions) {
            inspeccionRepository.save(inspeccion);

        }
    }

    public List<Inspeccion> buscarTodas() {
        return inspeccionRepository.findAll();
    }

}
