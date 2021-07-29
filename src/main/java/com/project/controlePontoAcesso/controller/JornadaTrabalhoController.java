package com.project.controlePontoAcesso.controller;

import com.project.controlePontoAcesso.exceptions.NotFoundException;
import com.project.controlePontoAcesso.model.JornadaTrabalho;
import com.project.controlePontoAcesso.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho create(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.save(jornadaTrabalho);
    }

    @PutMapping
    public JornadaTrabalho update(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.update(jornadaTrabalho);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<JornadaTrabalho> delete(@PathVariable("id") Long id) throws Exception {
        try {
            ;
        } catch (Exception e){
            throw new NotFoundException();
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

    @GetMapping
    public ResponseEntity<List<JornadaTrabalho>> findAll(){
        return ResponseEntity.ok(jornadaTrabalhoService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<JornadaTrabalho> findById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.findById(id).orElseThrow(() -> new Exception("Jornada não existe.")));
    }

}
