package com.project.controlePontoAcesso.controller;

import com.project.controlePontoAcesso.model.Empresa;
import com.project.controlePontoAcesso.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/empresa")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa create(@RequestBody Empresa empresa){
        return empresaService.save(empresa);
    }

    @PutMapping
    public Empresa update(@RequestBody Empresa empresa){
        return empresaService.update(empresa);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Empresa> delete(@PathVariable("id") Long id) throws Exception{
        try {
            empresaService.delete(id);
        } catch (Exception e) {
            System.out.println("Not found.");
        }
        return (ResponseEntity<Empresa>) ResponseEntity.ok();
    }

    @GetMapping
    public ResponseEntity<List<Empresa>> findAll(){
        return ResponseEntity.ok(empresaService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Empresa> findById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(empresaService.findById(id).orElseThrow(() -> new Exception("Jornada não existe.")));
    }
}
