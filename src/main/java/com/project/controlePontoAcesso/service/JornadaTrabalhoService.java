package com.project.controlePontoAcesso.service;

import com.project.controlePontoAcesso.model.JornadaTrabalho;
import com.project.controlePontoAcesso.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    @Autowired                                              //anotação serve para instanciar o repository sem a necessidade do " = new... "
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void delete(Long id){
        jornadaTrabalhoRepository.deleteById(id);
    }

    public List<JornadaTrabalho> findAll(){
        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> findById(Long id){
        return jornadaTrabalhoRepository.findById(id);
    }
}
