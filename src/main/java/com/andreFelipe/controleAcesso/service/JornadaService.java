package com.andreFelipe.controleAcesso.service;

import com.andreFelipe.controleAcesso.model.JornadaTrabalho;
import com.andreFelipe.controleAcesso.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public  JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository =jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getByIdJornada(Long id) {
        return jornadaRepository.findById(id);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void deleteJornada(Long id) {
        jornadaRepository.deleteById(id);
    }



}
