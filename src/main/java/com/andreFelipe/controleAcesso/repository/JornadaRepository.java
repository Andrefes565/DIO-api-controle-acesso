package com.andreFelipe.controleAcesso.repository;

import com.andreFelipe.controleAcesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {

}
