package com.project.controlePontoAcesso.service;

import com.project.controlePontoAcesso.model.Empresa;
import com.project.controlePontoAcesso.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa save(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public Empresa update(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public void delete(Long id){
        empresaRepository.deleteById(id);
    }

    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }

    public Optional<Empresa> findById(Long id){
        return empresaRepository.findById(id);
    }
}
