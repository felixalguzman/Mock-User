package com.test.usuario.controladores;

import com.test.usuario.encapsulacion.Parada;
import com.test.usuario.encapsulacion.Usuario;
import com.test.usuario.servicios.ParadaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "paradas")
public class ParadaController {

    private final ParadaService paradaService;

    public ParadaController(ParadaService paradaService) {
        this.paradaService = paradaService;
    }

    @CrossOrigin("*")
    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<List<Parada>> listar() {
        return new ResponseEntity<>(paradaService.buscarTodas(), HttpStatus.OK);
    }

    @RequestMapping(value = "validar", method = RequestMethod.POST)
    public ResponseEntity<Parada> validar(@RequestBody Parada parada) {
        Parada parada1 = paradaService.buscarPorCodigo(parada.getCodigoParada());
        HttpStatus status = parada1 != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(parada1, status);
    }
}
