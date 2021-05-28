package com.example.apicomunicacao.repository;

import com.example.apicomunicacao.models.Comunicado;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComunicadoRepository extends JpaRepository<Comunicado, Long> {
    
}
