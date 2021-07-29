package com.project.controlePontoAcesso.controller;

import com.project.controlePontoAcesso.model.NivelAcesso;
import com.project.controlePontoAcesso.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "nivel")
public class NivelAcessoController {
    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso create(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.save(nivelAcesso);
    }

    @PutMapping
    public void update(@RequestBody NivelAcesso nivelAcesso) {
        nivelAcessoService.save(nivelAcesso);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<NivelAcesso> delete(@PathVariable("id") Long id) throws Exception {
        try {
            nivelAcessoService.delete(id);
        } catch (Exception e) {
            System.out.println("Not found.");
        }
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();
    }

    @GetMapping
    public ResponseEntity<List<NivelAcesso>> findAll() {
        return ResponseEntity.ok(nivelAcessoService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<NivelAcesso> findById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(nivelAcessoService.findById(id).orElseThrow(() -> new Exception("Does not exists.")));
    }

}
