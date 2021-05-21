package com.andreFelipe.controleAcesso.controller;

import com.andreFelipe.controleAcesso.model.JornadaTrabalho;
import com.andreFelipe.controleAcesso.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;


    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> getJornadaId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(jornadaService
                .getByIdJornada(id)
                .orElseThrow( () -> new NoSuchElementException("Not found!")));
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaService.findAll();
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Long id) throws Exception {
        try{
            jornadaService.deleteJornada(id);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }


}
