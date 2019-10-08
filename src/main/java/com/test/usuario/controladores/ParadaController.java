package com.test.usuario.controladores;

import com.test.usuario.encapsulacion.Parada;
import com.test.usuario.encapsulacion.Usuario;
import com.test.usuario.servicios.ParadaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class ParadaController {

    private final ParadaService paradaService;

    public ParadaController(ParadaService paradaService) {
        this.paradaService = paradaService;
    }

    @GetMapping(value = "paradas", produces = "application/json")
    public ResponseEntity<List<Parada>> listar() {
        return new ResponseEntity<>(paradaService.buscarTodas(), HttpStatus.OK);
    }

    @RequestMapping(value = "parada/validar", method = RequestMethod.GET)
    public ResponseEntity<Parada> validar(@RequestParam("codigo") int codigo, @RequestParam("idMaquina") int maquina) {
        System.out.println("codigo: " + codigo + " maquina: " + maquina);
        Parada parada = paradaService.buscarPorCodigoParadaYIdMaquina(codigo, maquina);
        HttpStatus status = parada != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(parada, status);
    }
}
