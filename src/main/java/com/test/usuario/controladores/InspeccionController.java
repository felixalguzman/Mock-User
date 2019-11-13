package com.test.usuario.controladores;

import com.test.usuario.encapsulacion.Inspeccion;
import com.test.usuario.encapsulacion.Parada;
import com.test.usuario.servicios.InspeccionService;
import com.test.usuario.servicios.ParadaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "inspeccion")
public class InspeccionController {

    private final InspeccionService inspeccionService;

    public InspeccionController(InspeccionService inspeccionService) {
        this.inspeccionService = inspeccionService;
    }

    @GetMapping(value = "todas", produces = "application/json")
    public ResponseEntity<List<Inspeccion>> listar() {
        return new ResponseEntity<>(inspeccionService.buscarTodas(), HttpStatus.OK);
    }

}
