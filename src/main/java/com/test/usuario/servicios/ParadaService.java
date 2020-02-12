package com.test.usuario.servicios;

import com.test.usuario.encapsulacion.Parada;
import com.test.usuario.repositorios.ParadaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParadaService {

    private final ParadaRepository paradaRepository;

    public ParadaService(ParadaRepository paradaRepository) {
        this.paradaRepository = paradaRepository;
    }

    public void crear(Parada parada) {
        paradaRepository.save(parada);
    }

    public void crear(Parada... paradas){
        for (Parada parada : paradas) {
            paradaRepository.save(parada);
        }
    }

    public List<Parada> buscarTodas() {
        return paradaRepository.findAll();
    }



    public Parada buscarPorCodigo(int codigo){
        return paradaRepository.findByCodigoParada(codigo).orElse(null);
    }
}
