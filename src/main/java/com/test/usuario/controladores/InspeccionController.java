package com.test.usuario.controladores;

import java.util.List;

import com.test.usuario.encapsulacion.Inspeccion;
import com.test.usuario.servicios.InspeccionService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
